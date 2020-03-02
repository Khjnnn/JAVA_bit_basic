package Project01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Product {

	Scanner scan = new Scanner(System.in);

	String pCode; // ��ǰ�з� �ڵ�//
	// B�� ���� H �� ��
	// S ���� R �� ����
	String pName; // ��ǰ��
	int size; // ������
	String color; // �÷�
	int price; // ����
	int each; // ����
	String date; // �԰���
	int discount; // ������

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

	public int compareTo(Product si) { // �Ʒ�(����) ���� Ŭ���� ���� �Լ�
		if (this.price > si.price) {
			return -1;
		} else if (this.price == si.price) {
			return 0;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) { // ���θ޼ҵ� �׽�Ʈ ///
		List<Product> productList = new ArrayList<Product>();
		// �ڵ� ���� ������(), �÷�, ����() ����() ����Ʈ
		productList.add(new Product("202", "���Ź�", 270, "Blue", 27000, 3, "2019-08-08"));
		productList.add(new Product("203", "��Ź�", 230, "Black", 90000, 3, "2019-02-18"));
		productList.add(new Product("206", "��Ź�", 280, "Red", 21000, 3, "2019-07-08"));

		System.out.println("������: " + productList.get(0).pName);
		System.out.println("������: " + productList.get(1).pName);
		System.out.println("������: " + productList.get(2).pName);

		Collections.sort(productList, new ProductNameComparator()); // ���� �޼ҵ� ������ ���

		System.out.println(" �� ");
		System.out.println("��ǰ �̸� ������: ");
		productList.get(0).list();
		productList.get(1).list();
		productList.get(2).list();
		System.out.println("//////////////////////");
		System.out.println("������: " + productList.get(0).pCode);
		System.out.println("������: " + productList.get(1).pCode);
		System.out.println("������: " + productList.get(2).pCode);

		Collections.sort(productList, new ProductCodeComparator()); // ���� �޼ҵ� ������ ���

		System.out.println(" �� ");
		System.out.println("�ڵ� ������: ");
		productList.get(0).list();
		productList.get(1).list();
		productList.get(2).list();

		System.out.println("//////////////////////");
		System.out.println("������: " + productList.get(0).price);
		System.out.println("������: " + productList.get(1).price);
		System.out.println("������: " + productList.get(2).price);

		Collections.sort(productList, new Descending()); // �׽�Ʈ

		System.out.println(" �� ");
		System.out.println("���� ������: ");
		productList.get(0).list();
		productList.get(1).list();
		productList.get(2).list();

		System.out.println("//////////////////////");
		System.out.println("��¥ ������: ");
		productList.get(0).list();
		productList.get(1).list();
		productList.get(2).list();

		Collections.sort(productList, new ProductDateComparator()); // ���� �޼ҵ� ������ ���

		System.out.println(" �� ");
		System.out.println("��¥ ������: "); // �׽�Ʈ
		productList.get(0).list();
		productList.get(1).list();
		productList.get(2).list();

		productList.get(0).listProduct(); // ��ü����Ʈ ��¾ȵ�. list() �Լ� for������ ���...
		for (int i = 0; i < productList.size(); i++) { // for�� ����Ʈ ���
			productList.get(i).list();
		}

		System.out.println("���Ź� �˻� ã��~~~"); // ��ǰ�� �˻� �׽�Ʈ
		productList.get(0).findName("���Ź�");
		productList.get(1).findName("���Ź�");
		productList.get(2).findName("���Ź�");

		System.out.println("202 ��ǰ�ڵ� �˻�.....");
		for (int i = 0; i < productList.size(); i++) { // �ڵ� �˻��׽�Ʈ (for)
			productList.get(i).findCode("202");
		}

		Collections.sort(productList, new AscendingSize()); // �׽�Ʈ

		System.out.println(" ������ ���� ��...");
		System.out.println("������ ������: ");
		for (int i = 0; i < productList.size(); i++) { // for�� ����Ʈ ���
			productList.get(i).list();
		}

	} // main �޼ҵ� ����
	
	void list() { // ����Ʈ ��¹�
		
		System.out.println(pCode +"\t  "+ pName +"\t "+ size +"\t"+ color +"\t "+ price +"\t "+ each +"\t "+ date + "\t "+discount);
	}

	void listProduct() { // ��ü ����Ʈ ����
		// Product T = new Product();
		System.out.println("��ü ����Ʈ");
		int count = Product.this.pCode.length();
		System.out.println("��ü ��ǰ�� : " + count);
		System.out.println("��ǰ�ڵ� \t " + " ��ǰ�� \t" + " ������ \t" + " �÷� \t" + " ���� \t " + " ���� \t " + " �԰��� \t\t" + " ������ ");
	}

	void findName(String f) { // ��ǰ�� �˻� (String equals)

		if (f.equals(pName)) {
			list();
		}
	}

	void findColor(String f) { // �÷� �˻� (String equals)

		if (f.equals(color)) {
			list();
		}
	}

	void findDate(String f) { // ��¥ �˻� (String equals)

		if (f.equals(date)) {
			list();
		}
	}

	void findCode(String f) { // ��ǰ�ڵ� �˻� (String equals)

		if (f.equals(pCode)) {
			list();
		}
	}
}

class ProductNameComparator implements Comparator<Product> { // ��̸���Ʈ �̸� ���� �޼ҵ�
	@Override
	public int compare(Product pName1, Product pName2) {
		// TODO Auto-generated method stub
		String pName11 = pName1.getpName();
		String pName21 = pName2.getpName();
		return pName11.compareTo(pName21);
	}
}

class ProductCodeComparator implements Comparator<Product> { // ����Ʈ �ڵ� ���� �޼ҵ�
	@Override
	public int compare(Product pCode1, Product pCode2) {
		// TODO Auto-generated method stub
		String pCode11 = pCode1.getpCode();
		String pCode21 = pCode2.getpCode();
		return pCode11.compareTo(pCode21);
	}
}

class ProductColorComparator implements Comparator<Product> { // ����Ʈ �÷� ���� �޼ҵ�
	@Override
	public int compare(Product color1, Product color2) {
		// TODO Auto-generated method stub
		String pcolor11 = color1.getColor();
		String pcolor21 = color2.getColor();
		return pcolor11.compareTo(pcolor21);
	}
}

class ProductDateComparator implements Comparator<Product> { // ����Ʈ ��¥ ���� �޼ҵ�
	@Override
	public int compare(Product date1, Product date2) {
		// TODO Auto-generated method stub
		String pdate11 = date1.getDate();
		String pdate21 = date2.getDate();
		return pdate11.compareTo(pdate21);
	}
}

// �������� ����(����)
class AscendingPrice implements Comparator<Product> {
	public int compare(Product o1, Product o2) {
		int price11 = o1.getPrice();
		int price21 = o2.getPrice();
		return o1.compareTo(o2);
	}
}

//�������� ���� (����)
class Descending implements Comparator<Product> {
	public int compare(Product o1, Product o2) {
		int price11 = o1.getPrice();
		int price21 = o2.getPrice();
		return o2.compareTo(o1);
	}
}

//�������� ����(������)
class AscendingSize implements Comparator<Product> {
	public int compare(Product o1, Product o2) {
		int size11 = o1.getSize();
		int size21 = o2.getSize();
		return o1.compareTo(o2);
	}
}

//�������� ���� (������)
class DescendingSize implements Comparator<Product> {
	public int compare(Product o1, Product o2) {
		int size11 = o1.getSize();
		int size21 = o2.getSize();
		return o2.compareTo(o1);
	}
}
