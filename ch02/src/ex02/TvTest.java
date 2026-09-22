package ex02;

public class TvTest {
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		Tv tv2 = new Tv("삼성");
		Tv tv3 = new Tv(78, "LG");
		
		System.out.println(tv1.manufactorer + " " + tv1.size +"인치TV");
		System.out.println(tv2.manufactorer + " " + tv2.size +"인치TV");
		System.out.println(tv3.manufactorer + " " + tv3.size +"인치TV");
	}
}

class Tv {
	int size;
	String manufactorer;
	
	public Tv(int size, String manufactorer) { //호출할 표준 생성자
		this.size = size;
		this.manufactorer = manufactorer;
	}
	
	public Tv() {
		this(32, "LG");
	}
	
	public Tv(String manufactorer) {
		this(64, manufactorer);
	}
}