package map;

import java.util.Collection;
import java.util.HashMap;

//1. 다음과 같이 학생(Student) 클래스를 만드세요.
//속성: 학번, 이름, 국어점수, 수학점수, 영어점수
//
//2. 학생목록을 저장하는 map 객체를 생성하세요. (키:int, 값:Student)
//
//3. 다음과 같이 맵에 학생 3명을 추가하세요.
//( 학번: 1001, 이름: 둘리, 국어: 90, 수학: 80, 영어: 70 )
//( 학번: 1002, 이름: 도우너, 국어: 55, 수학: 65, 영어: 75 )
//( 학번: 1003, 이름: 또치, 국어: 80, 수학: 50, 영어: 50 )
//
//4. 학생별 총점과 평균점수를 구하세요.
//ex) 둘리의 총점: 240, 평균: 80.0
//
//5. 과목별 총점과 평균점수를 구하세요.
//ex) 국어의 총점: 225, 평균: 75.0

public class Quiz4 {

	public static void main(String[] args) {

		// 학생목록을 저장할 map 생성
		HashMap<Integer, Student> map = new HashMap<>();

		// 학생 추가
		map.put(1001, new Student(1001, "둘리", 90, 80, 70));
		map.put(1002, new Student(1002, "도우너", 55, 65, 75));
		map.put(1003, new Student(1003, "또치", 80, 50, 50));

		// 학생별 총점과 평균 구하기

//		Student student1 = map.get(1001);
//		// 총점 -> 평균
//		int sum1 = student1.kor + student1.math + student1.eng;
//		double avg1 = sum1 / 3.0;
//		System.out.println("둘리의 총점: " + sum1 + ",평균: " + avg1);
//
//		Student student2 = map.get(1002);
//		int sum2 = student2.kor + student2.math + student2.eng;
//		double avg2 = sum2 / 3.0;
//		System.out.println("도우너의 총점: " + sum2 + ",평균: " + avg2);
//
//		Student student3 = map.get(1003);
//		int sum3 = student3.kor + student3.math + student3.eng;
//		double avg3 = sum3 / 3.0;
//		System.out.println("또치의 총점: " + sum3 + ",평균: " + avg3);

		Collection<Student> values = map.values();

		for (Student student : values) {
			// 총점 구하기
			int sum = student.kor + student.math + student.eng;
			// 평균 구하기
			double avg = sum / 3.0;
			// for문 안에서 출력해야함!
			System.out.println(student.studentName + "학생의 총점: " + sum + ", 평균: " + avg);
		} // for문이 한번 돌면, 한 학생에대한 정보가 나옴

		System.out.println();

		// 과목별 총점과 평균 구하기
		int korSum = 0;
		int mathSum = 0;
		int engSum = 0;

//		Student student1 = map.get(1001);
//		Student student2 = map.get(1002);
//		Student student3 = map.get(1003);
//
//		korSum = student1.kor + student2.kor + student3.kor;
//		korSum = korSum + student1.kor;
//		korSum = korSum + student2.kor;
//		korSum = korSum + student3.kor;

		for (Student student : values) {
			korSum = korSum + student.kor;
			mathSum = mathSum + student.math;
			engSum = engSum + student.eng;
		} // for문이 다 끝나야지 과목에대한 정보가 나옴

		// for문 밖에서 출력해야함!
		System.out.println("국어의 총점: " + korSum + ", 평균: " + (korSum / 3.0));
		System.out.println("수학의 총점: " + mathSum + ", 평균: " + (mathSum / 3.0));
		System.out.println("영어의 총점: " + engSum + ", 평균: " + (engSum / 3.0));

	}
}

//학생 클래스
class Student {
	int studentId; // 학번
	String studentName; // 이름
	int kor; // 국어점수
	int math; // 수학점수
	int eng; // 영어점수

	public Student(int studentId, String studentName, int kor, int math, int eng) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", kor=" + kor + ", math=" + math
				+ ", eng=" + eng + "]";
	}

}