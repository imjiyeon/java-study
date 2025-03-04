package stream.quiz;

import java.util.ArrayList;
import java.util.List;

//여행사 고객 정보를 저장하는 Customer 클래스를 만드세요
//속성: 이름,나이,여행비용
//
//고객 리스트를 만드세요
//		(둘리, 40(세), 여행비용 100(만원)), (또치, 13(세), 여행비용 50(만원)), (도우너, 25(세), 여행비용 70(만원))
//
//고객 리스트를 사용하여 다음과 같은 정보를 출력하세요.
//- 고객 명단 =>  둘리 또치 도우너
//- 총 여행 비용 => 220
//		- 20세 이상의 고객 명단 => 도우너 둘리
//- 나이가 많은 순으로 정렬
//=> 둘리, 40
//도우너, 25
//또치, 13

public class Quiz4 {

	public static void main(String[] args) {

		Customer customer1 = new Customer("둘리", 40, 100);
		Customer customer2 = new Customer("또치", 13, 50);
		Customer customer3 = new Customer("도우너", 25, 70);

		List<Customer> customerList = new ArrayList<>();
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);

		System.out.println("== 고객 명단 ==");

		// forEach: 특정작업을 반복적으로 수행 (고객의 정보에서 이름만 출력)
		customerList.stream()
				.forEach(c -> System.out.println(c.name));

		//2. 여행 총 비용
		// mapToInt: 값을 변환하고, 기본형 스트림 반환 (Customer 객체 -> 여행비용)
		// sum: 스트림 요소의 합 구하기 (여행비용의 합계)
		int total = customerList.stream()
				.mapToInt(c -> c.budget)
				.sum();

		System.out.println("총 여행 비용: " + total);

		//3. 20세 이상 고객의 명단을 나이순으로 정렬해서 출력
		// filter: 조건을 만족하는 요소만 추출 (나이가 20살 이상인)
		System.out.println("== 20세 이상 고객 명단 ==");
		customerList.stream()
				.filter(c -> c.age >= 20)
				// 순정렬(작은거 > 큰거) 도우너:25 둘리:40
				.sorted((c1, c2) -> {
					if(c1.age > c2.age) {
						return 1; //양수면 c1.age가 뒤로 이동..
					} else {
						return -1; //음수면 c2.age가 뒤로 이동..
					}
				})
				.forEach(c -> System.out.println(c.name + ", " +c.age));
	}
}

// 고객 클래스
class Customer {

	String name;   //이름
	int age;       //나이
	int budget;    //여행비용
	
	public Customer(String name, int age, int budget) {
		this.name = name;
		this.age = age;
		this.budget = budget;
	}

}
