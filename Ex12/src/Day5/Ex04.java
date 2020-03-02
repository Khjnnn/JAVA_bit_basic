package Day5;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] b = new int [5];
		int [] arr = new int [5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("숫자를 입력하세요");
			arr[i] = scan.nextInt();
		    
			if (arr[i]%3==0) 
				b[i] = arr[i];		    
		    
		} for(int i=0; i<b.length; i++) {
			if (b[i]==0 ) { 
				System.out.print("");	
			} else {
			System.out.print(b[i]+" ");}
		}
	}
}
