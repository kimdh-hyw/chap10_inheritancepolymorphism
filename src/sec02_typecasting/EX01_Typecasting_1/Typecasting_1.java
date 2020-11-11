package sec02_typecasting.EX01_Typecasting_1;

/*클래스의 업캐스팅 및 다운캐스팅*/

//# 클래스의 상속관계
class A {}
class B extends A{}
class C extends B{}
class D extends B{}

public class Typecasting_1 {
	public static void main(String[] args) {		
		//#1. 업캐스팅 (자동변환): 생략시 컴파일러가 자동 추가
		A ac = (A)new C(); // C->A 업캐스팅 (자동변환)
		B bc = (B)new C(); // C->B 업캐스팅 (자동변환)
		
		B bb = new B();
		A a = (A)bb; //B->A 업캐스팅 (자동변환)
		
		//#2-1. 다운캐스팅 (수동변환) : 캐스팅이 불가능한 경우 (실행시 예외발생)
		A aa = new A();
//		B b = (B)aa; //A->B 다운캐스팅 (수동변환)
//		C c = (C)aa; //A->C 다운캐스팅 (수동변환)
		
		//#2-2. 다운캐스팅 (수동변환) : 캐스팅이 가능한 경우 
		A ab = new B();
		B b = (B)ab; //A->B 다운캐스팅 (수동변환)
//		C c = (C)ab; //A->C 다운캐스팅 (수동변환) : 불가능
		
		B bd = new D();
		D d = (D)bd; //B->D 다운캐스팅 (수동변환)
		
		A ad = new D();
		B b1 = (B)ad; //A->B 다운캐스팅 (수동변환)
		D d1 = (D)ad; //A->D 다운캐스팅 (수동변환)				
	}
}
