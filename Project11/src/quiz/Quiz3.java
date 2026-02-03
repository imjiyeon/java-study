package quiz;

import java.io.FileWriter;
import java.io.IOException;

/*
* FileWriter 파일출력스트림 연습하기
* */
public class Quiz3 {

    public static void main(String[] args) throws IOException {

        // quiz3.txt 파일을 만들고
        // FileWriter클래스를 사용하여 파일에 숫자 1부터 10까지 쓰세요

        FileWriter fw = new FileWriter("quiz3.txt");

        for (int i = 1; i <= 10; i++) {
            // write 함수는 숫자를 코드로 인식하므로
            // 문자로 변환하여 출력해야한다
//				fw.write(i);
            // 숫자1 -> 문자1
            fw.write(i + "");
        }

        fw.flush();
    }

}
