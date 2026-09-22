package exam04;

import java.util.Random;

public class Break01 {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("* 주사위 놀이 시작 *");

        while(true) {
            int random_num = 1 + rand.nextInt(6);
            System.out.println("주사위 번호 " + random_num);
            if(random_num == 6) {
                break;  // 6이 나오면 while 탈출
            }
        }
        System.out.println("* 주사위 놀이 종료 *");
    }
}
