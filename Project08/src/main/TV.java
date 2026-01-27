package main;

/*
* TV 클래스
* Remote 인터페이스를 구현한 클래스
* */
public class TV implements Remote {

    // 부모 인터페이스에서 물려받은 모든 메소드를 구현해야 한다
    
    @Override
    public void on() {
        System.out.println("TV를 켭니다");
    }

    @Override
    public void off() {
        System.out.println("TV를 끕니다");
    }

    @Override
    public void play() {
        System.out.println("TV에 화면이 출력됩니다");
    }

}
