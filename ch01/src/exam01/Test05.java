package exam01;

import java.util.Scanner;

// 세 자리 정수를 입력받아서 마지막 자릿수를 제외한 수를 출력

public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("세 자리 숫자를 입력해주세요. : ");
        int n = sc.nextInt();

        System.out.println(n / 10);  // 마지막 자릿수 제거
    }
}