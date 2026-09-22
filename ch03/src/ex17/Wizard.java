package ex17;

public class Wizard extends Charactor{
	@Override
	void attack() {
		System.out.println(name + "가 파이어볼을 발사합니다.");
	}
	
	void heal() {
		System.out.println(name + "가 체력을 회복합니다.");
	}
	
	public Wizard(String name) {
		super(name);
	}
}
