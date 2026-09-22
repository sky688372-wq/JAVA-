package ex01;

public class ex07 {
	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;
		
//		byte result1 = b1+b2; 이 변수 선언은 오류임
// byte를 연산하면 int가 되기 때문이다.
		int result1 = b1+b2;
		
		System.out.println(result1);
		
		char ch1 = 'A';
		char ch2 = 1;
		int result = ch1 + ch2;
		
		System.out.println(result);
		System.out.println((char)result);
			
		
		
	}
}


