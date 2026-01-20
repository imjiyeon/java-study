package main;

/*
 * 숫자 1부터 10까지 츨력하기
 * */
public class Ex5 {

	public static void main(String[] args) {
		//반복문없이 코드 작성
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		
		//반복문으로 코드 작성
		// num은 조건식과 숫자를 출력할때 사용됨
		int num = 1; //초기화
		while (num <= 10) { //조건식
			System.out.println(num);
			num++; // num을 1씩 증가시켜서 출력
		}
		// 조건을 만족하는 동안 블록을 10번 실행

		// 문자열 연결
		int n = 1;
		while (n <= 10) {
			System.out.println(n+"번 출력");
			n++;
		}
		
	}

}
