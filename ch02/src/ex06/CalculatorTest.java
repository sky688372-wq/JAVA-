package ex06;

public class CalculatorTest {
    public static void main(String[] args) {
    	
        Calculator.plus(5, 3);
        Calculator.minus(5, 3);
        Calculator.areaCircle(10);
    }
}

class Calculator {
    static double pi = 3.141592;

    // 덧셈 메서드
    public static void plus(int a, int b) {
        System.out.printf("%d + %d = %d\n", a, b, a + b);
    }

    // 뺄셈 메서드
    public static void minus(int a, int b) {
        System.out.printf("%d - %d = %d\n", a, b, a - b);
    }

    // 원의 넓이 메서드
    public static void areaCircle(int r) {
        System.out.printf("원의 넓이 = %f * %d * %d = %f\n", pi, r, r, pi * r * r);
    }
}