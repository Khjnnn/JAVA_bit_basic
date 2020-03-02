package Day1125;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex13 extends JFrame{
	JLabel mLabel2 = new JLabel("0");
	
public Ex13() {
	
	setTitle("test");
	
	
	Container mContainer1 = getContentPane();
	mContainer1.setLayout(new GridLayout(2, 2, 5, 5));
	JPanel mJPanel1 = new JPanel();
	JPanel mJPanel2 = new JPanel();
	JPanel mJPanel3 = new JPanel();
	JPanel mJPanel4 = new JPanel();
	mContainer1.add(mJPanel1);
	mContainer1.add(mJPanel2);
	mContainer1.add(mJPanel3);
	mContainer1.add(mJPanel4);
	
	mJPanel1.setLayout(null);
	JLabel mLabel = new JLabel("¶ó¸é");
	ImageIcon img = new ImageIcon("img/asd.jpg");
	JLabel iml = new JLabel(img);
	iml.setSize(200,200);
	mJPanel1.add(iml);
	
	mJPanel3.setLayout(null);
	mLabel2.setSize(300, 200);
	mJPanel3.add(mLabel2);
	
	setSize(400, 400);
	setVisible(true);

	Thread1 m = new Thread1();
	m.start();
}	
	
	public static void main(String[] args) {
		Ex13 m = new Ex13();
		
		
		
	}
	
	class Thread1 extends Thread{
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			int i =0;
			try {
				while(true) {
					Date mday = new Date();
					String mdate = mday.toString();
					Thread.sleep(1000);
					mLabel2.setText("" + mdate);

				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}

