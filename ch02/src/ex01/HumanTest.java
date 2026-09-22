package ex01;

public class HumanTest {
	public static void main(String[] args) {
		Human h1 = new Human();
		System.out.println("이름 : " + h1.name);
		System.out.println("신장 : " + h1.height + "cm");
		System.out.println("체중 : " + h1.weight + "kg");
	}
}


class Human {
	String name = "길동";
	int height = 175;
	int weight = 65;
}