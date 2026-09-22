package exam04;

import java.util.Random;
import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		// 객체 선언
		Scanner sc = new Scanner(System.in);
		Random dice = new Random();
		int choice;
		
		
		do {
			
			//난수 발생 부분
			int random_num = - 20 + dice.nextInt(41);
			
			if(random_num > 0) {
				System.out.println("발생한 난수 " + random_num + "은 \"양수\"이다.");
				System.out.println();
			}
			else if (random_num < 0) {
				System.out.println("발생한 난수 " + random_num + "은 \"음수\"이다.");
				System.out.println();
			}
			else {
				System.out.println("발생한 난수 " + random_num + "는 \"0\"이다.");
				System.out.println();
			}
			System.out.print("난수 발생 yes면 1을 no면 0을 입력 >> ");
			choice = sc.nextInt();
			
		} while (choice != 0);
		System.out.println("프로그램 종료!!!");
	}
}
