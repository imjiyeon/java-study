package main;

/*
 * 다형성을 활용하여 회원 관리 프로그램 구현
 * */
public class Ex6 {

	public static void main(String[] args) {

		// 회원을 담을 배열 생성
		// 자료형을 부모클래스로 지정
		Customer[] arr = new Customer[3];

		//배열에 회원 추가
		arr[0] = new Customer(); //일반 회원 생성
		arr[0].name = "둘리";

		arr[1] = new Customer();
		arr[1].name = "또치";

		arr[2] = new VIPCustomer(); //vip 회원 생성
		arr[2].name = "도우너";

		//등급에 따라 적립률과 할인률이 적용됨
		//다형성을 활용하면 부모클래스 하나로 여러개의 자식 클래스를 사용할 수 있음 (다형성의 장점)
		System.out.println("====== 회원등급에따라 할인율과 보너스 포인트 계산 =======");

		for(int i=0; i<3; i++){
			arr[i].calcPrice(10000); //실제 인스턴스에따라 재정의된 메소드 호출
			arr[i].showInfo(); //고객정보 출력
		}

	}
}

