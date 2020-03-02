package Day1125;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GridLayoutTest extends JFrame{
	public GridLayoutTest() {
		setTitle("Test Grid");
		Container mContainer = getContentPane();
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		
		mContainer.setLayout(null);
		JLabel labelMain = new JLabel("회원가입");
		labelMain.setSize(75, 20);
		labelMain.setLocation(120, 50);
		
		JLabel labelID = new JLabel("ID : ");
		labelID.setSize(90, 20);
		labelID.setLocation(20, 100);
		
		JLabel labelPW = new JLabel("PW : ");
		labelPW.setSize(90, 20);
		labelPW.setLocation(20, 150);
		JLabel labelAdress = new JLabel("주소 : ");
		labelAdress.setSize(90, 20);
		labelAdress.setLocation(20, 200);
		JLabel labelAge = new JLabel("나이 : ");
		labelAge.setSize(90, 20);
		labelAge.setLocation(20, 250);
		JLabel labelHob = new JLabel("취미 : ");
		labelHob.setSize(90, 20);
		labelHob.setLocation(20, 300);
		JTextField mText1 = new JTextField(20);
		mText1.setSize(90, 20);
		mText1.setLocation(90, 100);
		JTextField mText2 = new JTextField(20);
		mText2.setSize(90, 20);
		mText2.setLocation(90, 150);
		JTextField mText3 = new JTextField(20);
		mText3.setSize(90, 20);
		mText3.setLocation(90, 200);
		JTextField mText4 = new JTextField(20);
		mText4.setSize(90, 20);
		mText4.setLocation(90, 250);
		JTextField mText5 = new JTextField(20);
		mText5.setSize(90, 20);
		mText5.setLocation(90, 300);
		
		JButton mButton = new JButton("회원가입");
		mButton.setSize(100, 30);
		mButton.setLocation(5, 700);
		JButton mButton2 = new JButton("취소");
		mButton2.setSize(100, 30);
		mButton2.setLocation(110, 700);
		mContainer.add(mButton);
		mContainer.add(mButton2);
		mContainer.add(labelMain);
		mContainer.add(labelID);
		mContainer.add(labelPW);
		mContainer.add(labelAdress);
		mContainer.add(labelAge);
		mContainer.add(labelHob);
		mContainer.add(mText1);
		mContainer.add(mText2);
		mContainer.add(mText3);
		mContainer.add(mText4);
		mContainer.add(mText5);
		
		
		setSize(300,900);
		setVisible(true);
	}
}
