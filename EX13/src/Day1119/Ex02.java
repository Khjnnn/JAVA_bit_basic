package Day1119;

// Thread :동시에 수행하기 위해 짜놓은 프로그램 
/* 두개의 쓰레드가 동시에 하나의 (객체)데이터에 접근하면서 사용할 때 생기는 문제점 : 레이스 컨디션
 *  > 락(Lock)을걸어 해결 // <ㅡ> 데드락 >> 교착상태
 *  백그라운드 작업 > 쓰레드 활용
 * ex. 타이머
 * 쓰레드 내 반복(while)문은 반드시 딜레이가 있어야 함 (슬립 1 // 메모리 )
 * 쓰레드/디자인패턴(싱글톤) -> 옵저버 패턴 : 어떠한 상태변화를 캐치해서 알려주는 것 (객체의 변화) 
 * 
 */
public class Ex02 {
	public static void main(String[] args) {
		Runnable r = new A();
		Thread t = new Thread(r);
		t.start(); // 인터페이스 활용하여 사용 
		
		
//		System.out.println("1");
//		try {
//			Thread.sleep(500); // 0.5초 
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
//		mT.start(); // 구동과 선언 다름 
//		mT2.start();	
	}
}
class A implements Runnable {
	// 2. 런너블 인터페이스 상속받아서 사용 
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

		// 동시에 작업 수행할 부분 (super 아래)  
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
