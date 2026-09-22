package ecx06;

public class Test {
	public static void main(String[] args) {
		Account normal = new Account(50000);
		MinusAccount special = new MinusAccount(5000);
		
		System.out.println("--- 일반 계좌 테스트 ---");
		normal.withDraw(45000);
		
		System.out.println();
	
		System.out.println("--- 일반 계좌 테스트 ---");
		normal.withDraw(7000);
		
		System.out.println("\n--- 마이너스 계좌 테스트 ---");
		special.withDraw(7000);
	}
}

class Account {
	int balance;
	
	// 생성자
	Account(int balance) {
		this.balance = balance;
	}
	
	void withDraw(int account) {
		if (this.balance < account) {
			System.out.println("잔액 부족");
			System.out.println("잔액 : " + this.balance + "원");
			return;
		}
		balance -= account;
		System.out.println(account + "원이 출금");
		System.out.println("잔액 : " + this.balance + "원");
	}
}
 
class MinusAccount extends Account {
	
	// 생성자
	public MinusAccount(int balance) {
		super(balance);
	}

	@Override
	void withDraw(int account) {
		balance -= account;
		System.out.println("마이너스 통장에서 " + account + "원이 출금");
		System.out.println("잔액 : " + this.balance + "원");
	}
}