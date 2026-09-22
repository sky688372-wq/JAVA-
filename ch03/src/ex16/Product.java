package ex16;

public class Product {
	String pr_name;
	int pd_price;
	
	public Product(String pr_name, int pd_price) {
		this.pr_name = pr_name;
		this.pd_price = pd_price;
	}
	
	void showInfo() {
		System.out.println("제품명 : " + pr_name + "- 가격: "  + pd_price);
	}
}
