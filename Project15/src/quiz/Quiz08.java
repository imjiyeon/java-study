package quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * <파일 클래스>
 * 
 * 다운로드 폴더에 있는 파일의 목록을 읽어서 텍스트 파일에 출력하세요.
 * */
public class Quiz08 {

	public static void main(String[] args) throws IOException {

		// File: 파일의 속성을 조회할 수 있는 클래스
		// 다운로드 폴더
		File dir = new File("C:\\Users\\G201\\Downloads");
//		File dir = new File("C:\\Users\\imjiyeon\\Downloads");

		// 폴더 내 하위 파일 목록 조회
		File[] files = dir.listFiles();

		// 출력 스트림 생성
		FileWriter fw = new FileWriter("quiz8.txt");

		// 파일의 이름을 하나씩 쓰기
		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			String filename = file.getName();
			fw.write(filename);
			fw.write("\n"); // 줄바꿈
		}

		// 버퍼 비우기
		fw.flush();

	}
}
