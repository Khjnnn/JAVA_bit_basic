package Day1119;

public class Test {
	public static void main(String[] args) {
		Test1 m111 = new Test1();
		m111.start(); //쓰레드 시작 ( 1.5초 + f메소드(다시시작))
		AB m = AB.getInstance(); //싱글톤
		m.ab(); // 시작끝 메소드
	}
}
class AB {
	static AB m = new AB();
	synchronized static AB getInstance(){	//싱글톤 선언 [ static 메모리 할당 ] 
		if(m==null) {
			m = new AB();
		}
		return m;
	}
	synchronized void ab() {
		try {
			System.out.println("시작");
			m.wait();
			System.out.println("끝");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	synchronized void f() {   
		m.notifyAll();
	}
}

class Test1 extends Thread{
	AB mAa = AB.getInstance(); //싱글톤
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			Thread.sleep(1500);
			mAa.f();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

