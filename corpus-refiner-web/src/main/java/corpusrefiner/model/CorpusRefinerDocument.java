package corpusrefiner.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CorpusRefinerDocument {

	private String id;
	private String text;
	private List<CorpusRefinerSentence> sentences;

	public CorpusRefinerDocument() {
	}

	public CorpusRefinerDocument(String id, String text, List<CorpusRefinerSentence> sentences) {
		this.id = id;
		this.text = text;
		this.sentences = sentences;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<CorpusRefinerSentence> getSentences() {
		return this.sentences;
	}

	public void setSentences(List<CorpusRefinerSentence> sentences) {
		this.sentences = sentences;
	}

}
