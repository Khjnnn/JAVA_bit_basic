package Day1119;

// Thread :���ÿ� �����ϱ� ���� ¥���� ���α׷� 
/* �ΰ��� �����尡 ���ÿ� �ϳ��� (��ü)�����Ϳ� �����ϸ鼭 ����� �� ����� ������ : ���̽� �����
 *  > ��(Lock)���ɾ� �ذ� // <��> ����� >> ��������
 *  ��׶��� �۾� > ������ Ȱ��
 * ex. Ÿ�̸�
 * ������ �� �ݺ�(while)���� �ݵ�� �����̰� �־�� �� (���� 1 // �޸� )
 * ������/����������(�̱���) -> ������ ���� : ��� ���º�ȭ�� ĳġ�ؼ� �˷��ִ� �� (��ü�� ��ȭ) 
 * 
 */
public class Ex02 {
	public static void main(String[] args) {
		Runnable r = new A();
		Thread t = new Thread(r);
		t.start(); // �������̽� Ȱ���Ͽ� ��� 
		
		
//		System.out.println("1");
//		try {
//			Thread.sleep(500); // 0.5�� 
//		}catch (InterruptedException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		System.out.println("3");
//		System.out.println("4");
//		System.out.println("5");
//		
//		Th mT = new Th();
//		Th2 mT2 = new Th2();
//		mT.start(); // ������ ���� �ٸ� 
//		mT2.start();	
	}
}
class A implements Runnable {
	// 2. ���ʺ� �������̽� ��ӹ޾Ƽ� ��� 
	@Override
	public void run() {
	 try {
		Thread.sleep(500);
	}catch (InterruptedException e) {
		e.printStackTrace();
	}
		
	}
	
}
class Th2 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true) {
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Th extends Thread {
	public void run() {
		
		super.run();

		// ���ÿ� �۾� ������ �κ� (super �Ʒ�)  
	};
}
class Stack {
	int[] arr = new int[5];
	int a = 0;
	int b = 0;

	void push(int data) {
		arr[a++] = data;
	}

	int pop() {
		return arr[--a];
	}

}
