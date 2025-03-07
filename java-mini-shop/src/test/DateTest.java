package test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// 날짜 조회/포맷팅/변환
public class DateTest {

	public static void main(String[] args) {

		// LocalDateTime: 날짜와 시간을 저장할 수 있는 클래스
		// now: 현재시간 조회
		LocalDateTime currentDate = LocalDateTime.now();
		System.out.println(currentDate);

		// 시간 표준: ISO8601
		// DateTimeFormatter: 날짜와 시간의 형식을 지정할 때 클래스
		// LocalDate, LocalDateTime 같은 날짜 데이터와 함께 사용됨
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDate = currentDate.format(formatter);
		System.out.println(formattedDate);

		// String -> LocalDateTime 변환
		String str = "2025-03-07 09:00:00";
		LocalDateTime parseDate = LocalDateTime.parse(str, formatter);
		System.out.println(parseDate);

		// String -> LocalDate 변환
		String str2 = "2025-03-07";
		LocalDate parseDate2 = LocalDate.parse(str2); // 문자열만 입력
		System.out.println(parseDate2);
	}

}
