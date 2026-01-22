package main;

/*
* 메소드 만들기
* */
public class Ex3 {

    public static void main(String[] args) {
        
        // 더하기 함수 호출하고 결과 받기
        int result = add(3, 4);
        System.out.println(result); // 결과 확인

        // 빼기 함수 호출하기
        subtract(10, 5);
    }

    // 두 수를 더하는 함수
    // 접근제어자 반환타입 함수이름 매개변수
    // 매개변수: 숫자 두개
    // 반환값: 숫자
    public static int add(int n1, int n2) {
        return n1 + n2; // 반환 타입과 실제 반환값의 자료형은 일치해야 한다
    }

    // 빼기 함수
    public static void subtract(int n1, int n2) {
        int result = n1 - n2;
        System.out.println(result); // 결과 바로 출력
    }

}
