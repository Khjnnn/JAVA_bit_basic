package Day6;

import java.util.Set;

import javax.swing.JFrame;

public class Ex03 extends JFrame{
	Ex03(){
		setTitle("eclipse");
		setSize(300, 300);
		setVisible(true);
		// 1. AWT 기본
		// 2. SWING 복잡 
		// 
				
	}
	public static void main(String[] args) {
		
		Ex03 mC = new Ex03();
		Ex03.B cM = mC.new B(); // 스태틱일 경우 까다로움 
		
		
		
		class A { // 내부 (inner) 클래스 : 클래스 안에 클래스  
			
			int a = 1 ;
			
		}
		
		A ma = new A() ; 	
		System.out.println(ma.a);
	}
	
	class B {
		A mA = new A();
	
		
	}
}

