package Day5;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		int b = 0;
		int j = 1;
		int[] arr = new int[45];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = j;
			j++;
			System.out.println(arr[i]);
		}
		System.out.println("이번주 로또 번호는요 !!!!");

		for (int i = 0; i < arr.length - 1; i++) {

			//int c = (int) ((Math.random() * 100 / 2 / 1.16 + 1));
			int c = (int)((Math.random()*45)) ;
			if (arr[c] > arr[i]) {
				b = arr[c];
				arr[c] = arr[i];
				arr[i] = b;
			}
		}
		
		for (int i = 0; i < 7; i++) {
			System.out.println(arr[i]);
		}

	}
}
