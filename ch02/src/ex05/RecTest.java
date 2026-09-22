package ex05;

public class RecTest {
	public static void main(String[] args) {
		Rec rec = new Rec();
		rec.areaRec(10);
		rec.areaRec(10, 20);
		rec.areaRec(2.5, 3.3);
	}
}

class Rec {
	public void areaRec(int a) {
		System.out.printf("정사가형의 넓이 = %d\n", a * a);
	}
	
	public void areaRec(int a, int b) {
		System.out.printf("직사각형의 넓이 = %d\n", a * b);
	}
	public void areaRec(double a, double b) {
		System.out.printf("직사각형의 넓이 = %.2f\n", a * b);
	}
}
