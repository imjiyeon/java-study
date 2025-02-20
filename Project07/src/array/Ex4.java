package array;

/*
 * 람다식 포문 사용하기
 * */
public class Ex4 {

	public static void main(String[] args) {

		// 배열 생성과 초기화
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// 일반 for문
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// 람다식 for문
		// 문법을 더 간단하게 작성
		// 배열을 순회하면서 요소를 하나씩 꺼내는 구조
		// 문법: (배열 안에 있는 요소를 저장할 변수 : 배열)
		for (int value : arr) {
			System.out.print(value + " ");
		}

	}
}
