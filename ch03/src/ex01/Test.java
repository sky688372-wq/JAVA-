package ex01;

public class Test {
	public static void main(String[] args) {
		
		//static 필드는 클래스가 공유하지만, 
		//인스턴스 필드는 상속되어도 객체마다 독립적인 저장 공간을 가지며, 
		//같은 이름으로 재선언하면 부모 필드를 숨긴다.
		
		//실제로 이 부분은 
		System.out.println("C1의 x값 = " + C1.getX()); //C1.getX로 불러오기 불가능함
		System.out.println("C1의 y값 = " + C1.y);
		System.out.println("C1의 z값 = " + C1.z);
		
		System.out.println();
		
		System.out.println("C1에서 상속 받은 C2의 x의 값 = " + C2.getX());
		System.out.println("C2의 x의 값 = " + C2.x);
		System.out.println("C2의 y의 값 = " + C2.y);
		System.out.println("C1에서 상속받은 C2의 z값= " + C2.z);
		
		System.out.println();
		
		//값 변경 부분
		C2.x = "자바 화이팅!!!";
		C2.y = 200;
		C2.z = 300;
		
		System.out.println();
		
		System.out.println("C1의 x의 값 = " + C1.getX());
		System.out.println("C1의 y의 값 = " + C1.y);
		System.out.println("C1의 z의 값 = " + C1.z);
		
		System.out.println();
		
		System.out.println("C2의 x값 = " + C2.x);
		System.out.println("C2의 y값 = " + C2.y);
		System.out.println("C2의 z값 = " + C2.z);
		
		
	}
}

class C1 {
	private static int x = 100;
	public static int y = x;
	static int z = x;
	
	//gettter 메서드
	public static int getX() {
		return x;
	}
}

class C2 extends C1{
	public static String x;
	static int y;	
}

