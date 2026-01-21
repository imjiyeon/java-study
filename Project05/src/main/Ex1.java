package main;

import java.util.Arrays;

/*
 * 배열 만들기
 * */
public class Ex1 {

	public static void main(String[] args) {
		
		// 책 제목을 저장하는 문자열 변수 3개 선언 
		String book1;
		String book2;
		String book3;
		
		// 책 제목 3개를 저장할 수 있는 문자열 배열 생성
		String[] books = new String[3]; // 타입[] 배열이름 = new 타입[크기]
		
		// 배열 출력
		System.out.println(books); // 배열의 주소값 출력
		System.out.println(Arrays.toString(books)); // 배열의 실제 값 출력

	}

}
