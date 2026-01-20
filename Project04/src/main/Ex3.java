package main;

/*
 * if~elseif~else문
 * */
public class Ex3 {

	public static void main(String[] args) {

		int speed = 90;

		// else if문: 여러 조건을 비교해야할 때 사용
		
		if (speed >= 100) { 
			System.out.println("사진 찍고 면허 정지");
		} else if (speed >= 80) { 
			System.out.println("사진 찍고 벌금");
		} else { 
			System.out.println("주행 계속");
		} 
		//어떤 조건을 만족하면, 다음 조건을 비교하지않고 조건문이 종료된다 
		
	}
	
}
