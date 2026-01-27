package main;

/*
* 인터페이스 타입 변수와 오버라이드 메소드 호출
* */
public class Ex2 {

    public static void main(String[] args) {

        // 부모 인터페이스 타입 변수에 자식 객체 참조
        Remote remote1 = new TV();
        remote1.play(); // 실제 객체(TV)의 메소드가 호출됨
        
        Remote remote2 = new Radio();
        remote2.play(); // 실제 객체(Radio)의 메소드가 호출됨

        // 정리: 하나의 타입으로 여러 객체를 다룰 수 있다

    }

}
