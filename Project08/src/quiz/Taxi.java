package quiz;

public class Taxi implements Car {

    @Override
    public void drive() {
        System.out.println("택시가 목적지로 주행합니다");
    }

    @Override
    public void payFare() {
        System.out.println("택시 요금 10000원을 받습니다");
    }

}
