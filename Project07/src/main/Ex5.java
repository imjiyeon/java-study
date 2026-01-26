package main;

/*
 * 부모 클래스 타입으로 형변환한 후 재정의된 메소드 호출
 * */
public class Ex5 {

	public static void main(String[] args) {

		// 부모타입으로 형변환
		// 부모 타입 변수로 자식 객체를 참조
		Customer vc = new VIPCustomer();
		vc.name = "둘리";

		// 메서드가 오버라이드되어 있으면 변수 타입과 상관없이 자식 클래스의 메서드가 호출됨
		vc.calcPrice(10000); //할인가로 계산됨

		vc.showInfo();

	}
}
