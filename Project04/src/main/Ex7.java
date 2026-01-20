package main;

/*
 * for문을 사용하여 1부터 10까지 출력하기
 * */
public class Ex7 {

	public static void main(String[] args) {

		// 초기화, 조건, 증감
		for (int i = 1; i <= 10; i++) { 
			System.out.println(i); // 1,2,3,4,5,6,7,8,9,10
		}
		// i가 1부터 10까지 1씩 증가되므로, 블록을 10번 수행함
		
		// 문자열 연결
		for (int i = 1; i <= 10; i++) { 
			System.out.println(i+"번 출력");
		}

	}
}
