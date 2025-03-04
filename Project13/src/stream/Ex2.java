package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 스트림의 특징
 * */
public class Ex2 {

	public static void main(String[] args) {

		// 1.한번 생성하고 사용한 스트림은 재사용할 수 없다
		List<Integer> list = Arrays.asList(5, 1, 2, 4, 3, 3); // 리스트 생성
		Stream<Integer> stream = list.stream(); // 스트림 생성

		// forEach: 반복적인 작업을 수행함
		// Consumer를 람다식 함수로 구현해서 인자로 넣음
		stream.forEach(n -> System.out.print(n)); // 리스트 안에 값을 하나씩 출력
//		int count = stream.count(); //에러남. 이미 스트림이 소모되어 닫혔음

		// 2.스트림 연산은 원본데이터를 변경하지 않는다
		// sorted: 요소들을 정렬하여 새로운 스트림을 생성
		// collect: 스트림을 list로 변환
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list); // 원본 데이터 그대로 있음
		System.out.println(sortedList);

		// 3.중간연산은 여러번 할 수 있고, 최종연산은 마지막에 한번만 할 수 있다
		// filter: 조건을 만족하는 요소만 추출
		// sorted: 순서대로 정렬
		// forEach: 특정작업을 반복적으로 수행
		// 3보다 큰 값만 찾아서, 순서대로 정렬 한 후에 출력
		list.stream().filter(n -> n >= 3).sorted().forEach(n -> System.out.print(n));
		
		// 중간연산이 끝나고 다시 스트림을 반환하기 때문에, 계속해서 중간연산을 사용할 수 있음
		Stream<Integer> stream2 = list.stream(); // 스트림 생성
		Stream<Integer> stream3 = stream2.sorted(); //중간연산자 호출

	}

}
