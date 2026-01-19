package quiz;

/*
 * <증감연산자>
 * 코드를 보고, x y result의 값을 예상해서 주석으로 작성하세요
 * */
public class Quiz3 {

	public static void main(String[] args) {

		// 소지금을 저장할 변수를 선언하고 임의의 숫자를 대입하세요
		// 소지금이 2000원 이상이면 참이 나오도록 조건식을 작성하세요
		int money = 2500;
		System.out.println(money >= 2000);
		
		// 숫자를 저장할 변수 2개를 선언하고 임의의 숫자를 대입하세요
		// 두 변수의 값이 같으면 참이 나오도록 조건식을 작성하세요
		int a = 5;
		int b = 5;
		System.out.println(a == b);

		// 나이를 저장할 변수를 선언하고 임의의 숫자를 대입하세요
		// 나이가 13세 이상이고 19세 이하라면 참이 나오도록 조건식을 작성하세요
		int age = 15;
		System.out.println(age >= 13 && age <= 19);

	}

}
