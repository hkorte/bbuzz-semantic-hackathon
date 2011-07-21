package corpusrefiner.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CorpusRefinerSentence extends CorpusRefinerAnnotation {

	private String id;
	private List<CorpusRefinerToken> tokens;
	private List<CorpusRefinerEntity> entities;

	public CorpusRefinerSentence() {
	}

	public CorpusRefinerSentence(int begin, int end, String id, List<CorpusRefinerToken> tokens,
			List<CorpusRefinerEntity> entities) {
		super(begin, end);
		this.id = id;
		this.tokens = tokens;
		this.entities = entities;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<CorpusRefinerToken> getTokens() {
		return this.tokens;
	}

	public void setTokens(List<CorpusRefinerToken> tokens) {
		this.tokens = tokens;
	}

	public List<CorpusRefinerEntity> getEntities() {
		return this.entities;
	}

	public void setEntities(List<CorpusRefinerEntity> entities) {
		this.entities = entities;
	}

}
