package Day1118;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner mS = new Scanner(System.in);
		//�ݺ����� ã�´�.
		// ������ ĳġ ���� �����ϸ� �ٽ� �����Ѵ�.
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
			System.out.println("�ٽ� �Է��ϼ���");
			tt = mS.nextInt();
			System.out.println("@@@");
			System.out.println("Error code: "+ e);
			
		}
	}
}
}
