package exam01;

//원주율은 상수로 지정 (변수 이름 : PI), 초기값은 3.14, 반지름(radius) : 2.5, 
//원의 넓이와 호의 길이
//조건 printf()를 사용함
// 반지름의 길이가 2.5인 원의 넓이 출력
// 원호의 길이를 출력



public class Test01 {

	public static void main(String[] args) {
		
		final double PI = 3.14; //파이의 상수값
		double radius = 2.5; // 반지름의 상수값
		
		//원의 넓이와 호의 길이를 구하는 괴저정
		
		double circleArea = PI * (radius*radius);
		double arcLength = 2 * PI * radius;
		
		
		//값을 출력하는 과정 
		System.out.printf("반지름의 길이가 %.1f인 원의 넓이 : %.3f\n", radius, circleArea);
		System.out.printf("반지름의 길이가 %.1f인 원 호의 길이 : %.1f\n", radius, arcLength);
		
		
		
		

	}

}
