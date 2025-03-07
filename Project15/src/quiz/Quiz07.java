package quiz;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * <보조스트림>
 *
 * FileOutputStream와 보조스트림을 사용하여
 * 파일에 "프로그래밍"을 출력하세요.
 * */
public class Quiz07 {

	public static void main(String[] args) throws IOException {

		// FileOutputStream: 바이트 스트림 + 출력 스트림
		// 바이트스트림: 1바이트씩 데이터 처리하는 스트림
		// 출력 스트림: 파일에 내용을 쓸수 있는 스트림
		FileOutputStream stream = new FileOutputStream("quiz7.txt");

		// 한글 입력 못함
		stream.write('안');

		// OutputStreamWriter: 한글을 작성할 수 있도록 도와주는 보조 스트림
		OutputStreamWriter streamWriter = new OutputStreamWriter(stream);

		streamWriter.write('프');
		streamWriter.write('로');
		streamWriter.write('그');
		streamWriter.write('래');
		streamWriter.write('밍'); // 출력안됨..
		
		// FileOutputStream은 바로 출력됬는데
		// OutputStreamWriter는 버퍼가 있어서 버퍼를 비워야 출력됨

		// 버퍼 비우기
		streamWriter.flush();
	}

}
