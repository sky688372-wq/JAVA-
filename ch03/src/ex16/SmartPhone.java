package ex16;

public class SmartPhone extends Product {
	public SmartPhone(String pr_name, int pd_price) {
		super(pr_name, pd_price);
	}
	
	
	void call(String phoneNumber) {
		System.out.println(pr_name + "에서 " + phoneNumber + "으로 전회를 겁니다.");
	}
}