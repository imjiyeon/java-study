package main;

/*
 * 수학과 영어의 평균점수 구하기
 * */
public class Ex3 {

	public static void main(String[] args) {

		int math = 93; //수학점수
		int eng = 70; //영어점수
		
		// 총점 계산
		int hap = math + eng;
		System.out.println(hap); // 163
		
		// 평균 점수 계산
		// int / int  => int  (소수점 버려짐)
		System.out.println(hap/2); // 80
		
		// 계산식에서 두항의 타입이 다르면 더 큰 타입(double) 기준으로 계산됨
		// int/double => double/double
		System.out.println(hap/2.0); // 81.5

	}
}
