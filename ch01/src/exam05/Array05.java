package exam05;

public class Array05 {
	
	public static int add(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		//배열 선언 방법1
		int [] score = {80, 78, 94, 88};
		int sum = 0;
		//배열 선언 방법2
//		int [] score;
		
//		score = new int[] {80, 78, 94, 88};
		
		//배열 선언 방법3
//		int score = new int[4];
//		score[0] = 80;
//		score[1] = 78;
//		score[2] = 94;
//		score[3] = 88;aAa
		
//		for (int i = 0; i < score.length; i++) {
//			System.out.printf("score[%d] = %d\n", i, score[i]);
//			sum += score[i];
//		}
		

		System.out.print("score = " + add(score));
		
		System.out.println();
		System.out.println();
		System.out.println("항목값의 총합(반복문 사용) = " + sum);
		System.out.println("--------------------------------------");
		
		
	}
}
