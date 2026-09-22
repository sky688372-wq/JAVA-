package ex07;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle car = new Vehicle();
		car.setSpeed(-50);
		System.out.println("현재 속도 = " + car.getSpeed() + "km/h\n");
		car.setSpeed(50);
		System.out.println("현재 속도 = " + car.getSpeed() + "km/h\n");
		
		//참/거짓 부분
		car.setStop(false);
		System.out.println("현재 stop 상태 = " + car.isStop());
		System.out.println("현재 속도 = " + car.getSpeed() + "km/h\n");
		
		car.setStop(true);
		System.out.println("현재 stop 상태 = " + car.isStop());
		System.out.println("현재 속도 = " + car.getSpeed() + "km/h\n");
		
		
		
	}
}


class Vehicle {
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}
	
	public void setStop(boolean stop) {
		if (stop == false) {
			this.stop = false;
			return;
		} else {
			this.stop = true;
			this.speed = 0;
		}
	}
	
	public boolean isStop() {
		return this.stop;
	}
	
	
}