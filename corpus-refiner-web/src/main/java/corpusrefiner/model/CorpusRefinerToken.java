package corpusrefiner.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CorpusRefinerToken extends CorpusRefinerAnnotation {

	public CorpusRefinerToken() {
	}

	public CorpusRefinerToken(int begin, int end) {
		super(begin, end);
	}

}
