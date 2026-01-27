package main;

/*
* 리모콘 인터페이스
* 기기를 제어하기 위한 공통 기능을 정의
* */
public interface Remote {

    // 기기마다 동작 방식이 다르므로 추상메소드로 선언
    // 추상메소드는 구현부(바디)가 없음
    // 전원을 키는 메소드
    void on();

    // 전원을 끄는 메소드
    void off();

    // 기기를 실행하는 메소드
    void play();

}
