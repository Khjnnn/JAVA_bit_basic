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
		    return "�⼮";
		} else { 
			return "�Ἦ";
		}
			
	}
public static class Check {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Bitcamp st = new Bitcamp();
	System.out.println(" �̸� : ");
	st.name = sc.nextLine();
	System.out.println(" ���� : ");
	st.age = sc.nextInt();
	
	System.out.println(" �⼮ ��Ȳ �Է� (true/false) ");
	st.check = sc.nextBoolean();
	
	
	System.out.println(st.name + " �л��� ���� " + st.c() + "�Ͽ����ϴ�.");
			
	
	}	
	}	

}
