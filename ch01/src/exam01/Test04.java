package exam01;

import java.util.Random;
import java.util.Scanner;

//Scanner로 정수 입력받기(키보드로) 5를 입력받았으면 정수, 난수를 발생시킨다. ex) 5를 입력받았으면 0 ~ 5까지 난수가 출력이 되도록 프로그램을 만들기

public class Test04 {
	public static void main(String[] args) {
		Random dice = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("난수를 발생시킬 수를 입력하세요: ");
		int n = sc.nextInt();
		
		int result = dice.nextInt(n+1); //기본적으로 인자값이 있으면 0부터 시작함
		int result2 = dice.nextInt(n+1); //구버전 형식임 뒤에도 빼면 앞에도 같은 수로 빼야함
		int test = dice.nextInt(); // 이렇게 난수를 넣지 않으면 범위가 음수부터 정수까지
		
		System.out.println("결과 1은 " + result);
		System.out.println("결과 2는 " + result2);
		System.out.println("결과 3는 " + test);
		
	}
}
