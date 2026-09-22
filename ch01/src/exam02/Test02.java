package exam02;

public class Test02 {
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 'A'+1;
//		char c3 = c1 + 1; 이건 오류임 : char와 int가 연산되면 자동타입변환으로 int타입이 되서 int에 저장되어야한다.
		char c3 = (char)(c1 + 1);
		int  c4 = c1+ c2;
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);
		
		
		
	}
}
