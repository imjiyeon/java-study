package main;

/* 
 * VIP 클래스의 계산 메소드 재정의
 * */ 
public class Ex4 {

	public static void main(String[] args) {
		Customer customer = new Customer(); //일반 회원 생성
		customer.name = "둘리";
		customer.calcPrice(10000); //일반 등급이므로 정가를 그대로 지불
		customer.showInfo();
		
		VIPCustomer vip = new VIPCustomer(); //VIP 생성
		vip.name = "또치";
		vip.calcPrice(10000); //VIP 등급이므로 10% 할인받아서 9000원을 지불
		vip.showInfo();		
	}
}

