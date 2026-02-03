package main;

import java.io.IOException;

/*
* 표준 입출력 스트림을 사용하여
* 키보드를 통해 데이터를 입력 받고
* 모니터로 데이터를 출력한다
* */
public class Ex1 {

    public static void main(String[] args) throws IOException {

        // System.out : 표준 출력 스트림
        // 입력한 내용을 화면에 출력한다
        System.out.println("안녕하세요");

        // System.in: 표준 입력 스트림
        // 키보드를 통해서 문자를 입력받는다
        System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
    
        // 문자 입력(예: a 입력 후 Enter)
        // read메소드는 한 글자만 입력받을 수 있다
        // 입력받은 문자는 아스키코드로 저장된다 (a->97)
        int i = System.in.read();

        // 입력받은 아스키코드 출력
        System.out.println(i);

        // 아스키코드를 문자(char)로 변환하여 출력
        System.out.println((char) i);

    }

}
