package Day1125;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;


public class Ex11 extends JFrame{
	public Ex11(){
		
		setTitle("ȸ������");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contentpane = getContentPane();
		
		//GridLayoutTest mGrid = new GridLayoutTest();

		
		JButton mButton = new JButton("����");
		JLabel mJable = new JLabel("�ȳ��ϼ���");
		JButton mButton2 = new JButton("���");
		contentpane.setLayout(new FlowLayout(FlowLayout.LEFT,30,20));
		JTextField mtexField = new JTextField(100);
	
		mButton.addActionListener(new ActionListener() {
			int count = 1; 
			public void actionPerformed(ActionEvent e) {
				
				
				mJable.setText(""+ (++count)); // â���� �V�ؽ�Ʈ 
				System.out.println(mJable.getText()); //�ܼ� ����Ʈ
				
			}
		});
		contentpane.add(mJable);
		contentpane.add(mButton);
		setSize(300,900);
		setVisible(true);
		
		
//		Vector<String> s = new Vector<String>();
//		s.add("�޴�1");
//		s.add("�޴�2");
//		s.add("�޴�3");
//		JList mJList = new JList<String>(s);
//		JComboBox<String> mComboBox = new JComboBox<String>(s);
//		RadioButtonBorder rB = new RadioButtonBorder(null, null, null, null);
		
//		contentpane.add(mJList);
//		contentpane.add(mComboBox);
//		contentpane.add(new JLabel("�̸�: "));
//		contentpane.add(new JTextField("\t"));
//		
//		contentpane.add(new JLabel("ID: "));
//		contentpane.add(new JTextField("\t"));
//		contentpane.add(new JLabel("PW: "));
//		contentpane.add(new JPasswordField("\t"));
//		contentpane.add(mButton);
//		contentpane.add(mButton2);
		
		//contentpane.add(mGrid);
		
	}
	
	public static void main(String[] args) {
		
		JFrame m = new Ex11();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	
//		JFrame m1 = new JFrame();
//		m1.setTitle("����2");
//		m1.setSize(300, 400);
//		m1.setVisible(true);
	}
}