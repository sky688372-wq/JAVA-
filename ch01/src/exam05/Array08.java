package exam05;

public class Array08 {
	public static void main(String[] args) {
		int [][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11,12}};
		
		System.out.println("#### 배열의 요솟값 출력 ####");
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%2d\t", a[i][j]);
			}
			System.out.println();
		}
	}
}
