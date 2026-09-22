package exam02;

public class Test01 {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-----------------------------------");
		x++;
		++x;
		// 단독으로 쓰일 경우에는 그냥 후치나 전치나 상관없이 바로 수가 더해짐
		System.out.println("x = " + x); // 출력 : 12
		
		System.out.println("------------------------------------");
		y--;
		--y;
		System.out.println("y = " + y); // 출력 : 8
		System.out.println("-------------------------------------");
		
		z = x++;
		System.out.println("z = " + z); //출력 : 12
		System.out.println("x = " + x); //출력 : 13
		
		System.out.println("---------------------------------------");
	
		z = ++x;
		System.out.println("z = " + z); //출력 14
		System.out.println("x = " + x); //출력 14
		
		System.out.println("---------------------------------------------");
		z = ++x + y++;
		System.out.println("z = " + z); // 출력 : 15 + 8 = 23
		System.out.println("x = "+ x); // 출력 : 15
		System.out.println("y = "+ y); // 출력 : 9
	}
}
