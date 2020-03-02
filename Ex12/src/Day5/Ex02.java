package Day5;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		int[] A = { 5, 1, 2, 7, 3 };
		int b;
// 선택, 삽입, 버블 > Arrays.sort(!A); 
		
		Arrays.sort(A);
		//선택정렬 
		for (int i = 0; i < A.length-1 ; i++) {
			for (int j = i+1 ; j < A.length; j++) {
				if (A[i] > A[j]) {
					b = A[j];
					A[j] = A[i];
					A[i] = b;
				}
			}
		}
// 버블정렬
//		for (int i = 0; i < A.length; i++) {
//			for (int j = 0; j < A.length - i - 1; j++) {
//				if (A[j] > A[j + 1]) {
//
//					b = A[j];
//					A[j] = A[j + 1];
//					A[j + 1] = b;
//				}
//
////			 1 5 2 7 3 *> 1 2 5 7 3 *>  1 2 5 7 3 *> 1 2 5 3 7 
////           1 2 3 5 7 *>//
//			}

//		}
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
		System.out.println("//////////");
		System.out.println(A[0]);
		System.out.println(A[1]);
		System.out.println(A[2]);
		System.out.println(A[3]);
		System.out.println(A[4]);
		
	}
}
