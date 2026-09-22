package ex01;

public class ex6 {
	public static void main(String[] args) {
		
		//1. 정수 타입이 실수 타입으로 저장될 떄 문제 발생
		long a = 50000000000L;
		float b = a;
		
		System.out.println(b);
		
		//2. char타입의 경우 int타입으로 자동 타입 변환되며 유니코드 값이 int에 저장됨
		char c = 'A';
		int i = c;
		
		System.out.println(i);
		
		//3. byte타입을 char타입으로 자동 변환할 수 없음
		
		/*
		 byte b = 10;
		 char c = b;
		 */
		
		//4. float타입이 더블 타입으로 저장될 때 자동 타입 변환 밸셍
		
		float f = 3.14f;
		
		double d = f;
		
		System.out.println(d);
	}
}
