package quiz;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader 파일출력스트림 연습하기
 * */
public class Quiz2 {

    public static void main(String[] args) throws IOException {

        // quiz2.txt 파일을 먼저 만들고
        // 그안에 "abcde"를 쓴다
        // FileReader 클래스를 사용하여 내용을 모두 읽는다

        FileReader fr = new FileReader("quiz2.txt");

        while (true) {
            int i = fr.read();
            if (i == -1) {
                break;
            }
            System.out.print((char) i);
        }

    }

}
