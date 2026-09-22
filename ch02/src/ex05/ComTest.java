package ex05;

public class ComTest {
	public static void main(String[] args) {
		Com c = new Com();
		System.out.println("array 배열의 합 : " + c.add(2,4,6,8,9));
		System.out.println("array 배열의 평균 : " + c.average(2,4,6,8,9));
	}
}

class Com {
	public int add(int ... values) { //...을 하면 항목으로도 값을 받을 수 있음
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	public double average(int ... values) {
		int sum = add(values);
		return (double)sum / values.length;
	}
}