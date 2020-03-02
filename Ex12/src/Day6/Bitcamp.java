package Day6;

import java.util.Scanner;

// 

public class Bitcamp {
	String name = "";
	boolean sex = false ;
	int age = 0;
	boolean check = false;
	String c() {
		if(check == true) {
		    return "출석";
		} else { 
			return "결석";
		}
			
	}
public static class Check {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Bitcamp st = new Bitcamp();
	System.out.println(" 이름 : ");
	st.name = sc.nextLine();
	System.out.println(" 나이 : ");
	st.age = sc.nextInt();
	
	System.out.println(" 출석 현황 입력 (true/false) ");
	st.check = sc.nextBoolean();
	
	
	System.out.println(st.name + " 학생은 오늘 " + st.c() + "하였습니다.");
			
	
	}	
	}	

}
