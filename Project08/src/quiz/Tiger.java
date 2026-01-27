package quiz;

public class Tiger implements Animal {

    @Override
    public void sleep() {
        System.out.println("호랑이가 잠을 잡니다");
    }

    @Override
    public void move() {
        System.out.println("호랑이가 네발로 달립니다");
    }

}
