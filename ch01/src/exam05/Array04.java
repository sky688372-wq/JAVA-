package exam05;

public class Array04 {
    public static void main(String[] args) {
        int sum = 0;
        double ave;

        //(1)
        int[] array = {83, 90, 87};

        //(2)
        int[] brray;
        brray = new int[]{83, 90, 87};

        //(3)
        int[] crray = new int[3];
        crray[0] = 83;
        crray[1] = 90;
        crray[2] = 87;

        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d] = %d\n", i, array[i]);
            sum += array[i];
        }
        ave = (double)sum / array.length;

        System.out.println("sum = " + sum);
        System.out.printf("평균 = %.6f", ave);
    }
}