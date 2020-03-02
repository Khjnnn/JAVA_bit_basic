package Day6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentScore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0; // 메뉴 선택 번호
		int j = 0; // 학생 수
		int stu = 0; // 갱신받을 전체 학생수
		int i = 0; //
		int c = 0; // 추가과목 학생수

		String choiceName = ""; // 성적보기에 필요한 이름명

		Student[] score = new Student[10000];
		Subject01[] sub = new Subject01[10000]; // 추가 과목 (오버라이드 클래스)

		// 학생수 입력하여 배열크기 지정 / 클래스를 배열로 선언
		
		

		while (true) {

			System.out.println("=================== 성적 관리 프로그램 ======================");
			System.out.println(" 원하는 메뉴의 번호를 입력하세요. ");
			System.out.println(" 1. 성적 입력  2. 성적 보기  3. 전체 성적 보기  4. 과목추가 5. 부분성적보기 6.프로그램 종료 ");
			System.out.println(" ======================================================= ");

			num = scan.nextInt(); // 메뉴 번호 입력 > 

			if (num < 0 || num > 6) { // 보기 외 메뉴 선택시
				System.out.println(" 잘못 입력하셨습니다 잘~보고 입력하세요^^ ");
			}
			switch (num) { //메뉴 이동 스위치 

			case 1:
				System.out.println("추가 입력할 학생 수 입력 : ");
				j = scan.nextInt();

				scan.nextLine(); // 엔터키 초기화

				for (i = stu; i < (j + stu); i++) { // 학생수 입력 및 추가 학생수 입력
													// 기존 학생수(stu) 부터 추가 학생수(j+stu) 까지 입력

					score[i] = new Student();

					System.out.println((i + 1) + "번 학생 정보");
					System.out.println("이름을 입력 : ");
					score[i].name = scan.nextLine();
					System.out.println("국어점수 입력 : ");
					score[i].kor = scan.nextInt();
					System.out.println("수학점수 입력 : ");
					score[i].math = scan.nextInt();
					System.out.println("영어점수 입력 : ");
					score[i].eng = scan.nextInt();
					score[i].avg = score[i].avg();
					score[i].total = score[i].total();
					score[i].grade = score[i].grade();					
					if (score[0].art > 0) {
						if(score[i-1].art > 0) { 
						System.out.println("미술점수 입력 : ");
						score[i].art = scan.nextInt();
						score[i].avg = (double) ((int) (score[i].kor + score[i].math + score[i].eng + score[i].art ) * 100 / 4) / 100;
						score[i].total = (int) (score[i].kor + score[i].math + score[i].eng + score[i].art);
						score[i].mark = score[i].mark();
						score[i].grade = score[i].grade();
					}} else { }
					scan.nextLine(); // 엔터키 초기화
				}
				stu += j; // 입력한 학생수 + 해서 전역변수에 전체 학생수로 입력

				for (int a = 0; a < stu; a++) { // 버블정렬 - 성적순으로 리스트 정렬
					for (int b = 0; b < stu - 1; b++) {
						if (score[b].total < score[b + 1].total) {
							Student temp = score[b + 1];
							score[b + 1] = score[b];
							score[b] = temp;
						}
					}
				}
				
				break;

			case 2: // 특정 사용자 성적 보기
				if (stu == 0) {
					System.out.println(" 입력된 학생(성적)이 없습니다. ");
				} else {
					System.out.println(" 성적 보기 메뉴입니다 ");
					System.out.println(" 어느 사용자의 성적을 보시겠습니까? ");
					System.out.println(" 사용자 이름 : ");
					scan.nextLine(); // 엔터초기화
					choiceName = scan.nextLine();

					for (i = 0; i < stu; i++) { // 전체 학생 중 이름 일치하는 값 매칭 후 출력
						if (score[i].name.equals(choiceName)) {
							if (score[i].art>0) {
							System.out.println(score[i].all());} 
							else {
								System.out.println(score[i].all2());
							} 
						}
						if (!score[i].name.equals(choiceName)) {
							System.out.println("없는 학생입니다. 메뉴로 돌아갑니다.");
						}
					}
				}
					break;

			case 3: // 전체 성적 보기
				if (stu == 0) {
					System.out.println(" 입력된 학생(성적)이 없습니다. ");
				} else {
					System.out.println("========= 전체 리스트 =========");

					for (i = 0; i < stu; i++) { // 성적순으로 정렬 된 전체리스트 출력
						if (score[i].art > 0) {
							System.out.println((i+1)+". "+score[i].all());
						} else {
							System.out.println((i+1)+". "+score[i].all2());
						}
					}
				}
				break;

			case 4: // 과목 추가
				if (stu == 0) {
					System.out.println(" 입력된 학생(성적)이 없습니다. ");
				} else {

					System.out.println(" 미술 과목이 추가되었습니다 ");

					for (i = c; i < stu; i++) { // 추가된 미술과목 전체 학생 점수 입력 및 기존 입력값 (오버라이드 값으로) 갱신 

						sub[i] = new Subject01();
						System.out.print((i + 1) + "번 학생의 ");
						System.out.println("미술점수 입력 : ");
						score[i].art = sub[i].art = scan.nextInt();
						score[i].math = sub[i].math = score[i].math;
						score[i].kor = sub[i].kor = score[i].kor;
						score[i].eng = sub[i].eng = score[i].eng;
						score[i].name = sub[i].name = score[i].name;
						score[i].total = sub[i].total = sub[i].total();
						score[i].avg = sub[i].avg = sub[i].avg();
						score[i].grade = sub[i].grade = sub[i].grade();
					} c = c + stu; // 기존 입력된 미술점수 학생수 갱신 
					for (i = 0; i < stu; i++) { // 미술점수 추가 된 전체리스트 출력
						System.out.println(score[i].all());
					}
				}
				
				break;
			case 5: // 부분성적 보기 메뉴 
				if (stu == 0) {
					System.out.println(" 입력된 학생(성적)이 없습니다. ");
				} else {
					
					int num1 = 0;
					System.out.println(" 원하는 부분성적의 메뉴를 선택하세요. ");
					System.out.println(" 1. 과목별 성적 2. 등급별 성적  3. 뒤로가기 ");
					System.out.println(" ===================================== ");
					num1 = scan.nextInt();

					if (num1 < 0 || num1 > 3) { // 보기 외 메뉴 선택시
						System.out.println(" 잘못 입력하셨습니다 잘~보고 입력하세요^^ ");
					} 
					switch (num1) {
					
					case 1: // 과목별 부분성적 보기 
						String p = "";
						System.out.println(" 과목별 성적을 선택하였습니다. ");
						System.out.println(" 과목명을 입력하세요.(수학,영어,국어,미술) ");
						p = scan.next();
						if (p.equals("수학")) {
							for ( i = 0; i < stu; i++) { // 과목 별 전체리스트 출력
								System.out.println("이름: "+score[i].name + " "+ p + " 점수:" + score[i].math);}
						} else if (p.equals("영어")) {
							for ( i = 0; i < stu; i++) { // 과목 별 전체리스트 출력
								System.out.println("이름: "+score[i].name + " "+ p + " 점수:" + score[i].eng);}
						} else if (p.equals("국어")) {
							for ( i = 0; i < stu; i++
								) { // 과목 별 전체리스트 출력
								System.out.println("이름: "+score[i].name + " "+ p + " 점수:" + score[i].kor);}
						} else if (p.equals("미술")) {
							for ( i = 0; i < stu; i++) { // 과목 별 전체리스트 출력
								System.out.println("이름: "+score[i].name + " "+ p + " 점수:" + score[i].art);}
						} else { System.out.println("잘못입력하셨습니다");							
						} break;
						
					case 2: //등급별 부분성적 보기
						String w = " ";
						String change1 = "";
						System.out.println(" 등급별 성적을 선택하였습니다. ");
						System.out.println(" 등급을 입력하세요.(A,B,C,D,F) ");
						w = scan.next();		// 입력받은값(String) // 존재하는 성적값(A,B..)일 경우 
						if (w.equals("F")||w.equals("B")||w.equals("C")||w.equals("D")||w.equals("A")) {
							System.out.println(" [" + w + "] 등급 학생 리스트");
							for ( i = 0; i < stu; i++) { // 입력값 과 등급이 같은 성적리스트 출력
								change1 = new String(score[i].grade);
								String ch = change1.substring(0,1); //등급(스트링)에서 첫자리(0에서1) 추출하여 ch에 대입
								if (w.equals(ch) && score[i].art > 0) { // 미술점수가 있을때 
								System.out.println(score[i].all()); 
								} 
								else if (w.equals(ch) && score[i].art == 0) { //미술점수가 없을때
									System.out.println(score[i].all2());
								} 
						}//for문 종료
							}// if문 종료
							else {
										System.out.println("잘못입력하셨습니다");		
								} 		
							  						
						break;
					
					case 3: //부분성적메뉴 에서 초기메뉴로 돌아가기 
						break;
						
					}
				}

			}

			if (num == 6) // 프로그램 종료 (while문)
				break;
		}

	}

}
