package Day1119;

public class Ex03 {
	public static void main(String[] args) {
		// 3���� �����带 ����� for���� ����Ͽ� ���� Ŭ���� �̸��� ���ڸ� ����϶�

		Ac a = new Ac();
		B b = new B();
		C c = new C();
		a.setPriority(10); // �켱���� ���� (0~10����)

		a.start();
		b.start();
		c.start();

	}
}

class Ac extends Thread {
	int a = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		synchronized (this) { // * ����ȭ ����
			a = 5;

			try {
				System.out.println("�׽�Ʈ����");
				wait(); // ������(��) // notify() ����� 
				System.out.println("�׽�Ʈ ��");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		for (int i = 1; i < 11; i++) {
			System.out.println("A:" + i);
//			try {
//				Thread.sleep(0);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}

}

class B extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 1; i < 11; i++) {
			System.out.println("B: " + i);
//			try {
//				Thread.sleep(0);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}

}

class C extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 1; i < 11; i++) {
			System.out.println("C: " + i);
//			try {
//				Thread.sleep(0);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}