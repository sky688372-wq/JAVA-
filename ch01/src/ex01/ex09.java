package ex01;


public class ex09 {
    public static void main(String[] args) {

        int x = 2500;

        // [__printf__ 기본 형식]
        // System.out.printf("형식 문자열", 값1, 값2, ...);
        // %d = 정수, %s = 문자열, %f = 실수

        // %d : 정수를 그대로 출력 → "가격: 2500"
        System.out.printf("가격: %d\n", x);

        // %6d : 총 6칸 확보 후 오른쪽 정렬 (빈칸은 공백) → "가격:   2500"
        System.out.printf("가격: %6d\n", x);

        // %-6d : 총 6칸 확보 후 왼쪽 정렬 → "가격: 2500  "
        System.out.printf("가격: %-6d\n", x);

        // %06d : 총 6칸 확보 후 빈칸을 0으로 채움 (오른쪽 정렬) → "가격: 002500"
        System.out.printf("가격: %06d\n", x);

        String dog = "강아지";
        int dog_age = 13;

        // %s : 문자열 출력, %d : 정수 출력
        // 여러 변수를 순서대로 쉼표로 나열
        // → "이름: 강아지, 나이: 13"
        System.out.printf("이름: %s, 나이: %d\n", dog, dog_age);



        //불리언 학습 부분

        boolean rest = false;

        System.out.printf("너 쉴거야? : %b\n", rest);

        System.out.printf("값: %,d\n", 2500000); //중요 여기보면 ,누르면 100단위씩 중간에 ,가 붙게 됨


        // [진수 변환 출력]
        // printf의 서식 문자를 이용해 10진수를 다른 진수로 출력 가능
        int num = 256;

        // %d : 10진수 (Decimal)
        System.out.printf("10진수: %d\n", num);   // 255

        // %o : 8진수 (Octal)
        System.out.printf("8진수: %o\n", num);    // 377

        // %x : 16진수 소문자 (Hexadecimal)
        System.out.printf("16진수: %x\n", num);   // ff

        // %X : 16진수 대문자
        System.out.printf("16진수: %X\n", num);   // FF

        // # 플래그 : 진수 접두사 자동 추가
        // 8진수 앞에 0, 16진수 앞에 0x 붙음
        System.out.printf("8진수(접두사): %#o\n", num);   // 0377
        System.out.printf("16진수(접두사): %#x\n", num);  // 0xff

        // ※ 2진수는 printf 서식 없음 → Integer.toBinaryString() 사용
        System.out.printf("2진수: %s\n", Integer.toBinaryString(num)); // 11111111


    }
}