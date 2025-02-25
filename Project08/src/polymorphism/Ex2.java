package polymorphism;

/* 
 * 쇼핑몰 회원 관리 프로그램에 다형성 활용하기
 * */
public class Ex2 {

	public static void main(String[] args) {
		Customer customer1 = new Customer("둘리");
		customer1.calcPrice(10000);
		customer1.showInfo();

		// 부모타입으로 형변환
		Customer customer2 = new VIPCustomer("또치"); // VIP 회원을 Customer형으로 선언
		customer2.calcPrice(10000); //재정의된 메소드가 호출되어 할인가로 계산됨
		customer2.showInfo();
		
		//등급에 따라 적립률과 할인률이 적용됨
		//다형성을 활용하면 부모클래스 하나로 여러개의 자식 클래스를 사용할 수 있음 (다형성의 장점)
	}
}

//오버라이드(override)패키지의 회원 클래스 복사하기
class Customer {
	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;

	public Customer(String customerName) {
		super();
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		System.out.println(customerName+"님이 " + price + "원을 결제했습니다.");
	}

	public void showInfo() {
		System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
	}

}

class VIPCustomer extends Customer {

	double saleRatio;

	public VIPCustomer(String customerName) {
		super(customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	@Override
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio);
		System.out.println(customerName+"님이 " + salePrice + "원을 결제했습니다.");
	}
}
