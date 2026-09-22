package exam03;

import java.util.Scanner;

public class IF01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력>>");
		int score = sc.nextInt();
		
		if (score >= 60) {
			System.out.println("당신의 점수는 " + score + "==> 합격");
			System.out.println();
		} else {
			System.out.println("불합격");
		}
		System.out.println("** 인천전자마이스터고등학교 **");
	}
}
