package method;

/*
 * 1. 두수를 더하는 함수를 만들고 호출하기
 * 디버깅을 사용하여 메소드의 호출 및 값 전달 과정을 확인한다
 */
public class Calculator {

	// 두수를 더하는 함수 선언
	public static int add(int n1, int n2) { // 넘겨받은 3과 5는 매개변수에 저장
		int result = n1 + n2;
		return result; // 결과값 반환
	}

	public static void main(String[] args) {

		int num1 = 3;
		int num2 = 5;
		int sum = add(num1, num2); // 함수 호출 후 결과값을 반환 받는다
		// 결과값을 저장할 변수의 자료형과 리턴타입이 일치해야 한다

		System.out.println(num1 + " + " + num2 + " = " + sum);
	}

}
