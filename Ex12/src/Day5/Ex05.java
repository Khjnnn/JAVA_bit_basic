package Day5;
// C언어 - 구조체 
class A {
	String name;
	int age ;
	
	int [] score;
}
public class Ex05 {
	static int test = 7; // 메모리상 들어가있는 변수 -> 클래스변수
	//	 클래스이름.클래스변수 => 와같이 사용가능  Ex05.test 
	
	
	int i = 0; // 멤버변수 
	// 
	///////////////////////////////////
	public static void main(String[] args) {

		
		Ex05 m = new Ex05();
		int a = 9;
		 a = m.sum(a,2);
		 //test=10;
		 System.out.println("Ex05=");
		 System.out.println(Ex05.test);
		 System.out.println("테스트");
		System.out.println(test);
		
		System.out.println(a);		 
	}
	///////////////////////////////////
	int sum(int test , int b) {
		System.out.println("아래테스트");
		System.out.println(Ex05.test);
		
		System.out.println(test);
		return test+b ;
	 }
}
// 매개변수 = 입력값; (없을수도있다) //출력값=리턴값 ;      
// static (정적메모리) : 선언 시 공간생성
// int f (int a, int b) { return 1 ;}
// 