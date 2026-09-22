package ex17;

public class Charactor {
	String name;

	public Charactor(String name) {
		this.name = name;
	}
	
	void attack() {
		System.out.println(name + "가 공격합니다.");
	}
}
