package Day5;

public class Ex01 {
	public static void main(String[] args) {
		int [][] arr = {{1,2},{3,4},{6,5}};
		int [][][] arr1 = {
			{{1,2},{3,4}},	
			{{5,6},{7,8}},
			{{19,17},{18,22}}, 
			{{9,10},{11,12}},
			{{13,14},{15,16}},
			{{123}}
		};
		
		System.out.println(arr1.length);
		System.out.println(arr1[5].length);
		System.out.println(arr1[0].length);
		System.out.println(arr1[0][0]);
				
		System.out.println(arr1[1]);
		System.out.println(arr1[1][0]);
		
		System.out.println(arr1[2]);
		System.out.println(arr1[2][0][0]);
		
		System.out.println("////////////////");
		System.out.println(arr[0].length);
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[0]);
				
		System.out.println(arr[1]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
	}
	
	
}
