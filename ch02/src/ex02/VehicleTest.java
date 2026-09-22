package ex02;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vh1 = new Vehicle("H사");
        Vehicle vh2 = new Vehicle("K사", "TAXI");
        Vehicle vh3 = new Vehicle("H사", "TRUCK", "파란색");

        System.out.println("------ vh1 ------");
        System.out.printf("업체:%-4s  종류:%-6s  색상:%s\n", vh1.company, vh1.kind, vh1.color);

        System.out.println("------ vh2 ------");
        System.out.printf("업체:%-4s  종류:%-6s  색상:%s\n", vh2.company, vh2.kind, vh2.color);

        System.out.println("------ vh3 ------");
        System.out.printf("업체:%-4s  종류:%-6s  색상:%s\n", vh3.company, vh3.kind, vh3.color);
        
    }
}

class Vehicle {
	String company;
	String kind;
	String color;
	
	//this()로 생성자들을 생략 가능(오버로딩 시 편하게 하기 위함)
	public Vehicle(String company) { //this(회사이름, "BUS", "녹색");으로 대체 가능 문자열 빼고 입력 받는 부분
		this.company = company;
		this.kind= "BUS";
		this.color = "녹색";
	}
	
	
	
	public Vehicle(String company, String kind) { //this(회사이름, 종류, "검은색); 
		this.company = company;
		this.kind= kind;
		this.color = "검은색";
	}
	
	public Vehicle(String company, String kind, String color) { //불러올 생성자 표
		this.company = company;
		this.kind= kind;
		this.color = color;
	}
}