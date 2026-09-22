package exam01;

import java.util.Scanner;

// 두 개의 정수를 입력받아서 합과 평균 구하기

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아래에 합과 평균을 구할 숫자 두 개를 입력해주세요.");
		
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
	
		
		
		System.out.printf("%.1f와 %.1f의 합은 %.1f입니다.\n", n1, n2, n1+n2);
		System.out.printf("%.1f와 %.1f의 평균은 %.1f입니다.\n", n1, n2, (n1+ n2)/2);
	}
}
