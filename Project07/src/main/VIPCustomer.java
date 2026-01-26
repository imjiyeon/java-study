package main;

//VIP 회원 클래스
class VIPCustomer extends Customer { // 상속받기

    double saleRatio; // 할인률

    public VIPCustomer() {
        super();
        grade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

//    //generate를 사용해서 메소드 재정의하기
//오버라이딩의 규칙은 반환타입, 메소드이름, 매개변수가 모두 같아야 한다
//    @Override
//    public void calcPrice(int price) {
//        bonusPoint = bonusPoint + (price * bonusRatio);
//        int salePrice = price - (int) (price * saleRatio); //할인률을 적용해서 할인가 구하기
//        System.out.println(name+"님이 " + salePrice + "원을 결제했습니다."); //할인된 가격을 지불
//    }

}
