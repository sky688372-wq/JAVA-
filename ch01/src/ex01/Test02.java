package ex01;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//사실 입력 안받음
		Scanner sc = new Scanner(System.in);
		
		Human p1 = new Human(17, "인천전자마이스터 고등학교", "한서현");
		
		p1.introduce();
		p1.SayHello();
		p1.See();
		
	}
}

class Human{
	//필드
	
	int age;
	String school;
	String name;
	
	public Human (int age, String school, String name) {
		this.age = age;
		this.school = school;
		this.name = name;
		
		System.out.println(name + "(이)가 태어났어요!");
	}
	
	
	//매서드 : 자기소개
	void introduce(){
		System.out.println("안녕 나는 " + name + "이고 " +age + "살이야.");
		System.out.println("나는 " + school + "에 다니고 있어.");
	}
	
	void SayHello() {
		System.out.println("만나서 반가워!");
	}
	
	void See() {
		System.out.println("영포티");
	}
	
}


