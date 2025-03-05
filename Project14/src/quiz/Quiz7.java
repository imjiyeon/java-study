package quiz;

import java.util.*;

public class Quiz7 {

	public static void main(String[] args) {

		// 다음 코드를 실행하면 에러가 발생합니다.
		// 프로그램이 정상적으로 종료되도록 예외처리를 해주세요.

		// 숫자 목록 생성
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		Iterator<Integer> iterator = set.iterator();
		
		int num1 = iterator.next();
		int num2 = iterator.next();
		int num3 = iterator.next();
		int num4 = iterator.next();

		System.out.println("프로그램이 정상적으로 종료되었습니다");

//		try {
//			// 숫자 목록 생성
//			Set<Integer> set = new HashSet<>();
//
//			set.add(1);
//			set.add(2);
//			set.add(3);
//
//			Iterator<Integer> iterator = set.iterator();
//
//			int num1 = iterator.next();
//			int num2 = iterator.next();
//			int num3 = iterator.next();
//			int num4 = iterator.next(); //더 이상 꺼낼 요소가 없어서 에러남
//		} catch (NoSuchElementException e) {
//			System.out.println(e);
//		}

	}

}
