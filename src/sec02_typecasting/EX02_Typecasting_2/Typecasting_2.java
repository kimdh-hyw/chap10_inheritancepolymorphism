package sec02_typecasting.EX02_Typecasting_2;

/*선언타입에 따른 사용가능한 멤버*/

class A {
	int m=3;
	void abc() {
		System.out.println("A 클래스");
	}
}
class B extends A {
	int n=4;
	void bcd() {
		System.out.println("B 클래스");
	}
}
public class Typecasting_2 {
	public static void main(String[] args) {		
		//#1. A 타입   / A 생성자
		A aa = new A();
		System.out.println(aa.m);
		aa.abc();
		
		//#2. B 타입 / B 생성자
		B bb = new B();
		System.out.println(bb.m);
		System.out.println(bb.n);
		bb.abc();
		bb.bcd();
		
		//#3. A 타입 / B 생성자 : 다형적 표현
		A ab = new B();
		System.out.println(ab.m);
		ab.abc();
	}
}


















