package corpusrefiner.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CorpusRefinerEntity {

	private String label;
	private List<Integer> tokens;

	public CorpusRefinerEntity() {
	}

	public CorpusRefinerEntity(String label, List<Integer> tokens) {
		this.label = label;
		this.tokens = tokens;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<Integer> getTokens() {
		return this.tokens;
	}

	public void setTokens(List<Integer> tokens) {
		this.tokens = tokens;
	}

}
