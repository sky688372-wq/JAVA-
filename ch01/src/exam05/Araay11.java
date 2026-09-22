package exam05;

public class Araay11 {
	public static void main(String[] args) {
		String[] oldAraay = {"개나리", "진달래", "목련"};
		String[] newAraay1 = new String[oldAraay.length + 2];
		String[] newAraay2 = new String[oldAraay.length + 2];
		
		for (int i = 0; i < oldAraay.length; i++) {
			newAraay1[i] = oldAraay[i];
			System.out.printf("oldAraay[%d]  = %s\n", i, oldAraay[i]);
		}
		System.out.println();
		
		for (int i = 0; i < newAraay1.length; i++) {
			System.out.printf("new array[%d] = %s\n", i, newAraay1[i]);
		}
		
		System.out.println();
		
		System.arraycopy(oldAraay, 1, newAraay2, 1, 2);
		for (int i = 0; i < newAraay2.length; i++) {
			System.out.printf("new array2[%d] = %s\n", i, newAraay2[i]);
		}
		
	}
}
