package test;

// 문자열 포맷팅
public class StringTest {

	public static void main(String[] args) {

		// format: 특정형식에 맞게 문자열을 만드는 함수
		// %s: 문자열이 들어갈 자리
		// %d: 정수가 들어갈 자리
		// 첫번째 인자는 원본문자열, 나머지는 %s와 %d에 들어갈 값들
		String str = String.format("이름: %s, 나이:%d", "둘리", 10);

		System.out.println(str);

	}

}
