package main;

/*
 * 대입연산자
 * */
public class Ex7 {

	public static void main(String[] args) {

		int x = 10; //오른쪽의값을 왼쪽변수에 대입
		
		// 복합 대입연산자 => 대입 + 산술
		// 오른쪽 식을 계산한 후에 x에 대입
		x += 10; //x = x + 10	
		System.out.println(x); //20
		
		x -= 5; //x = x - 5;
		System.out.println(x); //15
		
		x *= 10; //x = x * 10;
		System.out.println(x); //150
		
		x /= 10; //x = x / 10;
		System.out.println(x); //15
		
		x %= 10; // x = x % 5; 
		System.out.println(x); //5

	}

}
