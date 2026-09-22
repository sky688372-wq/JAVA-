package exam03;

import java.util.Scanner;

public class IF_Else03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하세요>> ");
        int score = sc.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("점수는 " + score + "이고, \"등급 판정 불가능!!!!\"");
        }
        else if (score >= 90) {
            System.out.printf("점수 : %d점, 등급 A%n", score);
        }
        else if (score >= 80) {
            System.out.printf("점수 : %d점, 등급 B%n", score);
        }
        else if (score >= 70) {
            System.out.printf("점수 : %d점, 등급 C%n", score);
        }
        else if (score >= 60) {
            System.out.printf("점수 : %d점, 등급 D%n", score);
            
        }
        else if (score >= 50) {
            System.out.printf("점수 : %d점, 등급 F%n", score);
        }
    }
}