package ex05;

public class BoxTreeTest {
	public static void main(String[] args) {
		BoxTree b1 = new BoxTree(10, 20, 30);
		BoxTree b2 = new BoxTree(10.5, 20.5, 30.5);
		BoxTree b3 = new BoxTree(10, 20, 30.5);
		
		System.out.println("b1의 Box부피(정수) = " + b1.ivol);
		System.out.println("b2의 Box부피(실수) = " + b2.dvol);
		System.out.println("b1의 Box부피(정수와 실수의 혼합) = " + b3.dvol);
	}
}

class BoxTree {
	int ivol;
	double dvol;
	
	public BoxTree(int w , int h, int d) {
		volume(w, h, d);
	}
	
	public BoxTree(double w , double h, double d) {
		volume(w, h, d);
	}
	
	
	public void volume(int w, int h, int d) {
		this.ivol =  w * h * d;
	}
	
	public void volume(double w, double h, double d) {
		this.dvol =  w * h * d;
	}
}
