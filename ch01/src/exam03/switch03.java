package exam03;

import java.util.Random;

public class switch03 {
    public static void main(String[] args) {
        Random dice = new Random();

        int n = 1 + dice.nextInt(12);

        System.out.println("난수는 " + n + "입니다.");

        String season;

        switch (n) {
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            default:
                season = "겨울";
                break;
        }

        System.out.println(n + "월은 " + season + "입니다.");
    }
}