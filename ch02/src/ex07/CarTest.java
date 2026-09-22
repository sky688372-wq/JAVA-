package ex07;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car("그랜저");
		System.out.println(car.model);
		car.run(50);
		
		Car yourCar = new Car("모닝");
		System.out.println(yourCar.model);
		yourCar.run(50);
	}
}

class Car {
	// 필드(인스턴스 필드, 객체 생성 시 필드 초기화)
	String model;

	public Car(String model) {
		this.model = model;
	}
	
	// 매서드
	void run(int speed) {
		System.out.printf("%s가 %dkm/h로 달립니다.\n", this.model, speed);
	}
	
}