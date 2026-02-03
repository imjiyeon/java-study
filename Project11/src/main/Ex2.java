package main;

import java.util.Scanner;

/*
* Scanner 클래스를 사용하여
* 문자열과 숫자 등 다양한 형태로 값을 입력받는다
* */
public class Ex2 {

    public static void main(String[] args) {

        // Scanner 클래스의 생성자 : Scanner(입력스트림)
        // System.in(표준입력스트림)을 사용하여 Scanner 객체를 생성한다
        // Scanner 클래스을 사용하면 표준입력스트림을 기반으로 값을 더 편리하게 입력받을 수 있다
        Scanner scanner = new Scanner(System.in);

        // nextLine메소드를 사용하면 문자열을 그대로 입력받을 수 있다
        System.out.println("문자열을 입력하세요:");
        String name = scanner.nextLine();

        // nextInt메소드를 사용하면 숫자를 그대로 입력받을 수 있다
        System.out.println("숫자를 입력하세요:");
        int age = scanner.nextInt();
        
        // 입력받은 문자열과 숫자 출력
        System.out.println(name);
        System.out.println(age);

        // 사용한 리소스 닫기
        scanner.close();

    }

}
