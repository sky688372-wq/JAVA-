package ex06;

public class KoreanTest {
	public static void main(String[] args) {
		Korean k = new Korean("강인한", "남", "2022.01.01.");
		Korean.printNation();
		k.print();
	}
}

class Korean {
	public static String nation = "대한민국";
	String name;
	String gender;
	String birth;
	
	public Korean(String name, String gender, String birth) {
		this.name = name;
		this.gender = gender;
		this.birth = birth;
	}
	
	static public void printNation() { //정적 필드를 가져다가 사용하기에 정적 매서드로 선언해야함
		System.out.println("국적 : " + nation);
	}
	
	public void print() {
		System.out.printf("이름 : %s - 성별 : %s - 생년월일 : %s\n", this.name, this.gender, this.birth);
	}
	
}
