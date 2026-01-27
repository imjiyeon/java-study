package quiz;

public class Eagle implements Animal {

    @Override
    public void sleep() {
        System.out.println("독수리가 잠을 잡니다");
    }

    @Override
    public void move() {
        System.out.println("독수리가 하늘을 납니다");
    }

}
