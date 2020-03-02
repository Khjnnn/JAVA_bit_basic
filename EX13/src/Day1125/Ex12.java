package Day1125;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.KeyEventDispatcher;
import java.awt.KeyEventPostProcessor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Ex12 extends JFrame{
	JLabel mMoving = new JLabel("Hello");
	JButton mB = new JButton("짠");

	class ActionK implements KeyListener{

		@Override
		public void keyReleased(KeyEvent e) {
			if(e.getKeyChar() =='q')
			{ 
				System.exit(0);
			}
			if(e.getKeyChar()== '\n') {
				int r = (int)(Math.random()*255);
				int g = (int)(Math.random()*255);
				int b = (int)(Math.random()*255);
				Color c = new Color(r, g, b);
				setBackground(c);
			}
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			
			
		}
		
	}
	public Ex12() {
		// TODO Auto-generated constructor stub
		setTitle("예제테스트");
		Container mContainer = getContentPane();
		mContainer.addMouseListener(new ActionM());
		mContainer.setLayout(null);
		
		
		int r = (int)(Math.random()*255);
		int g = (int)(Math.random()*255);
		int b = (int)(Math.random()*255);
		Color c = new Color(r, g, b);
		mContainer.setBackground(c);
		requestFocus();
		mContainer.getFocusListeners();
		mContainer.addKeyListener(new ActionK());
		
				
		mB.setSize(100, 50);
		mB.setLocation(40, 40);
		mContainer.add(mB);
		
		mMoving.setSize(80, 50);
		mMoving.setLocation(20, 20);
		mContainer.add(mMoving);
		
		setSize(500, 500);
		setVisible(true);

				
	}
	public static void main(String[] args) {
		Ex12 m = new Ex12();
		
		
	}

	
class ActionM implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		mMoving.setLocation(e.getX(), e.getY());
		int x = e.getX();
		int y = e.getY();
		mMoving.setText("[x:"+x+"][y:"+y+"]");
		
		System.out.print("[x:"+x+"][y:"+y+"]");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
		}

	
		
}
