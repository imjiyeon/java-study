package quiz;

import java.util.ArrayList;

/*
 * 문자 여러개를 저장할 수 있는 리스트를 생성하세요
 * 문자 기본 자료형 char → 클래스 타입 Character
 * 리스트에 문자 5개를 추가하세요 A~E
 * 리스트에서 문자를 하나씩 출력하세요
 * */
public class Quiz1 {
    public static void main(String[] args) {

        //문자를 저장하는 리스트 생성
        ArrayList<Character> list = new ArrayList<Character>();

        //리스트 추가
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

        System.out.println(list.get(0)); //리스트 요소 하나씩 출력
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

    }
}
