package quiz;

 
//  <형변환>
//  변수 두개를 선언해서 10과 2.0을 대입하고, 두 변수를 더한 결과를 구하세요.
//  그리고 결과는 정수로 출력해주세요.
  
public class Quiz8 {
	public static void main(String[] args) {
		int i = 10;
		float f = 2.0f;

		// 풀이
		// 컴퓨터는 계산하기 전에 두항의 타입을 일치시킨후에 계산함
		// int + float -> float + float = 10.0 + 2.0 = 12.0
		System.out.println(i + f); // 12.0
		
		// 1. 더한 결과를 int형으로 형변환
		System.out.println((int) (i + f)); // 12
		// 2. float을 int형으로 형변환한 후 더하기
		System.out.println(i + (int)f); // 12

	}
}
