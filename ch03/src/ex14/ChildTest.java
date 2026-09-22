package ex14;

public class ChildTest {
	public static void main(String[] args) {
		Parent p = new Child();
		
		p.f1 = "data";
		p.m1();
		p.m2();
		
		//child의 멤버여서 접근 불가함ㅂ
//		p.f2 = "base"; //접근 불가 -> 현재 상태는 업 캐스팅 상태이기 때문
//		p.m3(); // 접근 불가 -> 업캐스팅 때문

		//다운 캐스팅 부분 -> 다운 캐스팅해서 원래 자식 객체에 접근 가능함
		Child ch = (Child)p;
		ch.f2 = "yyy";
		ch.m3();
	}
}

class Parent {
	public String f1;

	public void m1() {
		System.out.println("Parent의 m1()");
	}
	
	public void m2() {
		System.out.println("Parent의 m2()");
	}
	
}

class Child extends Parent {
	public String f2;
	
	public void m3() {
		System.out.println("Child의 m3()");
	}
}