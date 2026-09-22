package exam04;

import java.util.Scanner;

public class for03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("0보다 큰 정수를 입력하세요>> ");
        int n = sc.nextInt();

        for(int i = n; i >= 0; i--) {
            System.out.printf("%d\t", i);
            if((n - i + 1) % 3 == 0) {
                System.out.println();
            }
        }
    }
}
