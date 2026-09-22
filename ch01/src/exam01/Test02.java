package exam01;
//1. 키보드로 두 개의 정수 입력 받아 사칙연산(곱셈,나눗셈,덧셈,뺄셈)
//2. 
//3. 

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 객체를 생성
		
		System.out.print("두 개의 정수를 입력 >> ");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
		System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
		System.out.printf("%d * %d = %d\n", n1, n2, n1 * n2);
		System.out.printf("%d / %d = %.1f\n", n1, n2, (double)n1 / n2);		
		
		
		
	}
}
