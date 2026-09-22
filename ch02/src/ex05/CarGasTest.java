package ex05;

public class CarGasTest {
	public static void main(String[] args) {
		CarGas cg = new CarGas();
		cg.setGas(5);
		cg.emptyGas();
		System.out.println();
		
		for (int i = 0; i < 6; i++) {
			cg.run();
		}
		
		System.out.println();
		if (cg.emptyGas() == true) {
			System.out.println("gas 충전 완료!! 출발합니다. --");
		}
		
		
		
	}
}

class CarGas {
	int gas;
	
	//매개값을 이용한 gas값 초기화
	public void setGas(int gas) {
		this.gas = gas;
	}
	
	public boolean emptyGas() {
		if (gas == 0) {
			System.out.println("현재 gas = 0, 충전 필요!! --");
			return true;
		}
		else {
			System.out.printf("현재 gas = %d\n", gas);
			return false;
		}
	}
	
	public void run() {
		if (gas == 0) {
			System.out.println("정지--(gas 잔량 : 0) ---");
		} else {
			System.out.printf("주행 중 --(gas 잔량 : %d) ---\n", gas);
			gas--;
		}
	}
}
