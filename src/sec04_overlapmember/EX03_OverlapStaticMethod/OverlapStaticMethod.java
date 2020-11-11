package sec04_overlapmember.EX03_OverlapStaticMethod;

/*정적 메서드의 중복*/

class A{
	static void print() {
		System.out.println("A 클래스");
	}
}
class B extends A{
	static void print() {
		System.out.println("B 클래스");
	}
}
public class OverlapStaticMethod {
	public static void main(String[] args) {
		//#1. 클래스 이름으로 바로 접근
		A.print(); //A 클래스 
		B.print(); //B 클래스
		System.out.println();
		
		//#2. 객체 생성
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		//#3. 객체를 통한 메서드 호출
		aa.print(); //A 클래스 
		bb.print(); //B 클래스
		ab.print(); //A 클래스 		
	}
}
