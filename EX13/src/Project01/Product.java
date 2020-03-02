package Project01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Product {

	Scanner scan = new Scanner(System.in);

	String pCode; // 상품분류 코드//
	// B는 부츠 H 는 힐
	// S 샌들 R 은 런닝
	String pName; // 상품명
	int size; // 사이즈
	String color; // 컬러
	int price; // 가격
	int each; // 갯수
	String date; // 입고일
	int discount; // 할인율

	public Product(String pCode, String pName, int size, String color, int price, int each, String date) {
		this.pCode = pCode;
		this.pName = pName;
		this.size = size;
		this.color = color;
		this.price = price;
		this.each = each;
		this.date = date;
		this.discount = discount;
	}

	public String getpCode() {
		return pCode;
	}

	public String getpName() {
		return pName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getEach() {
		return each;
	}

	public void setEach(int each) {
		this.each = each;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int compareTo(Product si) { // 아래(가격) 정렬 클래스 기준 함수
		if (this.price > si.price) {
			return -1;
		} else if (this.price == si.price) {
			return 0;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) { // 메인메소드 테스트 ///
		List<Product> productList = new ArrayList<Product>();
		// 코드 네임 사이즈(), 컬러, 가격() 갯수() 데이트
		productList.add(new Product("202", "새신발", 270, "Blue", 27000, 3, "2019-08-08"));
		productList.add(new Product("203", "긴신발", 230, "Black", 90000, 3, "2019-02-18"));
		productList.add(new Product("206", "헌신발", 280, "Red", 21000, 3, "2019-07-08"));

		System.out.println("정렬전: " + productList.get(0).pName);
		System.out.println("정렬전: " + productList.get(1).pName);
		System.out.println("정렬전: " + productList.get(2).pName);

		Collections.sort(productList, new ProductNameComparator()); // 정렬 메소드 생성자 사용

		System.out.println(" 후 ");
		System.out.println("상품 이름 정렬후: ");
		productList.get(0).list();
		productList.get(1).list();
		productList.get(2).list();
		System.out.println("//////////////////////");
		System.out.println("정렬전: " + productList.get(0).pCode);
		System.out.println("정렬전: " + productList.get(1).pCode);
		System.out.println("정렬전: " + productList.get(2).pCode);

		Collections.sort(productList, new ProductCodeComparator()); // 정렬 메소드 생성자 사용

		System.out.println(" 후 ");
		System.out.println("코드 정렬후: ");
		productList.get(0).list();
		productList.get(1).list();
		productList.get(2).list();

		System.out.println("//////////////////////");
		System.out.println("정렬전: " + productList.get(0).price);
		System.out.println("정렬전: " + productList.get(1).price);
		System.out.println("정렬전: " + productList.get(2).price);

		Collections.sort(productList, new Descending()); // 테스트

		System.out.println(" 후 ");
		System.out.println("가격 정렬후: ");
		productList.get(0).list();
		productList.get(1).list();
		productList.get(2).list();

		System.out.println("//////////////////////");
		System.out.println("날짜 정렬전: ");
		productList.get(0).list();
		productList.get(1).list();
		productList.get(2).list();

		Collections.sort(productList, new ProductDateComparator()); // 정렬 메소드 생성자 사용

		System.out.println(" 후 ");
		System.out.println("날짜 정렬후: "); // 테스트
		productList.get(0).list();
		productList.get(1).list();
		productList.get(2).list();

		productList.get(0).listProduct(); // 전체리스트 출력안됨. list() 함수 for문으로 출력...
		for (int i = 0; i < productList.size(); i++) { // for문 리스트 출력
			productList.get(i).list();
		}

		System.out.println("새신발 검색 찾기~~~"); // 상품명 검색 테스트
		productList.get(0).findName("새신발");
		productList.get(1).findName("새신발");
		productList.get(2).findName("새신발");

		System.out.println("202 상품코드 검색.....");
		for (int i = 0; i < productList.size(); i++) { // 코드 검색테스트 (for)
			productList.get(i).findCode("202");
		}

		Collections.sort(productList, new AscendingSize()); // 테스트

		System.out.println(" 사이즈 정렬 중...");
		System.out.println("사이즈 정렬후: ");
		for (int i = 0; i < productList.size(); i++) { // for문 리스트 출력
			productList.get(i).list();
		}

	} // main 메소드 종료
	
	void list() { // 리스트 출력문
		
		System.out.println(pCode +"\t  "+ pName +"\t "+ size +"\t"+ color +"\t "+ price +"\t "+ each +"\t "+ date + "\t "+discount);
	}

	void listProduct() { // 전체 리스트 정보
		// Product T = new Product();
		System.out.println("전체 리스트");
		int count = Product.this.pCode.length();
		System.out.println("전체 상품수 : " + count);
		System.out.println("상품코드 \t " + " 상품명 \t" + " 사이즈 \t" + " 컬러 \t" + " 가격 \t " + " 갯수 \t " + " 입고일 \t\t" + " 할인율 ");
	}

	void findName(String f) { // 상품명 검색 (String equals)

		if (f.equals(pName)) {
			list();
		}
	}

	void findColor(String f) { // 컬러 검색 (String equals)

		if (f.equals(color)) {
			list();
		}
	}

	void findDate(String f) { // 날짜 검색 (String equals)

		if (f.equals(date)) {
			list();
		}
	}

	void findCode(String f) { // 상품코드 검색 (String equals)

		if (f.equals(pCode)) {
			list();
		}
	}
}

class ProductNameComparator implements Comparator<Product> { // 어레이리스트 이름 정렬 메소드
	@Override
	public int compare(Product pName1, Product pName2) {
		// TODO Auto-generated method stub
		String pName11 = pName1.getpName();
		String pName21 = pName2.getpName();
		return pName11.compareTo(pName21);
	}
}

class ProductCodeComparator implements Comparator<Product> { // 리스트 코드 정렬 메소드
	@Override
	public int compare(Product pCode1, Product pCode2) {
		// TODO Auto-generated method stub
		String pCode11 = pCode1.getpCode();
		String pCode21 = pCode2.getpCode();
		return pCode11.compareTo(pCode21);
	}
}

class ProductColorComparator implements Comparator<Product> { // 리스트 컬러 정렬 메소드
	@Override
	public int compare(Product color1, Product color2) {
		// TODO Auto-generated method stub
		String pcolor11 = color1.getColor();
		String pcolor21 = color2.getColor();
		return pcolor11.compareTo(pcolor21);
	}
}

class ProductDateComparator implements Comparator<Product> { // 리스트 날짜 정렬 메소드
	@Override
	public int compare(Product date1, Product date2) {
		// TODO Auto-generated method stub
		String pdate11 = date1.getDate();
		String pdate21 = date2.getDate();
		return pdate11.compareTo(pdate21);
	}
}

// 오름차순 정렬(가격)
class AscendingPrice implements Comparator<Product> {
	public int compare(Product o1, Product o2) {
		int price11 = o1.getPrice();
		int price21 = o2.getPrice();
		return o1.compareTo(o2);
	}
}

//내림차순 정렬 (가격)
class Descending implements Comparator<Product> {
	public int compare(Product o1, Product o2) {
		int price11 = o1.getPrice();
		int price21 = o2.getPrice();
		return o2.compareTo(o1);
	}
}

//오름차순 정렬(사이즈)
class AscendingSize implements Comparator<Product> {
	public int compare(Product o1, Product o2) {
		int size11 = o1.getSize();
		int size21 = o2.getSize();
		return o1.compareTo(o2);
	}
}

//내림차순 정렬 (사이즈)
class DescendingSize implements Comparator<Product> {
	public int compare(Product o1, Product o2) {
		int size11 = o1.getSize();
		int size21 = o2.getSize();
		return o2.compareTo(o1);
	}
}
