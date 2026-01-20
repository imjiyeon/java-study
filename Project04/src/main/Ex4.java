package main;

/*
 * 안녕하세요 10번 출력하기
 * */
public class Ex4 {

	public static void main(String[] args) {
		//반복문없이 코드 작성
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		
		//반복문을 사용하여 코드 작성
		int num = 1; //초기화
		while (num <= 10) { // 조건식
			System.out.println("안녕하세요");
			num++;
		}
		// 조건을 만족하는 동안 블록을 10번 실행

	}

}
