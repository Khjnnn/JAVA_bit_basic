package Day1118;

import java.io.File;
import java.io.FileReader;

public class Ex04 {
	public static void main(String[] args) {

		String test1 = "[test1,1234],[test2,3456],[test3,7891]";
		String arr[] = test1.split("]");
		String Data[] = new String[50];
		
		for (int i=0;i<arr.length ; i++) {
			Data = arr[i].split(",");
			for(int j=0;j < Data.length;j++) {
				try { 
					if(Data[j].charAt(0)=='[') {

						String a = "";
						for (int nn=1 ; nn<Data[j].length() ; nn++)
						{
						a+=Data[j].charAt(nn);
						}
						System.out.println("아이디: "+a);
						
					} 
					else {
						System.out.println("패스워드 : " + Data[j]);
					  }
					} catch (Exception e) {
						
					}
			}	
		
	}
	}
	
}
