package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// 주문 이력을 파일에 저장하고 불러오는 클래스
public class FileManager {

	// 파일 이름은 고정되어 변경되지 않음
	// final: 변하지 않는 값. 상수
	// static: 인스턴스없이 사용할 수 있는 값. 공통변수에 사용
	final static String FILE_NAME = "order.txt";

	// 파일에 주문이력을 쓰는 메소드
	// 매개변수: 주문이력
	public static void saveOrder(Order order) {
		try {
			// 문자기반 출력 스트림
			// 두번째 인자는 옵션으로 파일에 내용을 이어서 작성하겠다는 의미
			FileWriter writer = new FileWriter(FILE_NAME, true);
			// 파일의 내용을 한줄씩 읽어올 수 있도록 도와주는 보조스트림
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write(order.toString());
//			bufferedWriter.write("\n"); // 줄바꿈
			bufferedWriter.newLine(); // 줄바꿈
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	// 파일에서 주문이력을 읽어오는 메소드
	// 모르겠으면 일단 리턴타입x 매개변수x
	// 리턴타입: Order 리스트
	public static List<Order> readOrders() {
		
		// 주문이력 리스트 생성
		List<Order> orders = new ArrayList<Order>();
		
		try {
			// 문자 기반 입력 스트림
			FileReader reader = new FileReader(FILE_NAME);
			
			// 파일의 내용을 한줄씩 읽어올 수 있도록 도와주는 보조 스트림
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			while(true) {
				// 주문이력이 한 줄씩 저장되어 있으므로 한 줄씩 읽어옴
				String line = bufferedReader.readLine();
				if(line == null) {
					break;
				}
				
				// 문자열을 Order 객체로 변환 (파싱)
				// 이유: 문자열은 통데이터여서 나중에 주문금액을 계산할 수 없음
				// 필요한 정보만 추출하기 위해 파싱이 필요함
				String[] arr = line.split(", "); 
				// [주문번호: 0, 고객명: 둘리, 제품명: 옷, 주문수량: 1, 가격: 1000, 주문일시: 2025-03-07 11:43:37]
				
				// 값만 다시 추출하기 위해 2차 파싱
//				String value1 = arr[0].split(": ")[1]; // [주문번호, 0]
//				String value2 = arr[1].split(": ")[1]; // [고객명, 둘리]
//				String value3 = arr[2].split(": ")[1]; // [제품명, 바지]
//				String value4 = arr[3].split(": ")[1]; // [주문수량, 1]
//				String value5 = arr[4].split(": ")[1]; // [가격, 15000]
//				String value6 = arr[5].split(": ")[1]; // [주문일시, 2025-03-07 11:43:37]
				
				// 타입에 맞게 변환
				int value1 = Integer.parseInt(arr[0].split(": ")[1]);  // 0 (string -> int)
				String value2 = arr[1].split(": ")[1]; // "둘리"
				String value3 = arr[2].split(": ")[1]; // "바지"
				int value4 = Integer.parseInt(arr[3].split(": ")[1]); // 1 (string -> int)
				int value5 = Integer.parseInt(arr[4].split(": ")[1]); // 15000 (string -> int)
				// String -> LocalDateTime
				String value6 = arr[5].split(": ")[1]; // 2025-03-07 11:43:37
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
				LocalDateTime localDateTime = LocalDateTime.parse(value6, formatter);
				
				// 주문이력 생성
				Order order = new Order(value1, value2, value3, value4, value5, localDateTime);
				
				// 리스트에 추가
				orders.add(order);
			}
			bufferedReader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return orders;
	}
	
	// 특정 회원의 주문건수를 계산하는 메소드
	// 모르겠으면 일단 리턴타입x 매개변수x
	// 매개변수: 회원의 이름
	// 리턴타입: 주문건수
	public static long getCountByCustomer(String customerName) {
		// 특정 회원의 이름
//		String customerName = "둘리";
		
		// 위에 있는 함수를 사용하여 주문이력 조회
		List<Order> orders = readOrders();
		
		// 스트림을 이용하여 특정회원의 주문 건수 구하기
		long count = orders.stream()
							.filter(order->order.customerName.equals(customerName))
							.count();
		return count;
	}
	
	// 특정 회원의 주문금액을 계산하는 메소드
	// 매개변수: 회원의이름
	// 리턴값: 주문금액
	public static int getTotalPriceByCustomer(String customerName) {

		// 주문이력 조회
		List<Order> orders = readOrders();
		
		// 스트림을 이용하여 총 주문 금액 구하기
		// 주문금액: 주문건수 * 제품의가격
		int sum = orders.stream()
							.filter(order->order.customerName.equals(customerName))
							.mapToInt(order->order.productPrice*order.productCnt)
							.sum();
		return sum;
	}
	
	// 특정날짜에 들어온 주문이력을 조회하는 메소드
	// 매개변수: 주문일
	// 리턴값: 주문 리스트
	public static List<Order> getOrdersByDate(String date) {
		
		// 문자열을 LocalDate로 변환
		// LocalDate: 날짜만 저장하는 클래스
	    LocalDate localDate = LocalDate.parse(date);

	    // 주문이력 리스트 조회
		List<Order> orders = readOrders();
		
		// datetime에서 date부분만 추출해서 비교
	    List<Order> filteredList = orders.stream()
						                .filter(order -> localDate.equals(order.orderDate.toLocalDate()))
						                .collect(Collectors.toList());
	    return filteredList;
	}
	
	// 쇼핑몰 주문번호를 생성하는 메소드
	public static int generateOrderNo() {

		List<Order> list = readOrders();
		if (list.size() == 0) {
			return 1;
		} else {
			int lastIndex = list.size() - 1;
			Order order = list.get(lastIndex);
			return order.orderNo + 1;
		}
	}
	
}
