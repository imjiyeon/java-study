package main;

/*
 * 쇼핑몰 회원관리 프로그램 구현
 * */
public class Ex2 {

	public static void main(String[] args) {
		// 일반회원 생성
		Customer customer = new Customer();
		customer.name = "둘리";
		customer.calcPrice(10000);
		customer.showInfo();

		// vip회원 생성
		VIPCustomer vip = new VIPCustomer();
		vip.name = "또치"; // 부모클래스에서 물려받은 속성
		vip.calcPrice(10000); // 할인안됨. 이문제는 오버라이드 해결할 예정~
		vip.showInfo();
	}
}

