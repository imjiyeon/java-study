package main;

import java.io.FileWriter;
import java.io.IOException;

/*
* 파일출력스트림을 사용하여
* 다양한 방법으로 파일에 데이터를 출력한다
* */
public class Ex4 {

    public static void main(String[] args) throws IOException {

        // 파일 출력 스트림을 생성한다
        // writer.txt 파일이 있으면 연결하고 없으면 새로 생성한다
        FileWriter fw = new FileWriter("writer.txt");

        // 문자 하나 출력
        // 'A' 한글자가 파일에 쓰인다
        fw.write('A');

        // 문자열 출력
        fw.write("안녕하세요");

        // 특수기호 출력
        fw.write('\n');

        // 배열 출력
        char[] arr = { 'a', 'b', 'c' };
        fw.write(arr);

        // filewriter는 데이터를 파일에 바로 쓰지않고
        // 버퍼에 모아두었다가 한번에 출력한다
        // flush메소드는 버퍼에 남아있는 데이터를 실제 파일로 내보내는 역할을 한다
        // 버퍼: 데이터를 임시로 저장하는 공간
        fw.flush();

    }

}
