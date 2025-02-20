package array.quiz;

import java.util.Arrays;

//  5개 크기의 정수형 배열을 생성하세요
//  반복문을 사용하여 숫자 1~10 중에서 짝수만 배열에 저장하세요.
//  {2 4 6 8 10}
public class Quiz4 {

	public static void main(String[] args) {

		// 5개 크기의 배열 생성
		int[] arr = new int[5];

		// 배열의 주소
		System.out.println(arr);

		// Arrays 클래스의 함수를 사용하여 배열의 값을 출력
		System.out.println(Arrays.toString(arr));

		// 배열[index] = 짝수
		// index: 0~4
		// 짝수: 2 6 4 8 10
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 6;
		arr[3] = 8;
		arr[4] = 10;

		// i의 용도: 짝수
		// 그럼 index는??
		// => i 하나로는 이문제를 풀수가 없구나..!
		for (int i = 1; i <= 10; i++) { // 1~10 중에서 짝수만 찾기
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

//				// 인덱스를 저장할 변수
		int cnt = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				arr[cnt] = i;
				cnt++;
			}
		}

		System.out.println(Arrays.toString(arr));

	}

}
