package corpusrefiner.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.TokenNameFinderModel;
import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;
import opennlp.tools.util.InvalidFormatException;
import opennlp.tools.util.Span;

import org.apache.commons.io.FileUtils;

import corpusrefiner.model.CorpusRefinerDocument;
import corpusrefiner.model.CorpusRefinerSentence;
import corpusrefiner.model.CorpusRefinerToken;

public class OpenNlpDummyDocumentGenerator {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		File modelDir = new File("util/models/");
		File dummyTextsDir = new File("util/dummy-texts");

		SentenceModel sentModel = new SentenceModel(new FileInputStream(new File(modelDir, "en-sent.bin")));
		SentenceDetectorME sentenceDetector = new SentenceDetectorME(sentModel);
		TokenizerModel tokenModel = new TokenizerModel(new FileInputStream(new File(modelDir, "en-token.bin")));
		Tokenizer tokenizer = new TokenizerME(tokenModel);
		Set<NameFinderME> nameFinders = new HashSet<NameFinderME>();
		String[] nerTypes = { "person", "organization", "location" };
		for (String nerType : nerTypes) {
			TokenNameFinderModel nerModel = new TokenNameFinderModel(new FileInputStream(new File(modelDir, "en-ner-"
					+ nerType + ".bin")));
			NameFinderME nameFinder = new NameFinderME(nerModel);
			nameFinders.add(nameFinder);
		}

		System.out.println("List<CorpusRefinerDocument> documents;");
		System.out.println("List<CorpusRefinerSentence> sentences;");
		System.out.println("List<CorpusRefinerToken> tokens;");
		System.out.println("List<CorpusRefinerEntity> entities;");
		System.out.println("List<Integer> entityTokens;");
		for (File file : dummyTextsDir.listFiles()) {
			System.out.println("documents = new ArrayList<CorpusRefinerDocument>();");
			String filename = file.getName();
			String content = FileUtils.readFileToString(file);
			Span[] sentenceSpans = sentenceDetector.sentPosDetect(content);
			System.out.println("sentences = new ArrayList<CorpusRefinerSentence>();");
			for (Span sentenceSpan : sentenceSpans) {
				int sentenceStart = sentenceSpan.getStart();
				int sentenceEnd = sentenceSpan.getEnd();
				String sentenceText = content.substring(sentenceStart, sentenceEnd);
				Span[] tokenSpans = tokenizer.tokenizePos(sentenceText);
				String[] tokens = new String[tokenSpans.length];
				int tokenCount = 0;
				System.out.println("tokens = new ArrayList<CorpusRefinerToken>();");
				for (Span tokenSpan : tokenSpans) {
					int tokenStart = sentenceStart + tokenSpan.getStart();
					int tokenEnd = sentenceStart + tokenSpan.getEnd();
					System.out.printf("tokens.add(new CorpusRefinerToken(%d, %d));\n", tokenStart, tokenEnd);
					tokens[tokenCount++] = content.substring(tokenStart, tokenEnd);
				}
				System.out.println("entities = new ArrayList<CorpusRefinerEntity>();");
				for (NameFinderME nameFinder : nameFinders) {
					Span nameSpans[] = nameFinder.find(tokens);
					for (Span nameSpan : nameSpans) {
						System.out.println("entityTokens = new ArrayList<Integer>();");
						for (int i = nameSpan.getStart(); i < nameSpan.getEnd(); i++) {
							System.out.printf("entityTokens.add(%d); // %s\n", i, tokens[i]);
						}
						System.out.printf("entities.add(new CorpusRefinerEntity(\"%s\", entityTokens));\n",
								nameSpan.getType());
					}
				}
				System.out.printf(
						"sentences.add(new CorpusRefinerSentence(%d, %d, \"%s-s-%d-%d\", tokens, entities));\n",
						sentenceStart, sentenceEnd, filename, sentenceStart, sentenceEnd);
			}
			System.out.printf("documents.add(new CorpusRefinerDocument(\"%s\", \"%s\", sentences));\n", filename,
					content.replaceAll("\"", "\\\\\"").replaceAll("\n", "\\\\n"));
		}
	}
}
