package exam05;

public class Array07 {
	public static void main(String[] args) {
		int [][] a = new int [3][4];
		
		System.out.println("#### 배열의 요솟값 출력 ####");
		
		int count = 1;
		for (int i = 0; i < a.length; i++) { //a.length는 행의 수를 의미함
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = count++;
				
				System.out.printf("%2d\t", a[i][j]);
			}
			System.out.println();
		}
	}
}
