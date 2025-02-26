package object;


//  <다운캐스팅 복습>
//
//3번째 예제에서 작성한 Student클래스를 사용하세요.
//Object형 변수를 선언하고 Student객체를 대입하세요. (형변환)
//형변환된 변수를 다시 원래 타입으로 다운캐스팅하세요.
//학생의 학번과 이름을 출력하세요.

public class Quiz2 {

	public static void main(String[] args) {

		// Object는 모든 클래스의 부모이기때문에 형변환 가능
		Object obj = new Student(1001, "둘리");

		// 하지만 object 타입 변수로는 학번과 이름을 사용할 수 없음

		if (obj instanceof Student) { // 타입 체크
			Student student = (Student)obj; // 원래 타입으로 변경
			System.out.println("학번: " + student.id);
			System.out.println("이름: " + student.name);
		}

	}
}
