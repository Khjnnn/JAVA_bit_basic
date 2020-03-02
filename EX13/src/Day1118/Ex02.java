package Day1118;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner mS = new Scanner(System.in);
		//반복구문 찾는다.
		// 조건은 캐치 문을 수행하면 다시 수행한다.
		// 
		int tt=0;
		boolean isError = false;
		isError = true; 
		while(isError) {
		try {
			isError = false; 
			tt = mS.nextInt();			
		} catch (Exception e) {
			isError = true;
			System.out.println("다쉬 입력하세요");
			tt = mS.nextInt();
			System.out.println("@@@");
			System.out.println("Error code: "+ e);
			
		}
	}
}
}
