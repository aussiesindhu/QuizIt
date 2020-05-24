package quizIt.api;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Quizdata {
	
	@Id
	ObjectId Id;
	
	String Q;
	String C[] = new String[4];
	String A;
	String L;
	String T;
	
	public Quizdata() {
		super();
	}
	public Quizdata(String q, String[] c, String a, String l, String t) {
		super();
		System.out.println(q);
		Q = q;
		C = c;
		A = a;
		L = l;
		T = t;
	}
	
	public ObjectId getId() {
		return Id;
	}
	public void setId(ObjectId id) {
		Id = id;
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
		int i=0;
		for(String c1:c)
		{
			C[i++]=c1;
		}
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
