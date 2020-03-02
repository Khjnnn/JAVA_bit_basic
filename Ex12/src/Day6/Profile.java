package Day6;

public class Profile {
	String name = "";
	int born = 0;
	boolean sex = false;
	String adress = "";
	String se;
	public String s () {
		if (sex == true) {
			se = "남";
		 }
	 else { se  = "여"; }
		return se; 
					
	}
	
	int age () {
		
		return (2020-born);
				
	}
	
public static class A {
	public static void main(String[] args) {
		Profile p = new Profile();
		p.name = "김으아";
		p.born = 1993;
		p.sex = true;
		p.adress = "서울시 중구";
		
		System.out.println(p.name +"("+ p.s() +")"+" 님의 나이는 " + p.age() + "세 입니다.");
		
		
	}
	
}
	
	
}
