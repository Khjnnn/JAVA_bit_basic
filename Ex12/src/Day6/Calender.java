package Day6;

public class Calender {
	// 날짜 1-31 일까지 월 1-12월까지
	// 아무날짜나 랜덤으로 가지고 올 수 있는 프로그램		
		int month = 0;
		int day = 0;
		
		int[] day_value = {1,2,3,4,5,6,7,8,9,10,11,12};
		int[] month_value31 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
		int[] month_value28 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,0,20,21,22,23,24,25,26,27,28};
		int[] month_value30 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
	//31일 달력 : 1,3,5,7,8,10,12
		//28일 달력 : 2,
		//30일 달력 : 4,6,9,11
//		String randomDayTest() {
//			int month =0 ;
//			int day =0;
//			month = (int)(Math.random()*12)+1;
//				if(month ==2) {
//					do {
//						day=(int)(Math.random()*28);
//					}while(month_value28[day] == 0);
//					month_value28[day] = 0;
//				}
//				else if(month ==4 || month==6 || month==9||month==11) {
//					do {
//						day=(int)(Math.random()*30);
//					}while(month_value30[day] == 0);
//					month_value30[day] = 0;
//				}
//				else {
//					do {
//						day=(int)(Math.random()*31);
//					}while(month_value31[day] == 0);
//					month_value31[day] = 0;
//				}
//			return "랜덤인 날짜는 : " + month + "/" + day;
			
//}
		String randomDay() {
			int month =0 ;
			int day =0;
			month = (int)(Math.random()*12)+1;
			if(month ==2)
				day=(int)(Math.random()*28)+1;
			else if(month ==4 || month==6 || month==9||month==11)
				day=(int)(Math.random()*30)+1;
			else
				day=(int)(Math.random()*31)+1;
			
			return "랜덤인 날짜는 : " + month + "/" + day;
		}
	
	
}

