package main;

/*
 * 학생클래스 정의하고 객체 생성하기
 * */
public class Ex1 {

	public static void main(String[] args) {

		Student student = new Student(); //Student 객체 생성
		
		student.id = 1001; //객체의 멤버변수를 사용해서 학번 변경
		student.name = "둘리";
		
		// 학생의 정보를 하나씩 출력
		System.out.println("학번: " + student.id);
		System.out.println("이름: " + student.name);

		// 객체의 메소드를 사용해서 학생의 모든 정보 출력
		student.showInfo(); // 객체의 정보
		System.out.println("객체의 주소: " + student); // 객체의 주소
		
	}
}

