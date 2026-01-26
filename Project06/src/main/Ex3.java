package main;

/*
* 생성자
* */
public class Ex3 {

    public static void main(String[] args) {

        // 첫번째 학생 생성
        Student student1 = new Student(1001, "둘리");
        student1.id = 1001; // 객체의 멤버변수를 사용해서 학번 입력
        student1.name = "둘리";
        student1.showInfo();

        // 두번째 학생 생성
        Student student2 = new Student(1002, "또치"); // 객체 생성과 동시에 학생의 정보를 입력
        student2.showInfo();
        
    }

}
