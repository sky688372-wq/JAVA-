package ex17;

public class GameSystem { //실행 클래스
	void excuteSkill(Charactor c) {
		if (c instanceof Warrior) { //입력 되는 객체가 전사라면
			Warrior w = (Warrior)c;
			w.attack();
			w.shildBlock();
			System.out.println();
		} else if(c instanceof Wizard) { //만일 입력되는 객체가 마법사라면
			Wizard w = (Wizard) c;
			w.attack();
			w.heal();
			System.out.println();
		} else { //만일 그냥 캐릭터 클래스일 경우 처리
			c.attack();
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		GameSystem g = new GameSystem();
		g.excuteSkill(new Warrior("아서"));
		g.excuteSkill(new Wizard("멀린"));
		g.excuteSkill(new Wizard("멀린"));
	}
}

