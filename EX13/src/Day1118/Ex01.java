package Day1118;

import java.util.ArrayList;

public class Ex01 {
	int num = 0;
	String name = "";
	int price = 0;
	
	Ex01 () {
	 
	}
	
	// 쓰레드 (예외처리) - 알고있는에러 > 예외(Exeption)   
	// 
	// try { int a= mS.nextint() } catch(예외코드)  {    } // Error 발생 잡아야함 (catch) 
	// 예외코드 : (Exception e)익셉션오류 전체 다 
    // 
}

class Main {
	
	public static void main(String[] args, ArrayList arr) {
//		
		Ex01 arr1 = new Ex01();
		ArrayList<Ex01>list = new ArrayList<>();
		Ex01 num1 = new Ex01();
		list.add(num1);
		list.add(new Ex01());
		System.out.println(list);
		System.out.println("리스트 출력");
		arr1.num =1;
		arr1.name = "이";
		arr1.price = 2300;
		arr1.num = 2;
		arr1.num = 3;
		System.out.println(arr1.name);
		System.out.println(arr1.getClass());
		
		
		
		
	}
}