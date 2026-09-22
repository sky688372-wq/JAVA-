package ex09;

public class Car {
	int speed = 0;
	
	public void speedUp() {
		speed++; //speed를 1씩 증가
	}
	
	final public void stop() { //final 매서드라서 자식에서 재정의 불가(오버라이딩)
		System.out.println("차 멈춤");
		speed = 0;
	}
	
	
}

class SportCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//컴파일의 stop매서드가 final 키워드로 선언되었으므로 재정의 불가하다. -> 시험 100
//	@Override
//	public void stop() {
//		System.out.println("스포츠카 불가");
//		speed = 0;
//	}
}
