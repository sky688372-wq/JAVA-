package ex07;

public class Student extends Person {
	String studentId;

	public Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}

	@Override
	void displayInfo() {
		super.displayInfo();
		System.out.println("학번 = " + this.studentId);
	}

	public static void main(String[] args) {
		Student student = new Student("초가을", 17, "통신20122");
		student.displayInfo();
	} 
}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void displayInfo() {
		System.out.printf("이름 = %s\t 나이 = %d세\t", this.name, this.age);
	}
}