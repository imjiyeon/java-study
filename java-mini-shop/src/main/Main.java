package main;

import java.util.List;
import java.util.Scanner;

// 메인 프로그램
public class Main {
	
	public static void main(String[] args) {
		
		// 키보드 입력을 받는 클래스
		// Scanner는 보조 클래스로 System.in(입력 스트림) 없이는 사용 불가
		Scanner scanner = new Scanner(System.in);
		
		// 무한루프를 이용하여 5번이 입력될 때까지 프로그램을 실행
		while(true) {
			System.out.println("1. 상품 주문하기");
			System.out.println("2. 전체 주문 이력 보기");
			System.out.println("3. 고객별 주문 이력 보기");
			System.out.println("4. 특정날짜에 들어온 주문이력 보기");
			System.out.println("5. 끝내기");
			System.out.print("옵션을 선택하세요: ");
			
			// 1~5 중에서 옵션 입력하기 
			int choice = scanner.nextInt();
			
			// 위에서 숫자를 입력받을때 1 + 엔터를 입력
			// 1은 nextint에 들어가고, 줄바꿈(엔터)가 버퍼에 남아버림.
			// 그래서 customerName를 입력받을 때 사용자가 입력을 안했는데도 nextLine()이 넘어가버림
			scanner.nextLine(); // 버퍼 비우기
			
			// 상품 주문
			// 사용자로부터 고객명, 상품명, 제품수량, 제품가격 입력 받기
			if (choice == 1) {
				System.out.println("고객명:");
				// nextLine: 문자열을 입력받는 함수
				String customerName = scanner.nextLine();

				System.out.println("제품명:");
				String productName = scanner.nextLine();
				
				System.out.println("제품수량:");
				// nextInt: 숫자를 입력받는 함수
				int productCount = scanner.nextInt();
				
				System.out.println("제품가격:");
				int productPrice = scanner.nextInt();
				
				// 주문이력 생성
				Order order = new Order(customerName, productName, productCount, productPrice);
				// 파일에 주문이력 쓰기
				// static 함수는 인스턴스 없이 사용 가능
				FileManager.saveOrder(order);
				System.out.println("주문이 완료되었습니다");
				
			// 전체 주문 이력 조회	
			} else if(choice == 2) {
				List<Order> list = FileManager.readOrders();
				for(Order order : list) {
					System.out.println(order);
				}
			} else if(choice == 3) {
				System.out.print("고객명: ");
				String customerName = scanner.nextLine();
				long orderCnt = FileManager.getCountByCustomer(customerName);
				System.out.println("주문 건수: " + orderCnt);
				int orderPrice = FileManager.getTotalPriceByCustomer(customerName);
				System.out.println("주문 금액: " + orderPrice);
			} else if(choice == 4) {
				System.out.print("날짜: ");
				String date = scanner.nextLine();
				List<Order> orders = FileManager.getOrdersByDate(date);
				for(Order order:orders) {
					System.out.println(order);
				}
			} else if(choice == 5) {
				System.out.println("프로그램을 종료합니다..");
				break; // 반복문 종료
			} else {
				System.out.println("잘못된 옵션이 입력되었습니다..");
			}
			
		}

	}

}
