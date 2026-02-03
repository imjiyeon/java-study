package main;

import java.io.FileReader;
import java.io.IOException;

/*
* 파일입력스트림을 사용하여
* reader.txt 파일에서 내용을 읽는다
* */
public class Ex3 {

    // 프로젝트 바로 아래 reader.txt 파일 생성

    public static void main(String[] args) throws IOException {
        
        // reader.txt 파일과 연결할 입력스트림을 생성한다
        FileReader fr = new FileReader("reader.txt");

        // read메소드는 파일에서 한 글자만 읽어올 수 있다
        // 읽은 문자는 아스키코드로 저장된다 (a->97)
        int i = fr.read();
        
        // 아스키코드를 문자로 형변환한다
        System.out.print(i + ":" + (char) i + ", ");
        
        // 다음 문자를 읽는다
        i = fr.read();
        System.out.print(i + ":" + (char) i + ", ");

        i = fr.read();
        System.out.print(i + ":" + (char) i + ", ");

        i = fr.read();
        System.out.print(i + ":" + (char) i + ", ");

        i = fr.read();
        System.out.print(i + ":" + (char) i + ", ");

        // 파일의 끝에 도달하면 -1을 반환
        i = fr.read();
        System.out.print(i + ":" + (char) i + ", ");

        // 반복문을 사용하여 파일 전체를 읽는다
        // 파일의 끝을 만날때까지 문자를 계속 읽는다
//        while (true) {
//            int i = fr.read();
//            if (i == -1) {
//                break;
//            }
//            System.out.print((char) i);
//        }

    }

}
