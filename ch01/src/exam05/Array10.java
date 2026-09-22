package exam05;

public class Array10 {
	public static void main(String[] args) {
		String[] str = new String[4];
		
		str[0] = "고양이";
		str[1] = "고양이";

		str[2] = new String("고양이");
		str[3] = new String("강아지");
		
		for (int i = 0; i < str.length; i++) {
			System.out.printf("str[%d] = %n", i, str[i]);
		}
		
		
		//출력
		System.out.println(str[0] == str[1]);
		System.out.println(str[0] == str[2]);
		System.out.println(str[1] == str[3]);
		
		System.out.println();
		
		System.out.println(str[0].equals(str[1]));
		System.out.println(str[0].equals(str[2]));
		System.out.println(str[1].equals(str[3]));
		
		
	}
}
