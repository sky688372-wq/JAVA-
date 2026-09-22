package exam03;

import java.util.Scanner;

public class switch02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("피연산자로 사용할 두 개의 정수 입력>> ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("연산자(사칙연산자)를 입력>> ");
        String s = sc.next();

        switch (s) {
            case "+":
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case "-":
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case "*":
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case "/":
                if (b == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    System.out.printf("%d / %d = %.6f", a, b, ((double) a / b));
                }
                break;
            default:
                System.out.println("올바른 연산자가 아닙니다.");
        }
    }
}
