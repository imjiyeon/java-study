package quiz;

public class Quiz2 {

	public static void main(String[] args) {

		// 다음 코드를 실행하면 에러가 발생합니다.
		// 프로그램이 정상적으로 종료되도록 예외처리를 해주세요.

		String s = null;
		System.out.println(s.length());
		System.out.println("프로그램이 정상적으로 종료되었습니다");
		
//		try {
//			String s = null;
//			System.out.println(s.length());
//		}catch (NullPointerException e) {
//			System.out.println(e); // 빈객체는 사용할 수 없어서 에러남
//		}

	}

}
