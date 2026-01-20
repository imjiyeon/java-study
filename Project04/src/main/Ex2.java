package main;

/*
 * if~else문
 * */
public class Ex2 {

	public static void main(String[] args) {

		// 자동차 속도가 80km 이상이면 과속카메라가 사진을 찍는다, 그렇지 않으면 주행을 계속한다
		int speed = 70; 
		
		if (speed >= 8) {
			System.out.println("과속카메라가 사진을 찍는다"); // 조건을 만족하면 if 블록이 실행됨
		} else {
			System.out.println("주행을 계속한다"); // 조건을 만족하지 않으면 else 블록이 실행됨
		}
		
	}
	
}