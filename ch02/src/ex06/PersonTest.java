package ex06;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("220101-4567890", "강하리");

		System.out.println("국적 : " + Person.NATION);
		System.out.println("이름: " + p1.name);
		System.out.println("주민번호 : " + p1.ssn);
		
		p1.name = "강해진";
		
		System.out.println("이름: " + p1.name);
		
	}
}

class Person {
	static final String NATION = "대한민국"; //상수는 무조건 모두 대문자로 표시한다.
	//외부로의 값으로 초기화해야할 경우에는 생성자에서 외부 값으로 초기화한다는 내용을 명시해야함
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name= name;
	}
	
	
}