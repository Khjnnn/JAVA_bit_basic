package Day6;

public class Ex01 {
	public static void main(String[] args) {
		
	
	// 함수이름이 같아도 매개변수 타입,갯수 다르면 다른것으로 인식> 사용가능 (오버로딩)
	// 매개변수=파라미터 ()  
	// 클래스 이름과 동등한 이름을 가진 > 생성자 (생성되었을 때 탐 )
   // 함수이름 같은데 매개변수 갯수나 타입이 다를때 사용가능한 방법 (오버로딩)
		
		Day[] mDay = new Day[3];
		//mDay[3] = new Day();
		
		int j = 3;
		for(int i = j ; j > 1 ; ) {
			i = i*(j-1);
			j--;
			System.out.println(i);
		}	
	}
		Day na = new Day();
	
}

class Day {
	int n = 10;
	int b = 0;
	static int bb = 1 ;
	
	int Day[] ;
	
	// 생성자: 생성할때만 탄다. / 따로 불러줄 수 없다
	Day(){
		System.out.println("day1 ....");
	}
	 
	{
	 //초기화구문(초기화블럭) 생성자 생성(초기화) 해서 씀 
		n = 1;
		b = 3;
		bb = 2; //
	}
	static { //스태틱만 가능 // 안씀 
		bb = 3; 
	}
	static int B (int b) {
		if (b>=1 ) {
			return B(b+b) + b;
		} else {
		return b;
		}
	}
	int A (int n) { // factorial() 
		
		if ( n <= 1 ) {
			return n;
			// A(1);//* 재귀함수 (무한루프)
		} else { 
			return A (n-1) * n ;
			 
		}
		
	}
	
}
