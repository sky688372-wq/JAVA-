package ex06;

public class TruckTest {
    public static void main(String[] args) {
        Truck tr = new Truck();
        tr.run(60); // 원하는 속도 입력
    }
}

class Truck {
    int speed;

    // 메서드
    public void run(int speed) {
        this.speed = speed;
        System.out.printf("시속 %dkm/h로 달립니다.\n", this.speed);
    }
}