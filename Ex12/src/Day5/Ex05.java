package Day5;
// C��� - ����ü 
class A {
	String name;
	int age ;
	
	int [] score;
}
public class Ex05 {
	static int test = 7; // �޸𸮻� ���ִ� ���� -> Ŭ��������
	//	 Ŭ�����̸�.Ŭ�������� => �Ͱ��� ��밡��  Ex05.test 
	
	
	int i = 0; // ������� 
	// 
	///////////////////////////////////
	public static void main(String[] args) {

		
		Ex05 m = new Ex05();
		int a = 9;
		 a = m.sum(a,2);
		 //test=10;
		 System.out.println("Ex05=");
		 System.out.println(Ex05.test);
		 System.out.println("�׽�Ʈ");
		System.out.println(test);
		
		System.out.println(a);		 
	}
	///////////////////////////////////
	int sum(int test , int b) {
		System.out.println("�Ʒ��׽�Ʈ");
		System.out.println(Ex05.test);
		
		System.out.println(test);
		return test+b ;
	 }
}
// �Ű����� = �Է°�; (���������ִ�) //��°�=���ϰ� ;      
// static (�����޸�) : ���� �� ��������
// int f (int a, int b) { return 1 ;}
// 