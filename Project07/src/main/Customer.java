package main;

//일반회원 클래스
class Customer {
    String name; // 회원 이름
    String grade; // 회원 등급
    double bonusPoint; // 보너스 포인트
    double bonusRatio; // 적립률

    public Customer() {
        grade = "SILVER"; //고정값이니까 초기화
        bonusRatio = 0.01;
    }

    // 보인스 포인트 적립하고, 지불 가격을 계산하는 메소드
    public void calcPrice(int price) {
        bonusPoint = bonusPoint + (price * bonusRatio); // 보너스 포인트 계산
        System.out.println(name + "님이 " + price + "원을 결제했습니다.");
    }

    public void showInfo() {
        System.out.println(name + " 님의 등급은 " + grade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
    }

}
