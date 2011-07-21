package corpusrefiner.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CorpusRefinerAnnotation {

	private int begin;
	private int end;

	public CorpusRefinerAnnotation() {
	}

	public CorpusRefinerAnnotation(int begin, int end) {
		this.begin = begin;
		this.end = end;
	}

	public int getBegin() {
		return this.begin;
	}

	public void setBegin(int begin) {
		this.begin = begin;
	}

	public int getEnd() {
		return this.end;
	}

	public void setEnd(int end) {
		this.end = end;
	}
}
