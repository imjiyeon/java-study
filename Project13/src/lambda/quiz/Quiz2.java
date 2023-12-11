package lambda.quiz;

/*
 * 다음 코드를 람다식으로 변경하세요.
 * */

//함수형 인터페이스 선언
interface Hello {
	// 추상메소드 선언
	void helloPrint();
}

public class Quiz2 {

	public static void main(String[] args) {

		// 익명클래스 사용
		Hello hello1 = new Hello() {
			public void helloPrint() {
				System.out.println("안녕하세요");
			}
		};
		hello1.helloPrint();
		
		// 람다식 함수 사용
		Hello hello2 = () -> System.out.println("안녕하세요");
		hello2.helloPrint();

	}

}
