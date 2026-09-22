package exam03;

import java.util.Random;

public class IF_Else04 {
    public static void main(String[] args) {
        Random dice = new Random();

        int a = 1 + dice.nextInt(20);
        int b = 1 + dice.nextInt(20);
        int c = 1 + dice.nextInt(20);

        int maxNum = 0;
        int minNum = 0;
        int midNum = 0;

        // 최댓값 찾기
        if (a > b && a > c) {
            maxNum = a;
        }
        else if (b > a && b > c) {
            maxNum = b;
        }
        else {
            maxNum = c;
        }

        // 최솟값 찾기
        if (a < b && a < c) {
            minNum = a;
        }
        else if (b < a && b < c) {
            minNum = b;
        }
        else {
        	
            minNum = c;
        }

        // 중간값 찾기
        midNum = a + b + c - maxNum - minNum;

        System.out.println("a = " + a + ", b = " + b + ", c = " + c + "," + "middle =" + midNum);
    }
}
