package Day6;

public class Profile {
	String name = "";
	int born = 0;
	boolean sex = false;
	String adress = "";
	String se;
	public String s () {
		if (sex == true) {
			se = "��";
		 }
	 else { se  = "��"; }
		return se; 
					
	}
	
	int age () {
		
		return (2020-born);
				
	}
	
public static class A {
	public static void main(String[] args) {
		Profile p = new Profile();
		p.name = "������";
		p.born = 1993;
		p.sex = true;
		p.adress = "����� �߱�";
		
		System.out.println(p.name +"("+ p.s() +")"+" ���� ���̴� " + p.age() + "�� �Դϴ�.");
		
		
	}
	
}
	
	
}
