package main;

public class Radio implements Remote {

    @Override
    public void on() {
        System.out.println("라디오를 켭니다");
    }

    @Override
    public void off() {
        System.out.println("라디오를 켭니다");
    }

    @Override
    public void play() {
        System.out.println("라디오에서 소리가 나옵니다");
    }

}
