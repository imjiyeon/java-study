package main;

/*
 * 증감연산자
 * */
public class Ex1 {

	public static void main(String[] args) {

		  int x = 100;

		  //증감연산자가 변수의 뒤에 있을때
		  System.out.println(x++); // 100 일단 사용하고 나중에 +1
		  System.out.println(x);   // 101

		  //증감연산자가 변수의 앞에 있을때
		  System.out.println(++x); // 102 먼저 +1 하고 사용
		  System.out.println(x);   // 102

	}
}
