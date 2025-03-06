package quiz;

public class Quiz10_factorial {

	public static void main(String[] args) {
		
		int result = factorial(3); //3!
		System.out.println(result);
	}

	// 3!
	// 3 * 2!
	// 2 * 1!
	// return 1
	
	public static int factorial(int num) {

		if (num == 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}

	}
	// 먼저 실행된 함수가 나중에 끝남..
	// 함수 호출 순서
	// factorial(5)
	// 5 * factorial(4)
	// 5 * 4 * factorial(3)
	// 5 * 4 * 3 * factorial(2)
	// 5 * 4 * 3 * 2 * factorial(1)
	// 5 * 4 * 3 * 2 * 1

	// 함수가 끝나는 순서
	// factorial(1) > factorial(2) > factorial(3) > factorial(4) > factorial(5)

}
