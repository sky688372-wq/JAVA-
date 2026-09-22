package exam03;

import java.util.Scanner;

public class swhitch04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("커피를 주문해주세요 : ");
		int price = 0;
		String kind = sc.next();
		int num = sc.nextInt();
		int total = 0;
		
		switch (kind) {
		case "에스프레소": {
			price = 2000;
			System.out.println("total = " + price*num);
			break;
		}
		case "아메리카노": {
			price = 2500;
			System.out.println("total = " + price*num);
			break;
		}
		case "카푸치노":{
			price = 3000;
			System.out.println("total = " + price*num);
			break;
		}
		case "카페라떼":{
			price = 3500;
			System.out.println("total = " + price*num);
			
			
			break;
		}
		default:
			System.out.println("해당 메뉴는 저희 가게에 없습니다.");
		}
	}
}
