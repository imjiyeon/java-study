package quiz;

public class Quiz3 {

	public static void main(String[] args) {

		// 아래와 같이 알파벳 배열을 생성하고
		// for문을 사용해 a부터 g까지 하나씩 출력하세요
		char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

		for (int i = 0; i < 7; i++) {
			System.out.println(letters[i]);
		}

		// 아래와 같이 과일 배열을 생성하고
		// for문을 사용해 배열에 저장된 과일을 하나씩 꺼내서 출력하세요
		String[] fruits = {"apple", "banana", "cherry"};

		for (int i = 0; i < 3; i++) {
			System.out.println(fruits[i]);
		}

		// 아래와 같이 장바구니 배열을 생성하고
		// for문을 사용해 배열에 저장된 물건 하나씩 꺼내서 출력하세요
		// 예) "1번 물건: 사과" "2번 물건: 바나나" "3번 물건: 우유"
		String[] items = {"사과", "바나나", "우유"};

		for (int i = 0; i < 3; i++) {
			int num = i + 1; // 출력번호
			System.out.println(num + "번 물건: " + items[i]);
		}

	}

}
