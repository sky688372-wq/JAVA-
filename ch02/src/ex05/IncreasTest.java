package ex05;

public class  IncreasTest{
	public static void main(String[] args) {
		Increas i = new Increas();
		int[] arr = i.increas(1,2,3);
		for (int j = 0; j < arr.length; j++) {
			System.out.printf("arr[%d] = %d\n", j, arr[j]);
		}
	}
}

class Increas {
	
	public int[] increas(int ... values) {
		for (int i = 0; i < values.length; i++) {
			values[i]++;
		}
		return values;
	}
}
