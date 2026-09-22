package exam03;

import java.util.Random;

public class IF_Else02 {
	public static void main(String[] args) {
		Random dice = new Random();
		
		int score = dice.nextInt(1, 101); //최신 버전임
		//int score = dice.nextInt(100) + 1; // 구버전: 0~99 + 1 = 1~100
		
		if (score >= 60) {
			System.out.println("당신의 점수는 " + score + "==> 합격");
		} else {
			System.out.println("당신의 점수는 " + score + "==> 불학격");
		}
		System.out.println();
		System.out.println("** 인천전자마이스터고등학교 **");
		
		
	}
}
