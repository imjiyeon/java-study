package main;

/*
 * 학생클래스로 객체 여러개 생성하기
 * */
public class Ex2 {

	public static void main(String[] args) {

		Student student1 = new Student(); // 첫번째 학생 생성
		student1.id = 1001; // 객체의 멤버변수를 사용해서 학번 변경
		student1.name = "둘리";
		student1.showInfo(); // 객체의 메소드를 사용해서 학생의 모든정보 출력
		System.out.println("객체의 주소: " + student1); // 객체의 주소

		Student student2 = new Student(); // 두번째 학생 생성
		student2.id = 1002;
		student2.name = "또치";
		student2.showInfo();
		System.out.println("객체의 주소: " + student2); // 객체의 주소

		// 각 인스턴스의 주소가 다른것을 확인

	}
}
