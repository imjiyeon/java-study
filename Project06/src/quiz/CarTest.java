package quiz;

// Car 클래스를 사용하여 다음 정보를 가지는 인스턴스를 생성하세요.
// 현대, 소나타, white, 30000000(원)
// 기아, K5, black, 28000000(원)
public class CarTest {

    public static void main(String[] args) {

        Car car = new Car();
        car.company = "현대";
        car.model = "소나타";
        car.color = "white";
        car.price = 30000000;

        Car car2 = new Car();
        car2.company = "기아";
        car2.model = "K5";
        car2.color = "black";
        car2.price = 28000000;
    }

}
