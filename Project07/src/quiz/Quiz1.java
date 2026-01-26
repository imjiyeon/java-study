package quiz;

public class Quiz1 {
    public static void main(String[] args) {

        Bus bus = new Bus();

        bus.brand = "현대";
        bus.model = "에어로시티";
        bus.passengerCount = 35;
        bus.totalFare = 105000;

        // 버스 정보
        System.out.println("제조사: " + bus.brand);
        System.out.println("모델: " + bus.model);
        System.out.println("승객 수: " + bus.passengerCount);
        System.out.println("요금 수입: " + bus.totalFare);
    }
}

// 자동차 클래스
class Car {
    String brand;   // 제조사
    String model;   // 모델
}

// 버스 클래스
class Bus extends Car {
    int passengerCount; // 승객 수
    int totalFare;      // 수입
}

