package sec06_objectclass.EX03_ObjectMethod_hashcode;

/*Object 클래스의 hashCode() 메서드*/

import java.util.HashMap;

class A {
	String name;
	A(String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((A)obj).name) {
			return true;
		} else 
			return false;
	}	
	@Override
	public String toString() {	
		return name;
	}
}
class B {
	String name;
	B(String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((B)obj).name) {
			return true;
		} else 
			return false;
	}
	@Override
	public int hashCode() {		
		return name.hashCode();
	}
	@Override
	public String toString() {	
		return name;
	}
}
public class ObjectMethod_hashcode {
	public static void main(String[] args) {		
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "데이터1");
		hm1.put(1, "데이터2");
		hm1.put(2, "데이터3");
		System.out.println(hm1);
		
		HashMap<A, String> hm2 = new HashMap<>();
		hm2.put(new A("첫번째"), "데이터1");
		hm2.put(new A("첫번째"), "데이터2");
		hm2.put(new A("두번째"), "데이터3");
		System.out.println(hm2);
		
		HashMap<B, String> hm3 = new HashMap<>();
		hm3.put(new B("첫번째"), "데이터1");
		hm3.put(new B("첫번째"), "데이터2");
		hm3.put(new B("두번째"), "데이터3");
		System.out.println(hm3);		
	}
}























