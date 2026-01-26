package main;

/* 
 * 상위클래스 타입으로 형 변환
 * */
public class Ex3 {

	public static void main(String[] args) {

		// 부모타입 변수 = 자식 인스턴스 생성
		Customer vc = new VIPCustomer();
		vc.name = "둘리";
		System.out.println(vc.name);

		// 부모 타입 변수는 부모 클래스의 멤버만 사용할 수 있음
		//vc.saleRatio // 사용 불가. VIP클래스에만 있는 멤버

	}
}
