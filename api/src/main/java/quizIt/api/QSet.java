package quizIt.api;

public class QSet {
	String Q;
	String[] C = new String[4];
	String A;
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
	public String getA() {
		return A;
	}
	public void setA(String a) {
		A = a;
	}
	public QSet(String q, String[] c, String a) {
		super();
		Q = q;
		C = c;
		A = a;
	}
	
	
}
