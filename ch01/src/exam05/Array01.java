package exam05;

public class Array01 {
    public static void main(String[] args) {
        int[]     num  = new int[2];
        int[]     num2 = new int[]{0, 10};

        String[]  str  = new String[2];
        str[0] = "강아지";

        boolean[] bool = new boolean[2];
        bool[1] = true;

        char[]    ch   = new char[2];
        ch[0] = 'c';

        for (int i = 0; i < num.length; i++) {
            System.out.printf("num[%d] = %d\t str[%d] = %s\t bool[%d] = %b\t ch[%d] = %c\n",
                i, num2[i],
                i, str[i],
                i, bool[i],
                i, ch[i]);
        }
    }
}