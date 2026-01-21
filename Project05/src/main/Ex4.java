package main;

/*
 * 배열 사용하기
 * */
public class Ex4 {

	public static void main(String[] args) {
		
		// 배열 생성과 동시에 책 제목 저장
		String[] books = { "자바의 정석", "파이썬 기초", "C언어 입문" };
		
		// 인덱스를 사용해 책제목 하나씩 출력
		System.out.println("첫번째 책: " + books[0]);
		System.out.println("두번째 책: " + books[1]);
		System.out.println("세번째 책: " + books[2]);

	}

}
