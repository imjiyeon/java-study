package main;

public class Student {

    // 학생의 속성을 멤버 변수로 선언
    int id; // 학번 (1001)
    String name; // 이름 (둘리)

    // 학생의 기능을 메소드로 선언
    void study() {
        System.out.println("공부를 한다");
    }

    // 학생의 모든 정보를 출력하는 함수
    void showInfo() {
        System.out.println("학번:" + id + ", 이름:" + name);
    }

}
