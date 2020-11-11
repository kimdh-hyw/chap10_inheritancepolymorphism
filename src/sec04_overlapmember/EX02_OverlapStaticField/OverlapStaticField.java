package sec04_overlapmember.EX02_OverlapStaticField;

/*정적 필드의 중복*/

class A {
	static int m = 3;
}
class B extends A {
	static int m = 4;
}
public class OverlapStaticField {
	public static void main(String[] args) {		
		//#1.클래스 이름으로 바로 접근
		System.out.println(A.m); //3
		System.out.println(B.m); //4
		System.out.println();
		
		//#2.객체 생성
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		//#3. 객체 생성을 통한 static field
		System.out.println(aa.m); //3		
		System.out.println(bb.m); //4
		System.out.println(ab.m); //3
	}
}
