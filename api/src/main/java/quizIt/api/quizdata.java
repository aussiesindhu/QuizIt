package quizIt.api;

import org.springframework.data.annotation.Id;

public class quizdata {
	
	@Id
	String id;
	
	String Q;
	String C[] = new String[4];
	String A;
	String L;
	String T;
	
	public quizdata() {
		super();
	}
	public quizdata(String q, String[] c, String a, String l, String t) {
		super();
		Q = q;
		C=c;
			
		A = a;
		L = l;
		T = t;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public String getL() {
		return L;
	}
	public void setL(String l) {
		L = l;
	}
	public String getT() {
		return T;
	}
	public void setT(String t) {
		T = t;
	}
	
}
