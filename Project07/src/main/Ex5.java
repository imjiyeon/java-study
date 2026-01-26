package main;

/*
 * 부모 클래스 타입으로 형변환한 후 재정의된 메소드 호출
 * */
public class Ex5 {

	public static void main(String[] args) {

		// 일반 회원 객체 생성
		Customer customer = new Customer();
		customer.name = "둘리";
		customer.calcPrice(10000); // 정가 그대로 결제
		customer.showInfo();

		// 부모 타입 변수로 자식 객체를 참조
		Customer vc = new VIPCustomer();
		vc.name = "또치";
		// 메서드가 오버라이드되어 있으면
		// 변수 타입과 상관없이 실제 객체의 메서드가 호출됨
		vc.calcPrice(10000); // 할인 적용
		vc.showInfo();
		
		// 다형성을 쓰는 이유?
		// → 변수 하나로 일반회원과 VIP를 같은 방식으로 처리할 수 있음

	}
}
