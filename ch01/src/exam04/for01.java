package exam04;

import java.util.Random;

public class for01 {
	public static void main(String[] args) {
		Random dice = new Random();
		System.out.println("발생항 난수");
		
		for(int i = dice.nextInt(1, 10); i <= 10; i++) {
			System.out.println(i);
			
		}
	}
}
