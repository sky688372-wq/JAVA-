package ex05;

public class CalTest {
	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.printf("%d + %d = %d\n", 7, 10, c.plus(7, 10));
		
		System.out.printf("(%d + %d)/2 = %.2f\n", 7, 10, c.average(7, 10));
	}
}

class Cal {
	public int plus(int x, int y) {
		return x + y;
	}
	
	public double average(int x, int y) {
		double sum = plus(x, y);
		return sum / 2;
	}
}