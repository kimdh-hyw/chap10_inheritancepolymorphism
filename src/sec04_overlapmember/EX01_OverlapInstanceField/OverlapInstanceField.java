package sec04_overlapmember.EX01_OverlapInstanceField;

/*인스턴스 필드의 중복*/

class A {
	int m = 3;
}
class B extends A {
	int m = 4;
}
public class OverlapInstanceField {	
	public static void main(String[] args) {
		//#1. 객체생성
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		//#2. 인스턴스 필드
		System.out.println(aa.m); //3		
		System.out.println(bb.m); //4
		System.out.println(ab.m); //3
	}
}

