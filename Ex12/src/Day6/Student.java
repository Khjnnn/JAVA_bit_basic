package Day6;

import java.util.Scanner;

public class Student {

	
	String name; // 이름
	String grade; // 등급
	int kor; //국어점수 
	int eng; // 영어점수
	int math; // 수학점수
	int art; // 미술점수
	char mark; // 등급 문자(+,-)
	double avg; // 평균
	int total; // 총점 
	
	
	
	
	
	String all = "";
	String all2 = "";
	
	Student() { // 생성자 
		name = null;
		kor = 0;
		eng = 0;
		math = 0;
		
		
	}
	
char mark() { // 평균점수에 따른 등급 문자 메소드
		
	if (9>= avg%10 && avg%10 >= 7) {
		mark = '+';
	} else if (7> avg%10 && avg%10 >= 4) {
		mark = '0';
	} else if (4> avg%10 && avg%10 >= 0) {
		mark = '-';
	} else { } 
	
	return mark ;
	
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

	int total() { // 총점 메소드

		return (math + eng + kor);
	}

	double avg() { // 평균 메소드

		return (double)((int)( total()*100/3 ))/100;
	}
	String all() { //요약 
		return  "이름: " + name + " 국어점수: " + kor + " 수학점수: " + math + " 영어점수: "
				+ eng + " 미술점수: " + art + " 총점: " + total() + " 평균: " + avg
				+ " 등급: " + grade;
	}
	String all2() { //요약
		return "이름: " + name + " 국어점수: " + kor + " 수학점수: " + math + " 영어점수: "
		+ eng + " 총점: " + total() + " 평균: " + avg + " 등급: "+grade;
	}
	
	
}

