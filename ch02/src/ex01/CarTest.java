package ex01;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println("제작 회사 : " + myCar.company);
		System.out.println("모델 : " + myCar.model);
		System.out.println("최고 속도 : " + myCar.maxSpeed);
		System.out.println("현재 속도 : " + myCar.currentSpeed);
		myCar.currentSpeed = 60;
		System.out.println("수정된 속도 : " + myCar.currentSpeed);
	}
}

class Car{
	String company = "현대 자동차";
	String model = "그랜저";
	int maxSpeed = 350;
	int currentSpeed;
	
}

