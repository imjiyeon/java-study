package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// 쇼핑몰 주문이력
public class Order {

	int orderNo; // 주문번호
	String customerName; // 고객명
	String productName; // 제품명
	int productCnt; // 주문수량
	int productPrice; // 제품가격
	LocalDateTime orderDate; // 주문일시

	// 주문번호x 주문일시x
	public Order(String customerName, String productName, int productCnt, int productPrice) {
		this.customerName = customerName;
		this.productName = productName;
		this.productCnt = productCnt;
		this.productPrice = productPrice;
		// 주문번호는 나중에 처리
		// 주문일은 현재시간으로 저장
		this.orderDate = LocalDateTime.now();
		
		// 새로운 주문번호 만들기
		int newOrderNo = FileManager.generateOrderNo();
		this.orderNo = newOrderNo;
	}
	
	// 주문번호o 주문일시o
	public Order(int orderNo, String customerName, String productName, int productCnt, int productPrice,
			LocalDateTime orderDate) {
		super();
		this.orderNo = orderNo;
		this.customerName = customerName;
		this.productName = productName;
		this.productCnt = productCnt;
		this.productPrice = productPrice;
		this.orderDate = orderDate;
	}

	// 주문이력을 문자열로 반환하는 함수
	@Override
	public String toString() {
		// 날짜 포맷
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDate = orderDate.format(formatter);
		// 주문이력 포맷
		String date = String.format("주문번호: %d, 고객명: %s, 제품명: %s, 주문수량: %d, 가격: %d, 주문일시: %s", orderNo, customerName,
				productName, productCnt, productPrice, formattedDate);
		return date;
	}

}
