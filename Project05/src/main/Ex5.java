package main;

/*
 * for문을 사용해 배열의 요소를 하나씩 출력하기
 * */
public class Ex5 {

	public static void main(String[] args) {

		// 책 제목 배열 생성
		String[] books = { "자바의 정석", "파이썬 기초", "C언어 입문" };

		// for문을 사용해 배열의 요소를 하나씩 출력
		for (int i = 0; i < 3; i++) {
			System.out.println(books[i]);
		}

	}

}
