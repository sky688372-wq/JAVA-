package exam05;

public class Array12 {
	public static void main(String[] args) {
		String[] oldAraay = {"민들레", "수선화", "개나리"};
		String[] newAraay = new String[oldAraay.length+3];
		
		for (int i = 0; i < oldAraay.length; i++) {
			System.out.printf("oldArray[%d] = %s\n", i, oldAraay[i]);
		}
		
		System.out.println();
		
		System.arraycopy(oldAraay, 0, newAraay, 1, 2);
		for (int i = 0; i < newAraay.length; i++) {
			System.out.printf("newArray[%d] = %s\n", i, newAraay[i]);
		}
	}
}
