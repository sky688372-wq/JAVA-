package ex05;

public class ComputerTest {
	//배열을 생성하는 세 가지 방법을 잘 알자.
	
	public static void main(String[] args) {
		Computer com = new Computer();
		int[] arr = {1,2,3,4,5};
		System.out.println("result1 = " + com.add(1,2,3,4,5));
		System.out.println("result2 = " + com.add(6,7,8,9,10));
		System.out.println("avg1 = " + com.average(1,2,3,4,5));
		System.out.println("avg2 = " + com.average(new int[] {1,2,3,4,5}));
		System.out.println("avg3 = " + com.average(arr));
		
	}
}

class Computer {
	
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