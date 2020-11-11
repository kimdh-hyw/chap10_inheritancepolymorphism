package sec05_superkeywordsupermethod.EX03_SuperMethod_1;

/*super() 메서드의 기능 및 컴파일러에 의한 자동추가 super()*/

class A{
	A(){
		System.out.println("A 생성자");
	}
}
class B extends A{
	B(){
		super(); //생략시 컴파일러가 자동 추가 (부모클래스의 생성자 호출)
		System.out.println("B 생성자");
	}
}
class C {
	C(int a){
		System.out.println("C 생성자");
	}
}
class D extends C {
	/* 컴파일러가 자동으로 추가해주는 내용
	D(){         
		super(); 
	}            
	*/
	D(){
		super(3);
	}
}

public class SuperMethod_1 {
	public static void main(String[] args) {
		//#1. A 객체 생성
		A aa = new A();
		System.out.println(); // A 생성자	
	
		//#2. B 객체 생성
		B bb = new B(); // A 생성자 -> B 생성자
	}
}
