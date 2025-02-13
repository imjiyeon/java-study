 package main;

 /*
  * 논리연산자와 논리부정연산자
  * */
public class Ex6 {

	public static void main(String[] args) {
		
		boolean result1 = (5 > 0) && (10 > 0); // true && true
		boolean result2 = (5 > 0) && (10 < 0); // true && false
		
		// 첫번째식이 true이므로 두번째식은 계산안함
		boolean result3 = (5 > 0) || (10 > 0); // true||true
		boolean result4 = (5 > 0) || (10 < 0); // true||false
		
		boolean result5 = !true; // true -> false
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
	}
}
