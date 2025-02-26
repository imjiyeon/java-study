package string.quiz;


//  "자바 프로그래밍 입문"이라는 문자열을 만드세요.
//  공백을 제외한 글자수만 세어서 출력하세요.
//
//  ex) "자바 프로그래밍 입문" -> 9 (전체:11 공백:2)

public class Quiz3 {

    public static void main(String[] args) {

        String str = "자바 프로그래밍 입문";
        System.out.println(str.length()); // 공백을 포함한 길이는 11

        // 1. 반복문을 사용하여 공백을 제외하고 문자개수 세기
        int realLength = 0; // 길이
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') { // 공백이 아니면 숫자 증가
                realLength++;
            }
        }
        System.out.println(realLength); // 9

        // 2. 공백을 제거
        String newStr = str.replace(" ", "");
        System.out.println(newStr.length());
    }
}
