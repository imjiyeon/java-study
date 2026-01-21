package main;

import java.util.Arrays;

/*
 * 배열에 값 저장하기
 * */
public class Ex2 {

	public static void main(String[] args) {
		
		// 책 제목 3개를 저장할 수 있는 문자열 배열 생성
		String[] books = new String[3];
		
		// 인덱스를 사용하여 배열에 값 저장하기
		books[0] = "자바의 정석"; // 배열의 첫번째 자리에 값 저장
		books[1] = "파이썬 기초"; 
		books[2] = "C언어 입문"; 
		
		// 배열에 저장된 값 출력
		System.out.println(Arrays.toString(books));
		
		// books[3] = "데이터베이스 입문"; 
		// -> 배열의 범위를 벗어난 인덱스를 사용하면 에러남
		
	}

}
