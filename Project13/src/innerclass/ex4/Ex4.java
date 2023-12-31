package innerclass.ex4;

/*
 * 내부클래스 종류와 제약사항 (2)
 * */
class Outer {

	void method(){
		int i = 100;
		
		// 지역 내부 클래스는 메소드 안에서만 사용 가능
		class LocalInner {
			
			void innerMethod() {
				//i = 200; //에러남. 지역변수는 상수로 바뀌어서 값을 변경할 수 없음

				//지역변수는 메소드는 호출이 끝나면 메모리에서 사라진다.
				//하지만 지역 클래스의 객체는 계속 메모리에 남아있다.
				//따라서 메소드의 지역변수보다 객체의 생애주기가 더 길기 때문에, 지역변수는 값을 변경할 수 없도록 상수가 된다.
			}
			
		}
	}
	
}