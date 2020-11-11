package sec03_methodoverriding.EX03_MethodOverriding_3;

/*메서드 오버라이딩 vs. 메서드 오버로딩*/

class A {
	void print1() {
		System.out.println("A 클래스 print1");
	}
	void print2() {
		System.out.println("A 클래스 print2");
	}
}
class B extends A {
	@Override
	void print1() {
		System.out.println("B 클래스 print1");
	}
	void print2(int a) {
		System.out.println("B 클래스 print2");
	}
}
public class MethodOverriding_3 {
	public static void main(String[] args) {		
		//#1. A 타입 선언 / A 생성자 사용
		A aa = new A();
		aa.print1(); //A 클래스 print1
		aa.print2(); //A 클래스 print2
		System.out.println();
		
		//#2. B 타입 선언 / B 생성자 사용
		B bb = new B();
		bb.print1(); // B 클래스 print1
		bb.print2(); // A 클래스 print2
		bb.print2(3);// B 클래스 print2
		System.out.println();
		
		//#3. A 타입 선언 / B 생성자 사용
		A ab = new B();
		ab.print1(); //B 클래스 print1
		ab.print2(); //A 클래스 print2
	}
}


























