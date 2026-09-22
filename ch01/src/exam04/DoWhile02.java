package exam04;

import java.util.Random;
import java.util.Scanner;

public class DoWhile02 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int try_count = 0; //시도 횟수
        int random_num;
        int try_num;
        random_num = 10 + rand.nextInt(90);

        do {
            System.out.print("발생된 난수는 무엇일까요? ");
            try_num = sc.nextInt();
            if (try_num > random_num) {
                System.out.printf("발생된 난수는 %d보다 작은 수입니다.", try_num);
                try_count++;
            } else if (try_num < random_num) {
                System.out.printf("발생한 난수는 %d보다 큰 수입니다.", try_num);
                try_count++;
            } else {
                System.out.println("정답입니다");
                System.out.println();
            }
        } while (try_num != random_num);

        System.out.printf("발생한 난수는 %d이고 %d만에 정답을 맞추었습니다.", random_num, try_count);
    }
}