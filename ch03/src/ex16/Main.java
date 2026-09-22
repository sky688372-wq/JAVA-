package ex16;

public class Main {
	public static void main(String[] args) {
		Product[] products = new Product[3]; // 스마트폰,  Tv객체도 저장하려면 부모 클래스로 만들어야 함
		products[0] = new Tv("OLED TV", 150000);
		products[1] = new SmartPhone("Galaxy", 120000);
		products[2] = new Tv("QLED", 180000);
		
		for (Product product : products) {
			product.showInfo();
			
			if (product instanceof Tv) { //만일 Tv참조 객체라면
				Tv tv = (Tv)product;
				tv.changeChannel(7);
				System.out.println();
			} else {
				SmartPhone phone = (SmartPhone)product;
				phone.call("010-1234-5678");
				System.out.println();
			}
		}
		
		
		
	}
}
