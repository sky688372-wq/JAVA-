package ex04;

// 클래스 B는 클래스 A를 상속받음 (A: 부모/상위 클래스, B: 자식/하위 클래스)
public class B extends A {
	// [필드 은닉 (Field Hiding)]
	// 부모 A의 private int x와 별개로 자식 B만의 String x를 선언
	public String x; 
	// 부모 A의 public int y와 별개로 자식 B만의 int y를 선언 (default 접근 제어자)
	int y;
	
	// 부모 클래스 A의 private 변수 x의 값을 출력하는 메서드
	public void print_x() {
		// x는 private이므로 부모의 getX() 메서드를 호출하여 접근함
		System.out.println("A클래스의 x값은 " + getX() + "이다");
	}
	
	// 부모 클래스 A의 y 값을 변경하고 출력하는 메서드
	public void print_y() {
		// super 키워드를 통해 자식 B의 y가 아닌 부모 A의 멤버 변수 y에 접근하여 100을 대입
		super.y = 100;
		System.out.println("A클래스의 y값은 " + super.y + "이다.");
	}
	
	public static void main(String[] args) {
		// B 클래스 인스턴스 생성 (부모 A 객체도 함께 메모리에 생성됨)
		B mb = new B();
		
		// mb를 통해 x와 y에 접근할 때는 자식 B 클래스에서 재정의된 필드가 우선하여 접근됨
		mb.x = "자바"; // B 클래스의 String x에 "자바" 저장
		mb.y = 200;  // B 클래스의 int y에 200 저장
		
		// 출력: B 객체의 x ("자바")
		System.out.println("mb가 참조하는 B객체의 x값은 " + mb.x);
		// 출력: B 객체의 y (200) -> 출력 문구에는 'A객체'라 되어있으나 실제로는 자식 B의 y가 출력됨
		System.out.println("mb가 참조하는 A객체의 y값은 " + mb.y);
		
		System.out.println();
		
		// 메서드 호출을 통한 부모(A) 멤버 접근 및 값 변경
		mb.print_x(); // A의 x(30) 출력
		mb.print_y(); // super.y = 100 수행 후 A의 y(100) 출력
		
		System.out.println();
				
		// B 클래스는 A를 상속받았으므로 A의 z 필드를 인스턴스 변수로 가지고 있음
		mb.z = 20; // mb 객체가 가진 상속받은 z의 값을 20으로 변경
		
		// 독립된 별도의 A 객체 생성
		A a = new A(); // a 객체의 z는 초기화된 값인 30을 가짐
		
		// mb 객체의 z(20)와 새롭게 생성한 a 객체의 z(30)는 완전히 별개의 인스턴스 변수임
		System.out.println("mb가 참조하는 B객체의 z값은 " + mb.z); // 출력: 20
		System.out.println("mb가 참조하는 A객체의 z값은 " + a.z);  // 출력: 30
	}
}

// 부모 클래스 A
class A {
	// private: 클래스 내부에서만 접근 가능 (자식 클래스 B에서도 직접 접근 불가)
	private int x = 30;
	
	// public: 어디서나 접근 가능 (x의 초기값인 30으로 초기화됨)
	public int y = x;
	
	// default (package-private): 동일한 패키지(ex04) 내에서 접근 가능 (x의 초기값인 30으로 초기화됨)
	int z = x; 

	// private 변수인 x의 값을 외부에서 읽을 수 있도록 제공하는 Getter 메서드
	public int getX() {
		return x;
	}
}