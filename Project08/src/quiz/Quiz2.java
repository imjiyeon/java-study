package quiz;

public class Quiz2 {

    public static void main(String[] args) {

        // 인터페이스 타입 변수로 자식 객체 참조 (다형성)
        Animal animal1 = new Tiger();
        Animal animal2 = new Eagle();

        animal1.sleep();
        animal1.move();

        System.out.println();

        animal2.sleep();
        animal2.move();

    }

}
