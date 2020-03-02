package Day6;

public class Ex02 extends A { // 자식 (상위 집합)
// 상속 (extends) 
// 동등한 이름이면 안됨 ()
//	A mA = new A(); 
//	mA.func(); < A클래스(부모) 탐
//	B mB = new B();
//	mB.func(); < B클래스 탐(자식)
//	상속변수 가져올수 있는 (Super)   
// 오버라이딩 >> 상속에서 함수이름도 매개변수도 같을 때 덮어씌워 사용하는것
	
//  접근제어자 ///
//	public 누구나 / private : 아무도 접근 불가
//	protected : 상속(같은파일 안)받은 클래스만 접근 가능 
//	
//	싱글톤 : 자기자신이 메모리 할당 / 디자인패턴 
//	추상클래스 / 추상메소드(abstract) : 상속 후 추상메소드 재정의 (변수X) > 인터페이스(상속여러개가능/정의해서)
//				ㄴ 추상메소드 부분을 상속받은 뒤 재정의 해야 사용가능 **
//	implements A,B =>> 인터페이스 (상속과 다름/여러개 가능)
//	
//	
//	
	int a = 2;
}

class A { // 부모(하위)
 int a = 1;
 int b = 3;
	
}
class C {
	public static void main(String[] args) {
		A mA = new A();
		Ex02 mB = new Ex02();
		
		System.out.println(mA.b);
		System.out.println(mB.a);
	}
	
	

	
	
}