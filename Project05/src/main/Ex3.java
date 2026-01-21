package main;

import java.util.Arrays;

/*
 * 배열 생성 동시에 초기화하기
 * */
public class Ex3 {

	public static void main(String[] args) {
		
		// 문자열 배열 생성
		// 각 요소는 null(빈값)으로 초기화됨
		String[] books = new String[3];
		System.out.println(Arrays.toString(books));
		
		// 배열 생성과 동시에 책 제목 넣기
		// 저장된 값의 개수만큼 배열의 크기가 자동으로 결정됨
		String[] books2 = { "자바의 정석", "파이썬 기초", "C언어 입문" };
		System.out.println(Arrays.toString(books2));
		System.out.println("두번째 배열의 크기: " + books2.length);

	}

}
