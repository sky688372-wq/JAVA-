package exam04;

import java.util.Scanner;

public class for04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("구구단을 출력할 수를 입력해주세요.");
        int n = sc.nextInt();

        for(int i = 1; i < 10; i++) {
            System.out.println(n + " * " + i + " = " + i * n);
        }

        
        System.out.println("------------------------------------------------------------");
        //이중 반복문
        for(int i = 1; i < 10; i++) {
        	
        }
    }
}
