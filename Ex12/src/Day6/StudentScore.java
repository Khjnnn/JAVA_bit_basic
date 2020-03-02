package Day6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentScore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0; // �޴� ���� ��ȣ
		int j = 0; // �л� ��
		int stu = 0; // ���Ź��� ��ü �л���
		int i = 0; //
		int c = 0; // �߰����� �л���

		String choiceName = ""; // �������⿡ �ʿ��� �̸���

		Student[] score = new Student[10000];
		Subject01[] sub = new Subject01[10000]; // �߰� ���� (�������̵� Ŭ����)

		// �л��� �Է��Ͽ� �迭ũ�� ���� / Ŭ������ �迭�� ����
		
		

		while (true) {

			System.out.println("=================== ���� ���� ���α׷� ======================");
			System.out.println(" ���ϴ� �޴��� ��ȣ�� �Է��ϼ���. ");
			System.out.println(" 1. ���� �Է�  2. ���� ����  3. ��ü ���� ����  4. �����߰� 5. �κм������� 6.���α׷� ���� ");
			System.out.println(" ======================================================= ");

			num = scan.nextInt(); // �޴� ��ȣ �Է� > 

			if (num < 0 || num > 6) { // ���� �� �޴� ���ý�
				System.out.println(" �߸� �Է��ϼ̽��ϴ� ��~���� �Է��ϼ���^^ ");
			}
			switch (num) { //�޴� �̵� ����ġ 

			case 1:
				System.out.println("�߰� �Է��� �л� �� �Է� : ");
				j = scan.nextInt();

				scan.nextLine(); // ����Ű �ʱ�ȭ

				for (i = stu; i < (j + stu); i++) { // �л��� �Է� �� �߰� �л��� �Է�
													// ���� �л���(stu) ���� �߰� �л���(j+stu) ���� �Է�

					score[i] = new Student();

					System.out.println((i + 1) + "�� �л� ����");
					System.out.println("�̸��� �Է� : ");
					score[i].name = scan.nextLine();
					System.out.println("�������� �Է� : ");
					score[i].kor = scan.nextInt();
					System.out.println("�������� �Է� : ");
					score[i].math = scan.nextInt();
					System.out.println("�������� �Է� : ");
					score[i].eng = scan.nextInt();
					score[i].avg = score[i].avg();
					score[i].total = score[i].total();
					score[i].grade = score[i].grade();					
					if (score[0].art > 0) {
						if(score[i-1].art > 0) { 
						System.out.println("�̼����� �Է� : ");
						score[i].art = scan.nextInt();
						score[i].avg = (double) ((int) (score[i].kor + score[i].math + score[i].eng + score[i].art ) * 100 / 4) / 100;
						score[i].total = (int) (score[i].kor + score[i].math + score[i].eng + score[i].art);
						score[i].mark = score[i].mark();
						score[i].grade = score[i].grade();
					}} else { }
					scan.nextLine(); // ����Ű �ʱ�ȭ
				}
				stu += j; // �Է��� �л��� + �ؼ� ���������� ��ü �л����� �Է�

				for (int a = 0; a < stu; a++) { // �������� - ���������� ����Ʈ ����
					for (int b = 0; b < stu - 1; b++) {
						if (score[b].total < score[b + 1].total) {
							Student temp = score[b + 1];
							score[b + 1] = score[b];
							score[b] = temp;
						}
					}
				}
				
				break;

			case 2: // Ư�� ����� ���� ����
				if (stu == 0) {
					System.out.println(" �Էµ� �л�(����)�� �����ϴ�. ");
				} else {
					System.out.println(" ���� ���� �޴��Դϴ� ");
					System.out.println(" ��� ������� ������ ���ðڽ��ϱ�? ");
					System.out.println(" ����� �̸� : ");
					scan.nextLine(); // �����ʱ�ȭ
					choiceName = scan.nextLine();

					for (i = 0; i < stu; i++) { // ��ü �л� �� �̸� ��ġ�ϴ� �� ��Ī �� ���
						if (score[i].name.equals(choiceName)) {
							if (score[i].art>0) {
							System.out.println(score[i].all());} 
							else {
								System.out.println(score[i].all2());
							} 
						}
						if (!score[i].name.equals(choiceName)) {
							System.out.println("���� �л��Դϴ�. �޴��� ���ư��ϴ�.");
						}
					}
				}
					break;

			case 3: // ��ü ���� ����
				if (stu == 0) {
					System.out.println(" �Էµ� �л�(����)�� �����ϴ�. ");
				} else {
					System.out.println("========= ��ü ����Ʈ =========");

					for (i = 0; i < stu; i++) { // ���������� ���� �� ��ü����Ʈ ���
						if (score[i].art > 0) {
							System.out.println((i+1)+". "+score[i].all());
						} else {
							System.out.println((i+1)+". "+score[i].all2());
						}
					}
				}
				break;

			case 4: // ���� �߰�
				if (stu == 0) {
					System.out.println(" �Էµ� �л�(����)�� �����ϴ�. ");
				} else {

					System.out.println(" �̼� ������ �߰��Ǿ����ϴ� ");

					for (i = c; i < stu; i++) { // �߰��� �̼����� ��ü �л� ���� �Է� �� ���� �Է°� (�������̵� ������) ���� 

						sub[i] = new Subject01();
						System.out.print((i + 1) + "�� �л��� ");
						System.out.println("�̼����� �Է� : ");
						score[i].art = sub[i].art = scan.nextInt();
						score[i].math = sub[i].math = score[i].math;
						score[i].kor = sub[i].kor = score[i].kor;
						score[i].eng = sub[i].eng = score[i].eng;
						score[i].name = sub[i].name = score[i].name;
						score[i].total = sub[i].total = sub[i].total();
						score[i].avg = sub[i].avg = sub[i].avg();
						score[i].grade = sub[i].grade = sub[i].grade();
					} c = c + stu; // ���� �Էµ� �̼����� �л��� ���� 
					for (i = 0; i < stu; i++) { // �̼����� �߰� �� ��ü����Ʈ ���
						System.out.println(score[i].all());
					}
				}
				
				break;
			case 5: // �κм��� ���� �޴� 
				if (stu == 0) {
					System.out.println(" �Էµ� �л�(����)�� �����ϴ�. ");
				} else {
					
					int num1 = 0;
					System.out.println(" ���ϴ� �κм����� �޴��� �����ϼ���. ");
					System.out.println(" 1. ���� ���� 2. ��޺� ����  3. �ڷΰ��� ");
					System.out.println(" ===================================== ");
					num1 = scan.nextInt();

					if (num1 < 0 || num1 > 3) { // ���� �� �޴� ���ý�
						System.out.println(" �߸� �Է��ϼ̽��ϴ� ��~���� �Է��ϼ���^^ ");
					} 
					switch (num1) {
					
					case 1: // ���� �κм��� ���� 
						String p = "";
						System.out.println(" ���� ������ �����Ͽ����ϴ�. ");
						System.out.println(" ������� �Է��ϼ���.(����,����,����,�̼�) ");
						p = scan.next();
						if (p.equals("����")) {
							for ( i = 0; i < stu; i++) { // ���� �� ��ü����Ʈ ���
								System.out.println("�̸�: "+score[i].name + " "+ p + " ����:" + score[i].math);}
						} else if (p.equals("����")) {
							for ( i = 0; i < stu; i++) { // ���� �� ��ü����Ʈ ���
								System.out.println("�̸�: "+score[i].name + " "+ p + " ����:" + score[i].eng);}
						} else if (p.equals("����")) {
							for ( i = 0; i < stu; i++
								) { // ���� �� ��ü����Ʈ ���
								System.out.println("�̸�: "+score[i].name + " "+ p + " ����:" + score[i].kor);}
						} else if (p.equals("�̼�")) {
							for ( i = 0; i < stu; i++) { // ���� �� ��ü����Ʈ ���
								System.out.println("�̸�: "+score[i].name + " "+ p + " ����:" + score[i].art);}
						} else { System.out.println("�߸��Է��ϼ̽��ϴ�");							
						} break;
						
					case 2: //��޺� �κм��� ����
						String w = " ";
						String change1 = "";
						System.out.println(" ��޺� ������ �����Ͽ����ϴ�. ");
						System.out.println(" ����� �Է��ϼ���.(A,B,C,D,F) ");
						w = scan.next();		// �Է¹�����(String) // �����ϴ� ������(A,B..)�� ��� 
						if (w.equals("F")||w.equals("B")||w.equals("C")||w.equals("D")||w.equals("A")) {
							System.out.println(" [" + w + "] ��� �л� ����Ʈ");
							for ( i = 0; i < stu; i++) { // �Է°� �� ����� ���� ��������Ʈ ���
								change1 = new String(score[i].grade);
								String ch = change1.substring(0,1); //���(��Ʈ��)���� ù�ڸ�(0����1) �����Ͽ� ch�� ����
								if (w.equals(ch) && score[i].art > 0) { // �̼������� ������ 
								System.out.println(score[i].all()); 
								} 
								else if (w.equals(ch) && score[i].art == 0) { //�̼������� ������
									System.out.println(score[i].all2());
								} 
						}//for�� ����
							}// if�� ����
							else {
										System.out.println("�߸��Է��ϼ̽��ϴ�");		
								} 		
							  						
						break;
					
					case 3: //�κм����޴� ���� �ʱ�޴��� ���ư��� 
						break;
						
					}
				}

			}

			if (num == 6) // ���α׷� ���� (while��)
				break;
		}

	}

}
