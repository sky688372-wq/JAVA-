package exam04;

import java.util.Random;

public class for02 {
	public static void main(String[] args) {
		Random dice = new Random();
		
		int i =  1+ dice.nextInt(9);
		System.out.println("발생한 난수 : " + i);
		
		for(; i < 11; i++) {
			System.out.println();
		}
		
	}
}
