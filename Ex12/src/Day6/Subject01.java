package Day6;

public class Subject01 extends Student{
	double avg;
	int art ;
	
	double avg() { // ��� �޼ҵ� (�����߰� �������̵�)
		
		return (double)((int)((total())*100/4))/100;
	}
	int total() { // ���� �޼ҵ� (�����߰� �������̵�)

		return (math + eng + kor + art);
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
	char mark() { // ��������� ���� ��� ���� �޼ҵ�
		mark = ' ';
	if (9>= avg%10 && avg%10 >= 7) {
		mark = '+';
	} else if (7> avg%10 && avg%10 >= 4) {
		mark = '0';
	} else if (4> avg%10 && avg%10 >= 0) {
		mark = '-';
	}

	return mark ;

	}
}
