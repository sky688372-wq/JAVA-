package ex17;

public class Warrior extends Charactor{
	@Override
	void attack() {
		System.out.println(name + "가 대검으로 공격합니다.");
	}
	
	void shildBlock() {
		System.out.println(name + "가 방패로 공격을 방어합니다.");
	}
	
	public Warrior(String name) {
		super(name);
	}
}
