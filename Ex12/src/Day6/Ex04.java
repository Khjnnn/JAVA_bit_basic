package Day6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList<String> mB = new LinkedList<String>();
		mB.add("사용자1");
		mB.add("사용자2");
		mB.add("사용자3");
		System.out.println(mB.get(0));
		System.out.println(mB.get(1));
		System.out.println(mB.size());
		mB.remove(1);
		System.out.println(mB.size());
		System.out.println(mB.get(1));

		ArrayList<Integer> mA1 = new ArrayList<Integer>(); // <> 제네릭 : 클래스가 들어감 (String,Integer)
		ArrayList<String> mArrayList = new ArrayList<String>(); 
		System.out.println("몇명 입력할래?");
		int num = scan.nextInt();
		scan.nextLine();
		for(int i= 0 ; i<num ; i++) {
			mArrayList.add(scan.nextLine());
		}
		System.out.println("입력하신 이름은");
		for (int i = 0; i < mArrayList.size(); i++) {
			System.out.print(mArrayList.get(i)+" ");
		}
		System.out.println(" 입니다");
		System.out.println("총 " + mArrayList.size() + "명 입니다");
		
		HashMap<String, String> m = new HashMap<String, String>();
		m.put(scan.next(), "ww");
		m.put("222", "dd");
		m.put("영어", "50");
		m.put("국어", "80");
		System.out.println(m.get("111"));
		
		
	}

}
