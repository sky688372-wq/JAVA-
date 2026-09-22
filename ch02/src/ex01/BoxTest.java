package ex01;

public class BoxTest {
	public static void main(String[] args) {
		Box b1 = new Box(10, 20, 30);
		System.out.printf("가로: %d 세로: %d 깊이: %d\n", b1.width, b1.height, b1.depth);
		System.out.printf("BOX의 부피: %,d", + b1.width * b1.height * b1.depth);
	}
}

class Box{
	int width;
	int height;
	int depth;
	
	public Box(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}