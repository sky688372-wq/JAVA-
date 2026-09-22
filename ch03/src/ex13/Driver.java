package ex13;

public class Driver {
	public void drive(Vehicle vh) { //부모, 자식 객체를 넣을 수 있음
		vh.run();
	}
	
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Driver driver = new Driver();
		Bus bus = new Bus();
		Texi texi = new Texi();
		
		driver.drive(v);
		driver.drive(bus);
		driver.drive(texi);
		
		//이렇게도 가능함
		System.out.println();
		
		driver.drive(new Vehicle());
		driver.drive(new Bus());
		driver.drive(new Texi());
	}
}
