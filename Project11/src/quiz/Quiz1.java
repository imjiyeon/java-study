package quiz;

import java.util.Scanner;

/*
* Scanner 클래스 연습하기
* */
public class Quiz1 {

    public static void main(String[] args) {

        // Scanner 클래스의 객체를 생성하세요
        // Scanner를 사용하여 본인의 이름, 나이, 주소를 입력하세요
        // 마지막으로 입력받은 모든 정보를 출력하세요
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름:");
        String name = scanner.nextLine();

        System.out.println("나이:");
        int age = scanner.nextInt();

        System.out.println("주소:");
        String address = scanner.nextLine();

        System.out.println("이름: " + name + ", 나이: " + age + ", 주소: " + address);

    }

}
