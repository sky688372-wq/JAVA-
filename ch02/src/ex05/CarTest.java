package ex05;

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car();
		c.keyTurnOn();
		c.speed = 30;
		c.run();
		System.out.printf("현재 속도 : %d", c.getSpeed());
		
		
	}
}
class Car {
	int speed;
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void keyTurnOn() {
		System.out.println("시동을 켭니다.");
	}
	
	public void run() {
		System.out.printf("주행합니다.(시속 : %d)\n", speed);
		while (this.speed < 50) {
			this.speed += 10;
			System.out.printf("주행합니다.(시속 : %d)\n", speed);
			
		}
	}
}
