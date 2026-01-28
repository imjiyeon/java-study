package main;

/*
 * 런타임 오류가 발생하는 경우 1
 * */
public class Ex2 {

	public static void main(String[] args) {

		int[] arr = new int[5];

		// 배열의 인덱스 범위를 벗어남 (0 ~ 4)
		arr[5] = 5;

		// 실행 중 오류가 발생하여 아래 코드는 실행안됨
		System.out.println("프로그램이 정상 종료됩니다.");
	}

}
