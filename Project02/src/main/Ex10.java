package main;

/*
 * 강제형변환
 * */
public class Ex10 {

	public static void main(String[] args) {

		// 정수형
		// int -> byte
		int i = 1000;
		// 강제형변환을 할때는 타입을 앞에 써줘야함
		byte b = (byte) i; // byte형은 1000을 저장할수 없기 때문에 값이 손실됨
		System.out.println(b); // -24

		// 실수형
		// double -> float
		double d = 1.2;
		// 강제형변환을 할때는 타입을 앞에 써줘야함
		float f = (float) d;

		// 정수형과 실수형
		// float -> int
		int i2 = (int) f; // int와 float형은 크기는 같지만, float형이 더 정밀함
		System.out.println(i2); // 소수점아래를 잃었기 때문에 1.2에서 1이 됨
	}
}
