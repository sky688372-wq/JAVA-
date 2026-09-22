package ex15;

public class InstanceofTest {
	//m1 정적 매서드 : if문 포함
	static void m1(Parent p) {
		if (p instanceof Child) {
			Child child = (Child)p;
			System.out.println("m1() - Child타입으로 강제 타입 변환 성공");
		} else {
			System.out.println("m2() - CHild타입으로 강제 타입 변환 불가");
		}
	}
	
	//m2 정적 매서드
	static void m2(Parent p) {
		Child child = (Child)p; //만일 Child객체가 아닐 경우에는 오류가 난다.
		System.out.println("m2() - Child 타입으로 강제 변환");
	}
	
	//메인 매서드
	public static void main(String[] args) {
		Parent p = new Child();
		m1(p);
		m2(p);
		
		System.out.println("---------------------------");
		
		p = new Parent();
		m1(p);
//		m2(p); // 이제 P를 넣으면 조건문이 없어서 classCastExpetion 오류가 나온다.
	}
}

class Parent {
	
}

class Child extends Parent {
	
}
