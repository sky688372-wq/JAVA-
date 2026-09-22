package ex05;

// 테스트 클래스
public class Test {
	public static void main(String[] args) {
		Magazine m = new Magazine("바이브 자바", "공대생", 7);
		m.print(); // print 오타 수정
	}
}

// 부모 클래스
class Book {
	String title;
	String author;

	// 명시적 생성자 (매개변수가 있는 생성자)
	Book(String title, String author) {
		// 부모 클래스에 매개변수가 있는 생성자만 있으므로,
		// 자식 클래스 생성자 첫 줄에서 super(title, author)로 호출해야 함
		this.title = title;
		this.author = author;
	}
}

// 자식 클래스
class Magazine extends Book {
	int month;

	Magazine(String title, String author, int month) {
		super(title, author); // 부모 클래스의 생성자 호출
		this.month = month;
	}

	void print() {
		// 부모의 필드(title, author)가 가려지지(hiding) 않았으므로 super 없이 바로 접근 가능
		System.out.println("잡지명 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("발행 : " + month + "월");
	}
}