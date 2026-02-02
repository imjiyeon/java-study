package main;

/*
 * 최상위 클래스 Object
 * */
public class Ex1 {

	public static void main(String[] args) {

		// Object 클래스는 주소값출력, 주소비교 등
		// 모든 클래스에서 공통으로 사용하는 기능이 포함되어 있다
		// 자바의 모든 클래스는 Object 클래스를 자동으로 상속받는다
		// Object 클래스는 모든 클래스의 최상위 클래스이다
		Object object = new Object();

		// Object 클래스에서 상속받은 메소드 사용 가능
		A a = new A();
		a.toString();

		// 부모 클래스인 Object 타입으로 형변환 가능
		// 모든 클래스는 Object 타입으로 형변환할 수 있다!
		Object object2 = new A();
	}
}

class A {
	// 오버라이드 메뉴에서 상속받은 메소드 보기
}
