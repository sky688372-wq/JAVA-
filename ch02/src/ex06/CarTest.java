package ex06;

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car("씽씽이", 60);
		c.run();
		c.setSpeed(30);
		c.run();
		System.out.println();
		System.out.println("====================================");
		
		Car c2 = new Car("붕붕이", 20);
		c2.run();
	}
}

class Car {
	String model;
	int speed;
	
	public Car(String model, int speed) { //스피드도 같이 생성
		this.model = model;
		this.speed = speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void run() {
		System.out.println(this.model + "이 달립니다.(시속: " + this.speed + "km/h)");
		
		while (this.speed < 50) { //~ 동안 				
			this.speed += 10;
			System.out.println(this.model + "이 달립니다.(시속: " + this.speed + "km/h)");
		}
	}
}