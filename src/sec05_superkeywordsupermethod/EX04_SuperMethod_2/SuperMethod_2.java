package sec05_superkeywordsupermethod.EX04_SuperMethod_2;

class A{
	A(){
		this(3);
		System.out.println("A 생성자 1");
	}
	A(int a){
		System.out.println("A 생성자 2");
	}
}

class B extends A{	
	B(){
		this(3);
		System.out.println("B 생성자 1");
	}
	B(int a){
		System.out.println("B 생성자 2");
	}
}


public class SuperMethod_2 {
	public static void main(String[] args) {
		//#1. A 객체 생성
		A aa1 = new A(); //A 생성자 2 A 생성자 1
		A aa2 = new A(3); //A 생성자 2
		
		//#2. B 객체 생성
		B bb1 = new B(); //A 생성자 2 A 생성자 1 B 생성자 2 B 생성자 1
		B bb2 = new B(3);//A 생성자 2 A 생성자 1 B 생성자 2
	}

}























