package Day6;

import java.util.Set;

import javax.swing.JFrame;

public class Ex03 extends JFrame{
	Ex03(){
		setTitle("eclipse");
		setSize(300, 300);
		setVisible(true);
		// 1. AWT �⺻
		// 2. SWING ���� 
		// 
				
	}
	public static void main(String[] args) {
		
		Ex03 mC = new Ex03();
		Ex03.B cM = mC.new B(); // ����ƽ�� ��� ��ٷο� 
		
		
		
		class A { // ���� (inner) Ŭ���� : Ŭ���� �ȿ� Ŭ����  
			
			int a = 1 ;
			
		}
		
		A ma = new A() ; 	
		System.out.println(ma.a);
	}
	
	class B {
		A mA = new A();
	
		
	}
}

