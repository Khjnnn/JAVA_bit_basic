package Day6;

public class Subject01 extends Student{
	double avg;
	int art ;
	
	double avg() { // 평균 메소드 (과목추가 오버라이드)
		
		return (double)((int)((total())*100/4))/100;
	}
	int total() { // 총점 메소드 (과목추가 오버라이드)

		return (math + eng + kor + art);
	}

	

String grade() { // 평균점수 기준 등급+문자 메소드 
		mark = mark(); // mark 함수에서 mark 가져오기 
		String.valueOf(mark); //char > String 형변환 
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
	char mark() { // 평균점수에 따른 등급 문자 메소드
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
