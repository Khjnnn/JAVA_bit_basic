package Day1119;

public class Test {
	public static void main(String[] args) {
		Test1 m111 = new Test1();
		m111.start(); //������ ���� ( 1.5�� + f�޼ҵ�(�ٽý���))
		AB m = AB.getInstance(); //�̱���
		m.ab(); // ���۳� �޼ҵ�
	}
}
class AB {
	static AB m = new AB();
	synchronized static AB getInstance(){	//�̱��� ���� [ static �޸� �Ҵ� ] 
		if(m==null) {
			m = new AB();
		}
		return m;
	}
	synchronized void ab() {
		try {
			System.out.println("����");
			m.wait();
			System.out.println("��");
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
	AB mAa = AB.getInstance(); //�̱���
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

