package exam05;

public class Array09 {
	public static void main(String[] args) {
		int arr[][] = {
				{1, 2, 3},
				{4, 5}, 
				{6, 7 ,8 ,9}};
		
		System.out.println("a의 배열 길이 = " + arr.length);
		System.out.println("a[0]의 배열 길이 = " + arr[0].length);
		System.out.println("a[1]의 배열 길이 = " + arr[1].length);
		System.out.println("a[2]의 배열 길이 = " + arr[2].length);
		
		System.out.println("------------------- a배열의 요솟값 ----------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("------------------- b배열의 요솟값 ----------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
