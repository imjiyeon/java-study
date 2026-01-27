package main;

/*
* 구현 클래스로 객체 생성
* */
public class Ex1 {

    public static void main(String[] args) {

        // 인터페이스는 객체를 직접 생성할 수 없음
        // Remote remote = new Remote();

        // 인터페이스를 구현한 클래스로만 객체 생성 가능
        TV tv = new TV();
        tv.on();
        tv.off();
        tv.play();

        Radio radio = new Radio();
        radio.on();
        radio.off();
        radio.play();

    }

}
