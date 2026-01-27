package quiz;

public class Quiz1 {

    public static void main(String[] args) {

        // 부모 타입 변수로 자식 객체 참조 (다형성)
        Car car1 = new Bus();
        Car car2 = new Taxi();

        // 공통 기능 실행
        car1.drive();
        car1.payFare();

        car2.drive();
        car2.payFare();

    }

}
