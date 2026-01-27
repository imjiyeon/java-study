package quiz;

public class Bus implements Car {

    @Override
    public void drive() {
        System.out.println("버스가 노선을 따라 주행합니다");
    }

    @Override
    public void payFare() {
        System.out.println("버스 요금 1500원을 받습니다");
    }

}
