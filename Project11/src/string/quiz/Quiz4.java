package string.quiz;


//3번(이전문제)를 함수로 만들어주세요.
//리턴타입: int
//매개변수: String
//함수이름: getCharCount
//메인함수에서 함수를 호출하세요.
//ex:
//getCharCount("자바 프로그래밍 입문") -> 9
//getCharCount("equals 메소드는 두 객체가 같은지 비교한다") -> 21

public class Quiz4 {

    public static void main(String[] args) {
        int result1 = getCharCount("자바 프로그래밍 입문");
        System.out.println(result1);  // 9
        int result2 = getCharCount("equals 메소드는 두 객체가 같은지 비교한다");
        System.out.println(result2); // 21
    }
	
    // 메소드의 종류: 인스턴스 메소드 / static 메소드
    
    // 매개변수: 문자열
    // 리턴값: 문자의 개수
    // 함수 안에서 문자의 개수를 구해서 리턴
	static int getCharCount(String str) {
        String newStr = str.replace(" ", "");
        return newStr.length(); // 문자의 개수를 반환
    }

}
