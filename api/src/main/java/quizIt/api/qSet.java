package quizIt.api;

public class qSet {
	String Q;
	String[] C = new String[4];
	public String getQ() {
		return Q;
	}
	public void setQ(String q) {
		Q = q;
	}
	public String[] getC() {
		return C;
	}
	public void setC(String[] c) {
		C = c;
	}
	public qSet(String q, String[] c) {
		super();
		Q = q;
		C = c;
	}
	
	
}
