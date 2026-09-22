package ex05;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.powerOn();
		System.out.printf("sum = %d\n", cal.add(5, 2));
		System.out.printf("divide = %.1f\n", cal.divide(5, 2));
		cal.PowerOff();
	}
}

class Calculator {
	//필드
	boolean isPowerOn = false;
	
	//매서드
	public void powerOn() {
		System.out.println("전원 on");
		this.isPowerOn = true;
	}
	
	public void PowerOff() {
		System.out.println("전원 off");
		this.isPowerOn = false;
	}
	
	public int add(int x, int y) {
		if (isPowerOn) {
			return x + y;			
		}
		else {
			System.out.println("계산기의 전원이 켜지지 않았습니다.");
			return -1;
		}
		
	}
	
	
	public double divide(int x, int y) {
		if (isPowerOn) {
			return (double)x / y;			
		}
		else {
			System.out.println("계산기의 전원이 켜지지 않았습니다.");
			return -1;
		}
	}
	
}