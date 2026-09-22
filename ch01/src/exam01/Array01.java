package exam01;

public class Array01 {
	public static void main(String[] args) {
		int[] score = {1, 5, 3, 8, 2};
		
		int max = score[0];
		for (int i : score) {
			if (max < i) {
				max = i;
			}
		}
		System.out.println("배열 할목 값 중 최댓값(max)은 " + max + "이다.");
	}
}
