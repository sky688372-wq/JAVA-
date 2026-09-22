package ex05;

public class CircleTest {
	public static void main(String[] args) {
		Circle[] arr = {new Circle(10), new Circle(20), new Circle(30), new Circle(40), new Circle(50)};
		double[] area = new double[arr.length];
		for (int i = 0; i < arr.length; i++) {
			area[i] = arr[i].area();
			System.out.printf("C[%d]의 원의 넓이 = %.2f\n" , i, area[i]);
			
		}
	}
}
class Circle {
	double radius;
	
	//생성자
	public Circle(double radius) {
		this.radius = radius; //반지름
	}
	
	//매서드
	public double area() {
		return 3.14 * radius * radius;
	}
}
