package Day6;

public class Ex01 {
	public static void main(String[] args) {
		
	
	// �Լ��̸��� ���Ƶ� �Ű����� Ÿ��,���� �ٸ��� �ٸ������� �ν�> ��밡�� (�����ε�)
	// �Ű�����=�Ķ���� ()  
	// Ŭ���� �̸��� ������ �̸��� ���� > ������ (�����Ǿ��� �� Ž )
   // �Լ��̸� ������ �Ű����� ������ Ÿ���� �ٸ��� ��밡���� ��� (�����ε�)
		
		Day[] mDay = new Day[3];
		//mDay[3] = new Day();
		
		int j = 3;
		for(int i = j ; j > 1 ; ) {
			i = i*(j-1);
			j--;
			System.out.println(i);
		}	
	}
		Day na = new Day();
	
}

class Day {
	int n = 10;
	int b = 0;
	static int bb = 1 ;
	
	int Day[] ;
	
	// ������: �����Ҷ��� ź��. / ���� �ҷ��� �� ����
	Day(){
		System.out.println("day1 ....");
	}
	 
	{
	 //�ʱ�ȭ����(�ʱ�ȭ��) ������ ����(�ʱ�ȭ) �ؼ� �� 
		n = 1;
		b = 3;
		bb = 2; //
	}
	static { //����ƽ�� ���� // �Ⱦ� 
		bb = 3; 
	}
	static int B (int b) {
		if (b>=1 ) {
			return B(b+b) + b;
		} else {
		return b;
		}
	}
	int A (int n) { // factorial() 
		
		if ( n <= 1 ) {
			return n;
			// A(1);//* ����Լ� (���ѷ���)
		} else { 
			return A (n-1) * n ;
			 
		}
		
	}
	
}
