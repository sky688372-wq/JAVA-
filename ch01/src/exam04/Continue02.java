package exam04;

import java.util.Scanner;

public class Continue02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result_sum = 0;
		
		System.out.print("5개의 정수를 입력하세요 >> ");
		
		for(int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			
			if(num < 0) {
				continue;
			}
			result_sum += num;
		}
		System.out.println("양의 정수의 합(sum) = " + result_sum);
	}
}
