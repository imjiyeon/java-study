package main;

import java.util.HashMap;

/*
* Map 응용하여 학생 정보를 관리하는 프로그램 만들기
* */
public class Ex6 {

    public static void main(String[] args) {

        // 학생목록을 저장할 map 생성
        // 키-학번 / 값-학생의정보
        HashMap<Integer, Student> students = new HashMap<>();

        // 학생 추가
        students.put(1001, new Student(1001, "둘리", 60, 70, 80));
        students.put(1002, new Student(1002, "도우너", 55, 65, 75));
        students.put(1003, new Student(1003, "또치", 80, 81, 82));

        // 모든 학생의 정보 출력하기
        students.get(1001).showInfo();
        students.get(1002).showInfo();
        students.get(1003).showInfo();
        
        // 모든 학생의 정보 출력하기
        for (int i=1001; i<=1003; i++) {
            students.get(i).showInfo();
            students.get(i).getAvgScore();
        }

    }

}


//학생 클래스
class Student {
    int id;
    String name; // 이름
    int kor; // 국어점수
    int math; // 수학점수
    int eng; // 영어점수

    public Student(int id, String name, int kor, int math, int eng) {
        super();
        this.id = id;
        this.name = name;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }

    void showInfo() {
        System.out.println("학번: " + id + ", 이름: " + name + ", 국어: " + kor + ", 수학: " + math + ", 영어: " + eng);
    }

    // 학생의 평균 점수를 출력하는 메소드
    void getAvgScore(){
        // 총점 구하기
        int sum = kor + math + eng;
        // 평균 구하기
        double avg = sum / 3.0;
        System.out.println(name + "의 평균 점순는 " + avg + "점 입니다");
    }
}