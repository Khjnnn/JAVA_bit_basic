package Day1118;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

// ���� ���� ���ɿ��� - " �б�, ����, ���� ( r,w,x) 
//  ������ ���� / ��Ÿ�� ����(��������) > �ٸ���.  ��Ÿ�ӿ����� ��츸 ��� ���� 
//  ArrayList > ��� ���� 
// ���: ����Ű�� �ּҰ�  > 1 -> 2 -> 3
// 					   ��<-��  ����� : 1 -> 3(2->3) 2�� ���Ұ� 
// ȯ�� ��ũ�� ����Ʈ ���� : �ǵ� ��� �� > �Ǿ� �� ��� ������ �����͸�ũ ���� 
// ���� �ּ�(���)�� ����  : ������Ʈ/���ĳ�� =>���� ��ũ�� ����Ʈ 
// ����(Stack) [FILO] : ���� �޸𸮱��� / static /    
// ť(Queue) [FIFO] : (��)���� �޸𸮱��� / (ex.����) 
// Ʈ��(Tree) : �Ѹ�(root) > �˻����� ���� ���� > 
//
//


public class Ex03 {

	public static void main(String[] args) {
		///// ���� ����
		
		try {
			
		OutputStream output = new FileOutputStream("C:/test/out.txt");
		// c:\  ���� ���� �ؾ� ����
		String str = "���� ���� �׽�Ʈ��\t �׽�Ʈ \n";
		String abc = "\n 12345 \n";
		byte[] by = str.getBytes();
		byte[] bi = abc.getBytes();
		byte[] bu = str.getBytes();
		output.write(by);
		output.write(bi);
		output.write(by);
		output.write(bu);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		fileReader2();
		
		
	}
		
	
		///////////// �о����(�ҷ�����) // ���ϸ��� or ��ǲ��Ʈ�� 
	
	static void fileReader2() {
			
			byte[] readBuffer = null;
			
			//String filepath = "C:/test/out.txt"; //�������
			System.out.println("123");
			try {
				FileInputStream fileStream = null;
				readBuffer = new byte[fileStream.available()]; //���� ���� (������°ŕ��� �縸ŭ)
				fileStream = new FileInputStream("C:/test/out.txt");
				
				while (fileStream.read(readBuffer)!= -1) { //������ ���� > -1
						
				} fileStream.close();
			} catch (Exception e) {
				System.out.println(e);
				e.printStackTrace();
			}	
			String n = new String(readBuffer);
			
			System.out.println(n);
		}
	}



//	String fileReader1(String path) { 
//		File mFile = new File(path);
//		try {
//		FileReader file_r = new FileReader(mFile);
//		int count = 0;
//		test = "";
//		
//		while((count = file_r.read())!= -1) {
//			test += (char)count;
//		}			
//		file_r.close(); //��Ʈ�� �ݱ� 	
//		
//		} String n = new String;
//		return path;
//	}	

//		try {
//			File mFile = new File("C:/test/out2.txt");
//			FileReader file_r = new FileReader(mFile);
//			int count = 0;
//			char[] test = new char[8000];
//			int i = 0;
//			while((count = file_r.read())!= -1) {
//				System.out.print((char)count);
//				test[i] = (char)(count);
//				System.out.print((char)test[i]);
//				i++;
//			}			
//			file_r.close();
//		} catch (FileNotFoundException e) { 
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
