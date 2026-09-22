package exam05;

import java.util.Iterator;

public class Array03 {
	public static void main(String[] args) {
		int [] arr = new int [3];
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
			sum += arr[i];
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
		System.out.println("합 " + sum);
	}
}
