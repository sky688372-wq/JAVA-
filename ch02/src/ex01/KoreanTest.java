package ex01;

public class KoreanTest {
	public static void main(String[] args) {
		Korean k1 = new Korean("한겨율", 20);
		
		System.out.println("k1.nation = " + k1.nation);
		System.out.println("k1.name = " + k1.name);
		System.out.println("k1.age= " + k1.age);
	}
}

class Korean{
	String nation = "대한민국";
	String name;
	int age;
	
	public Korean(String name , int age) {
		this.name = name;
		this.age = age;
	}
	
}