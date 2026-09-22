package exam05;

public class Araay14 {
	public static void main(String[] args) {
		int[] score = {95,71,84,93,88};
		
		int sum = 0;
		double average = 0;
		for (int i : score) {
			sum += i;
		}
		average = (double)sum / score.length;
		System.out.println("총합(sum) = " + sum);
		System.out.println("평균(average) = " + average);
	}
}
