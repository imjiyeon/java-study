package array.quiz;

//  5개 크기의 정수형 배열을 생성하고, 다음과 같이 초기화하세요
//  {5, 20, 100, 30, 77}
//
//  배열에서 가장 큰값을 찾으세요.
//  답: 100

public class Quiz5 {

	public static void main(String[] args) {

		// 배열 생성 및 초기화
		int[] arr = new int[] { 5, 20, 100, 30, 77 };

		// 가장 큰값 찾기
		// 하나씩 비교
		//5 20 => 20
		//20 100 => 100
		//100 30 => 100
		//100 77 => 100

		//arr[0] arr[1]
		//max arr[2]
		//max arr[3]
		//max arr[4]

		//max: 둘 중에 더 큰값
		//index: 0~4

		// 최대값을 저장하기 위한 변수
		// 배열의 첫번째 값으로 최대값을 초기화
		int max = arr[0];

		for (int i = 1; i < 5; i++) {

			System.out.print(arr[i] + " vs "  + max);

			if (arr[i] > max) { // 배열의값이 현재 최대값보다 크면
				max = arr[i]; // 최대값 변경
			}
			System.out.print("?? " + max);
			System.out.println();
		}

		System.out.println(max);
	}
}

//5 20 
//20 100
//100 30
//100 77