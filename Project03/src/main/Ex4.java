package main;

/*
 * 비교연산자
 * */
public class Ex4 {

	public static void main(String[] args) {	
		
		// 학생의 시험점수
		int score = 70;
		// 점수가 60점이상이면 시험 통과
		System.out.println(score >= 60); // 값이 더 큰지 검사

		// 회원가입시 등록한 비밀번호
		int password = 1111; 
		// 로그인시 비밀번호 검사하여 일치하면 로그인 성공
		System.out.println(password == 1234); // 같은지 검사
		// 로그인시 비밀번호 검사하여 다르면 경고메세지 출력
		System.out.println(password != 1234); // 다른지 검사

	}
}
