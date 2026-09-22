package ex01;

public class ex08 {
	public static void main(String[] args) {
		//문자열을 기본 타입으로 형변환
		String a = "123"; //정수 타입으로 고칠거임
		String b = "100"; // 
		
		
		int a_num = Integer.parseInt(a);
		byte b_num = Byte.parseByte(b);
		
		System.out.println(a_num);
		System.out.println(b_num);
		
		int result = a_num + b_num;
		
		System.out.println(result);
		
		
	}
}
