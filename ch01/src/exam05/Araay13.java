package exam05;

public class Araay13 {
	public static void main(String[] args) {
		int a[]  = new int[4];
		int b[] = a;
		a[1] = 3;
		a[3] = 9;
		b[2] = 7;
		
		for (int i = 0; i < b.length; i++) {
			System.out.printf("a[%d] = %d , ", i, a[i]);
			System.out.printf("a[%d] = %d\n", i, b[i]);
		}
	}
}
