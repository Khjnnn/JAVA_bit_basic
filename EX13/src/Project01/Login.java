package Project01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Login {

		   public static void main(String[] args) {

		      // TODO Auto-generated method stub
		      Scanner sc = new Scanner(System.in);
		      System.out.println("메뉴를 입력하세요");
		      System.out.println("1. 로그인(1) 2. 로그아웃(2) 3. 아이디생성(3) 4. 아이디삭제(4)");
		      int choice = sc.nextInt();

		      int choice1 = 1; // 
		      int choice2 = 2;
		      int choice3 = 3;
		      int choice4 = 4;
		      int choice5 = 5;

		      String[] idArray = {"1111", "2222", "3333", "4444", "A5555"};
		      String[] pwArray = {"1234", "5678", "9876", "5432", "1111"};
		      String[] codeArray = {"abcd","defg", "hrg", "gggg", "kkk"};

		      ArrayList<String> id = new ArrayList<>(Arrays.asList(idArray));
		      ArrayList<String> pw = new ArrayList<>(Arrays.asList(pwArray));
		      ArrayList<String> code = new ArrayList<>(Arrays.asList(codeArray));

		      String id1 = "";
		      String pw1 = "";
		      String id2 = "";
		      String pw2 = "";
		      String id3 = "";
		      String code1 = "";


		      if (choice == 1) { // 1번 로그인을 선택했을 경우
		         System.out.println("ID와 PW를 입력 하세요.");
		         id1 = sc.next();
		         pw1 = sc.next();

		         for (int i = 0; i < 5; i++) {

		            if (idArray[i].equals(id1)) {
		               if (pwArray[i].equals(pw1)) {
		                  System.out.println("로그인 되었습니다.");

		                  if (idArray[i].charAt(0) == 'A') { // 'A' 라는 알파벳이 첫번째에 붙으면 관리자로 로그인
		                     if (idArray[i].equals(id1)) {
		                        System.out.println("관리자로 로그인 되었습니다.");

		                     }
		                  }
		               } else {
		                  System.out.println("아이디와 비밀번호를 다시 확인해주세요."); // 아이디와 비밀번호가 틀렸습니다(if 범위를 잘못잡아서 계속 비밀번호가 틀렸습니다 문구가
		                  // 출력이 안됬음)

		               }

		            }

		         }
		      }
		      if (choice == 2) {
		         System.out.println("로그아웃 되었습니다.");

		      }
		      if (choice == 3) {
		         System.out.println("ID와PW를 입력해주세요.");
		         id1 = sc.next();
		         pw1 = sc.next();

		         int j = 0;

		         for (int i = 0; i < 5; i++) {
		            if (idArray[i].charAt(0) == 'A') {
		               if (idArray[i].equals(id1)) {
		                  if (pwArray[i].equals(pw1)) {
		                     System.out.println("관리자로 로그인 하였습니다.");
		                  } else {
		                     System.out.println("아이디와 비밀번호를 다시 확인해주세요.");
		                  }
		               }
		            }
		         }

		         System.out.println("ID를 생성해 주세요");
		         id2 = sc.next();

		         do {
		            for (int k = 0; k < 5; k++) {
		               if (idArray[k].equals(id2)) {
		                  System.out.println("ID중복 입니다.");
		                  id2 = sc.next();
		               } else {
		                  System.out.println("ID생성 되었습니다.");
		                  j = 1;
		                  break; //ID 생성되었습니다 계속 반복 출력되서 break 으로 멈춤.
		               }
		            }   

		         }while (j==0);




		      }
		      if(choice==4) {
		         System.out.println("삭제할 ID를 입력하세요.");
		         id3=sc.next();
		         id.remove(id3);
		         System.out.println("아이디가 삭제 되었습니다.");
		      }
		      
		      char [] pwlist2=new char [5];
		      if(choice==5) {
		         System.out.println("답을 입력하세요.");
		         code1 =sc.next();
		         
		         for(int y =0; y<5; y++) {
		            if(codeArray[y].equals(code1)) {
		               System.out.println("정답입니다.새로운 비밀번호를 배정 하겠습니다.");
		               char [] pwlist = new char [94]; 

		               for(int i=33; i<126; i++) { 

		                  pwlist[i-33] =(char)(i);
		               }
		               
		               char temp ='0';
		               int j1 =0;
		               int j2 =0;
		               int j3 =0;
		               int j4 =0;
		               

		               String a ="";
		               for(int i =0; i<10000; i++) {
		                  j1 = (int)(Math.random()*94);
		                  j2= (int)(Math.random()*94);
		                  j3 = (int)(Math.random()*94);
		                  j4 = (int)(Math.random()*94);
		                  
		                  pwlist[0] = pwlist[j1];
		                  pwlist[1] = pwlist[j2];
		                  pwlist[2] = pwlist[j3];
		                  pwlist[3] = pwlist[j4];
		                  
		               }
		               for(int i =0; i<5; i++) {

		                  a +=pwlist[i];
		               }
		               System.out.println("새로운 비밀번호는:"+a);
		               break;
		               
		            } else { 
		               System.out.println("답이 틀렸습니다");
		               break;
		            }
		                
		            }
		         } 


		      }
		   
}
