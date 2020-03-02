package Day1118;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

// 파일 접근 가능여부 - " 읽기, 쓰기, 실행 ( r,w,x) 
//  컴파일 에러 / 런타임 에러(논리적에러) > 다르다.  런타임에러일 경우만 사용 가능 
//  ArrayList > 노드 구조 
// 노드: 가르키는 주소값  > 1 -> 2 -> 3
// 					   ㄴ<-ㅓ  덮어쓰기 : 1 -> 3(2->3) 2는 사용불가 
// 환형 링크드 리스트 구조 : 맨뒤 노드 값 > 맨앞 일 경우 원형의 데이터링크 구조 
// 양쪽 주소(노드)를 연결  : 이전노트/이후노드 =>더블 링크드 리스트 
// 스택(Stack) [FILO] : 정적 메모리구조 / static /    
// 큐(Queue) [FIFO] : (힙)동적 메모리구조 / (ex.원형) 
// 트리(Tree) : 뿌리(root) > 검색에서 많이 쓰임 > 
//
//


public class Ex03 {

	public static void main(String[] args) {
		///// 파일 생성
		
		try {
			
		OutputStream output = new FileOutputStream("C:/test/out.txt");
		// c:\  폴더 생성 해야 가능
		String str = "파일 쓰기 테스트요\t 테스트 \n";
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
		
	
		///////////// 읽어오기(불러오기) // 파일리더 or 인풋스트림 
	
	static void fileReader2() {
			
			byte[] readBuffer = null;
			
			//String filepath = "C:/test/out.txt"; //대상파일
			System.out.println("123");
			try {
				FileInputStream fileStream = null;
				readBuffer = new byte[fileStream.available()]; //버퍼 선언 (쓸모없는거뺴고 양만큼)
				fileStream = new FileInputStream("C:/test/out.txt");
				
				while (fileStream.read(readBuffer)!= -1) { //파일의 끝이 > -1
						
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
//		file_r.close(); //스트림 닫기 	
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
