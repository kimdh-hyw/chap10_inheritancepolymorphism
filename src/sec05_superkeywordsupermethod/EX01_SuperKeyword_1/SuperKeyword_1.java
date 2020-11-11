package sec05_superkeywordsupermethod.EX01_SuperKeyword_1;

/*멤버 앞에 참조변수를 생략(this.)하는 경우의 메서드 호출*/

class A {
	void abc() {
		System.out.println("A 클래스의 abc()");
	}
}
class B extends A{	
	void abc() {
		System.out.println("B 클래스의 abc()");
	}
	void bcd() {
		abc(); //this.abc();
	}
}
public class SuperKeyword_1 {	
	public static void main(String[] args) {
		//#1. 객체 생성
		B bb = new B();
		
		//#2. 메서드 호출
		bb.bcd(); //B 클래스의 abc()
	}
}
