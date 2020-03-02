package Project01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Point {

	private String name;
	private Integer point;

	public Point(String name, Integer point) {
		this.name = name;
		this.point = point;
	}
	@Override
	public String toString() {
		return "(" + name + "," + point + ")";
	}
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getPoint() {
		// TODO Auto-generated method stub
		return null;
	}

}

class ArrayList_B { 
	public static void main(String[] args) {
				
		ArrayList<Point> arrayList = new ArrayList<Point>();

		// (k, 30) (w, 20) (a, 50) (z, 40) (f, 0) (g, 90)
		arrayList.add(new Point("k", 30));
		arrayList.add(new Point("w", 20));
		arrayList.add(new Point("a", 50));
		arrayList.add(new Point("z", 40));
		arrayList.add(new Point("f", 0));
		arrayList.add(new Point("g", 90));

		for (Point p : arrayList) {
			System.out.print(p);
		}
		System.out.println();

		// 내림차순 정렬
		DescendingObj descending = new DescendingObj();
		Collections.sort(arrayList, descending);

		System.out.print("Name 내림차순 - ");
		for (Point p : arrayList) {
			System.out.print(p);
		}
		System.out.println();

		// 오름차순 정렬
		AscendingObj ascending = new AscendingObj();
		Collections.sort(arrayList, ascending);

		System.out.print("Point1 오름차순 - ");
		for (Point p : arrayList) {
			System.out.print(p);
		}
		System.out.println();
	}

}

// String 내림차순
class DescendingObj implements Comparator<Point> {

	@Override
	public int compare(Point o1, Point o2) {
		return o2.getName().compareTo(o1.getName());
	}

	public int compare1(Point o1, Point o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}

// Integer 오름차순
 class AscendingObj implements Comparator<Point> {

	@Override
	    public int compare(Point o1, Point o2) {
	        return o1.getPoint().compareTo(o2.getPoint());
	    }
}