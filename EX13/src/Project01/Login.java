package Project01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Login {

		   public static void main(String[] args) {

		      // TODO Auto-generated method stub
		      Scanner sc = new Scanner(System.in);
		      System.out.println("�޴��� �Է��ϼ���");
		      System.out.println("1. �α���(1) 2. �α׾ƿ�(2) 3. ���̵����(3) 4. ���̵����(4)");
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


		      if (choice == 1) { // 1�� �α����� �������� ���
		         System.out.println("ID�� PW�� �Է� �ϼ���.");
		         id1 = sc.next();
		         pw1 = sc.next();

		         for (int i = 0; i < 5; i++) {

		            if (idArray[i].equals(id1)) {
		               if (pwArray[i].equals(pw1)) {
		                  System.out.println("�α��� �Ǿ����ϴ�.");

		                  if (idArray[i].charAt(0) == 'A') { // 'A' ��� ���ĺ��� ù��°�� ������ �����ڷ� �α���
		                     if (idArray[i].equals(id1)) {
		                        System.out.println("�����ڷ� �α��� �Ǿ����ϴ�.");

		                     }
		                  }
		               } else {
		                  System.out.println("���̵�� ��й�ȣ�� �ٽ� Ȯ�����ּ���."); // ���̵�� ��й�ȣ�� Ʋ�Ƚ��ϴ�(if ������ �߸���Ƽ� ��� ��й�ȣ�� Ʋ�Ƚ��ϴ� ������
		                  // ����� �ȉ���)

		               }

		            }

		         }
		      }
		      if (choice == 2) {
		         System.out.println("�α׾ƿ� �Ǿ����ϴ�.");

		      }
		      if (choice == 3) {
		         System.out.println("ID��PW�� �Է����ּ���.");
		         id1 = sc.next();
		         pw1 = sc.next();

		         int j = 0;

		         for (int i = 0; i < 5; i++) {
		            if (idArray[i].charAt(0) == 'A') {
		               if (idArray[i].equals(id1)) {
		                  if (pwArray[i].equals(pw1)) {
		                     System.out.println("�����ڷ� �α��� �Ͽ����ϴ�.");
		                  } else {
		                     System.out.println("���̵�� ��й�ȣ�� �ٽ� Ȯ�����ּ���.");
		                  }
		               }
		            }
		         }

		         System.out.println("ID�� ������ �ּ���");
		         id2 = sc.next();

		         do {
		            for (int k = 0; k < 5; k++) {
		               if (idArray[k].equals(id2)) {
		                  System.out.println("ID�ߺ� �Դϴ�.");
		                  id2 = sc.next();
		               } else {
		                  System.out.println("ID���� �Ǿ����ϴ�.");
		                  j = 1;
		                  break; //ID �����Ǿ����ϴ� ��� �ݺ� ��µǼ� break ���� ����.
		               }
		            }   

		         }while (j==0);




		      }
		      if(choice==4) {
		         System.out.println("������ ID�� �Է��ϼ���.");
		         id3=sc.next();
		         id.remove(id3);
		         System.out.println("���̵� ���� �Ǿ����ϴ�.");
		      }
		      
		      char [] pwlist2=new char [5];
		      if(choice==5) {
		         System.out.println("���� �Է��ϼ���.");
		         code1 =sc.next();
		         
		         for(int y =0; y<5; y++) {
		            if(codeArray[y].equals(code1)) {
		               System.out.println("�����Դϴ�.���ο� ��й�ȣ�� ���� �ϰڽ��ϴ�.");
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
		               System.out.println("���ο� ��й�ȣ��:"+a);
		               break;
		               
		            } else { 
		               System.out.println("���� Ʋ�Ƚ��ϴ�");
		               break;
		            }
		                
		            }
		         } 


		      }
		   
}
