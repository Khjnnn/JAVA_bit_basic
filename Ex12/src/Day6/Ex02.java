package Day6;

public class Ex02 extends A { // �ڽ� (���� ����)
// ��� (extends) 
// ������ �̸��̸� �ȵ� ()
//	A mA = new A(); 
//	mA.func(); < AŬ����(�θ�) Ž
//	B mB = new B();
//	mB.func(); < BŬ���� Ž(�ڽ�)
//	��Ӻ��� �����ü� �ִ� (Super)   
// �������̵� >> ��ӿ��� �Լ��̸��� �Ű������� ���� �� ����� ����ϴ°�
	
//  ���������� ///
//	public ������ / private : �ƹ��� ���� �Ұ�
//	protected : ���(�������� ��)���� Ŭ������ ���� ���� 
//	
//	�̱��� : �ڱ��ڽ��� �޸� �Ҵ� / ���������� 
//	�߻�Ŭ���� / �߻�޼ҵ�(abstract) : ��� �� �߻�޼ҵ� ������ (����X) > �������̽�(��ӿ���������/�����ؼ�)
//				�� �߻�޼ҵ� �κ��� ��ӹ��� �� ������ �ؾ� ��밡�� **
//	implements A,B =>> �������̽� (��Ӱ� �ٸ�/������ ����)
//	
//	
//	
	int a = 2;
}

class A { // �θ�(����)
 int a = 1;
 int b = 3;
	
}
class C {
	public static void main(String[] args) {
		A mA = new A();
		Ex02 mB = new Ex02();
		
		System.out.println(mA.b);
		System.out.println(mB.a);
	}
	
	

	
	
}