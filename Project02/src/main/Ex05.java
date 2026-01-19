package main;

/*
 * 문자 자료형
 * */
public class Ex05 {

	public static void main(String[] args) {
		
		//char형는 한글자 문자 저장 가능
		char ch = 'A';	//문자를 작은따음표로 감싸야함	
		System.out.println(ch);	
		
		//String형은 문자열 저장 가능
		String str = "안녕하세요"; //텍스트를 큰따음표로 감싸야함
		System.out.println(str);
		
		// \n한줄띄기를 의미하는 특수문자
		// \t 탭을 의미하는 특수문자
		System.out.print("\n안녕하세요\t저는둘리입니다");
	}
}
