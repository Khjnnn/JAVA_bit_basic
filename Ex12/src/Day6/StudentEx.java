package Day6;

import java.util.Scanner;

public class StudentEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student mS = new Student();
		mS.name = "����� 1" ;
		mS.math = 30;
		mS.kor = 60;
		mS.eng = 50;
		
		System.out.println("����");
		System.out.println("������ : "+ mS.total());
		System.out.println("����� : "+ mS.avg());
		
		
		
	}	
	
	
}
/*
 * public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Day[] mDay = new Day[10000];
			
			Scanner mS = new Scanner(System.in);
			
			//�л����� �Է� mS.nextInt();
			for(int i =0; i< mDay.length; i++) {
				
				mDay[i] = new Day();
				System.out.println((i +1) + "��° �л� ����");
				System.out.println("name : ");
				mDay[i].name =mS.next(); 
				System.out.println("score : ");
				mDay[i].score =mS.nextInt(); 
			}
			
			for(int i =0; i< mDay.length; i++) {
				System.out.println((i +1) + "��° �л� ���� : " +mDay[i].name + "  score : " +mDay[i].score );

			}
			/*
			Student s =new Student("ȫ�浿",1,1,100,60,76);
			System.out.println(s.info());

*/