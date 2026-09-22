package ex01;

public class test3 {
	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 127;
//		byte var5 = 128; 이 코드는 오류임 byte의 혀용 범위는 -128부터 127까지다.
		
		//JAVA는 값을 유니코드로 저장하기 떄문에 int에 문자열을 대입 가능함
		int v5 = 'A';
		
		System.out.println(v5);
		
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		char c4 = '가';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		
		 
	}
}


