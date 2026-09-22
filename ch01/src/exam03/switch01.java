package exam03;

import java.util.Random;

public class switch01 {
	public static void main(String[] args) {
		Random dice = new Random();
		
		int n = dice.nextInt(13);
		
		switch (n) {
		case 0: {
			
			System.out.println("가위");;
			break;
		}
		case 1:{
			System.out.println("바위");
			break;
		}
		default:
			System.out.println("보");
		}
		
		
		
	}
}
