package ex03;

public class Main {
	public static void main(String[] args) {
		Tv tv = new Tv(); //참조 객체
		tv.printPrice();
	}
}

class Product {
	int price = 1000; // 인스턴스, default
}

class Tv extends Product {
	int price = 5000;

	public void printPrice() {
		System.out.println("Product 클래스의 price = " + super.price); //부모 필드 호출 시 super사용
		System.out.println("Tv클래스의 price = " + price); // 자식 필드는 그대로 사용(우선 적용)
	}
}