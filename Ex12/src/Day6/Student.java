package Day6;

import java.util.Scanner;

public class Student {

	
	String name; // �̸�
	String grade; // ���
	int kor; //�������� 
	int eng; // ��������
	int math; // ��������
	int art; // �̼�����
	char mark; // ��� ����(+,-)
	double avg; // ���
	int total; // ���� 
	
	
	
	
	
	String all = "";
	String all2 = "";
	
	Student() { // ������ 
		name = null;
		kor = 0;
		eng = 0;
		math = 0;
		
		
	}
	
char mark() { // ��������� ���� ��� ���� �޼ҵ�
		
	if (9>= avg%10 && avg%10 >= 7) {
		mark = '+';
	} else if (7> avg%10 && avg%10 >= 4) {
		mark = '0';
	} else if (4> avg%10 && avg%10 >= 0) {
		mark = '-';
	} else { } 
	
	return mark ;
	
}

String grade() { // ������� ���� ���+���� �޼ҵ�
		mark = mark(); // mark �Լ����� mark �������� 
		String.valueOf(mark); //char > String ����ȯ 
	if (100 >= avg && avg >= 90) {
		grade = "A" + mark;
	}
	else if (90 > avg && avg >= 80) {
		grade = "B" + mark;
	}
	else if (80 > avg && avg >= 70) {
		grade = "C" + mark;
	}
	else if (90 > avg && avg >= 60) {
		grade = "D" + mark;
	} else grade = "F";
		
	
	return grade ;
}

	int total() { // ���� �޼ҵ�

		return (math + eng + kor);
	}

	double avg() { // ��� �޼ҵ�

		return (double)((int)( total()*100/3 ))/100;
	}
	String all() { //��� 
		return  "�̸�: " + name + " ��������: " + kor + " ��������: " + math + " ��������: "
				+ eng + " �̼�����: " + art + " ����: " + total() + " ���: " + avg
				+ " ���: " + grade;
	}
	String all2() { //���
		return "�̸�: " + name + " ��������: " + kor + " ��������: " + math + " ��������: "
		+ eng + " ����: " + total() + " ���: " + avg + " ���: "+grade;
	}
	
	
}

