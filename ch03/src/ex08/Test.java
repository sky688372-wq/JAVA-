package ex08;

public class Test {
	public static void main(String[] args) {
		SuperAirplane superAirplane = new SuperAirplane();
		
		superAirplane.takeOff(); // 1. 이륙합니다.
		superAirplane.fly(); // 2. 일반 비행합니다.

		superAirplane.flyMode = superAirplane.SUPERSONIC_MODE; // -> flyMode를 바꾸어서 fly 함수 호출 시 초음속 비행 출력이 나오도록 함
		superAirplane.fly(); // 3. 초음속 비행을 합니다.

		superAirplane.flyMode = superAirplane.NORMAL_MODE;
		superAirplane.fly(); // 4. 일반 비행합니다.

		// 줄바꿈용 프린트
		System.out.println();

		superAirplane.lane(); // 5. 착륙합니다.
	}
}

class Airplane {
	public void takeOff() {
		System.out.println("이륙합니다.");
		System.out.println();
	}

	public void fly() {
		System.out.println("일반 비행합니다.");
	}

	public void lane() {
		System.out.println("착륙합니다.");
	}
}

class SuperAirplane extends Airplane {
	final public int NORMAL_MODE = 1;
	final public int SUPERSONIC_MODE = 2;
	int flyMode = NORMAL_MODE;

	// 메서드 fly 오버라이딩
	public void fly() {
		if (flyMode == SUPERSONIC_MODE) {
			System.out.println("초음속 비행을 합니다.");
			return;
		}
		super.fly();
	}
}