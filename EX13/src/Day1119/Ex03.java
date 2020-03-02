package Day1119;

public class Ex03 {
	public static void main(String[] args) {
		// 3개의 쓰레드를 만들고 for문을 사용하여 각각 클래스 이름과 숫자를 출력하라

		Ac a = new Ac();
		B b = new B();
		C c = new C();
		a.setPriority(10); // 우선순위 셋팅 (0~10까지)

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
		synchronized (this) { // * 동기화 구문
			a = 5;

			try {
				System.out.println("테스트시작");
				wait(); // 대기상태(락) // notify() 깨우기 
				System.out.println("테스트 끗");
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