package main;

/*
* 클래스 상속받기
* */
public class Ex1 {
    public static void main(String[] args) {
        Child child = new Child();
        child.nationality = "한국"; //부모클래스에서 물려받은 속성
        child.lastName = "고"; //부모클래스에서 물려받은 속성
        child.firstName = "길동";
    }
}

// public 접근제어자는 하나의 파일에서 한 번만 사용할 수 있다
// main 메서드가 있는 클래스(ex1)만 public으로 선언한다

//부모 클래스
class Parents {
    String nationality; //국적
    String lastName; //성
}

//자식 클래스
class Child extends Parents {
    String firstName; //이름
}
