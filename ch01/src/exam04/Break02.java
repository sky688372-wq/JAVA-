package exam04;

public class Break02 {
    public static void main(String[] args) {
        int currnSum = 0;
        int i; //나중에 밖에서 써야하니까 그럼

        first: for(i = 1; i < 10; i++) {
            for (int j = 1; j < 100; j++) {
                currnSum += i * j;
                if(currnSum > 2000) {
                    break first;
                }
            }
        }
        System.out.println("sum = " + currnSum);
        System.out.println("i가 " + i + "일 때 종료");
    }
}
