package Day6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList<String> mB = new LinkedList<String>();
		mB.add("�����1");
		mB.add("�����2");
		mB.add("�����3");
		System.out.println(mB.get(0));
		System.out.println(mB.get(1));
		System.out.println(mB.size());
		mB.remove(1);
		System.out.println(mB.size());
		System.out.println(mB.get(1));

		ArrayList<Integer> mA1 = new ArrayList<Integer>(); // <> ���׸� : Ŭ������ �� (String,Integer)
		ArrayList<String> mArrayList = new ArrayList<String>(); 
		System.out.println("��� �Է��ҷ�?");
		int num = scan.nextInt();
		scan.nextLine();
		for(int i= 0 ; i<num ; i++) {
			mArrayList.add(scan.nextLine());
		}
		System.out.println("�Է��Ͻ� �̸���");
		for (int i = 0; i < mArrayList.size(); i++) {
			System.out.print(mArrayList.get(i)+" ");
		}
		System.out.println(" �Դϴ�");
		System.out.println("�� " + mArrayList.size() + "�� �Դϴ�");
		
		HashMap<String, String> m = new HashMap<String, String>();
		m.put(scan.next(), "ww");
		m.put("222", "dd");
		m.put("����", "50");
		m.put("����", "80");
		System.out.println(m.get("111"));
		
		
	}

}
