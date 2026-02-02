package main;

import java.util.ArrayList;

/*
* 리스트
* 여러 개의 데이터를 순서대로 저장하는 자료구조
* */
public class Ex4 {

    public static void main(String[] args) {
        
        // 숫자 여러개를 저장하기 위한 리스트 생성
        // <> 자리에는 리스트에 저장할 데이터의 자료형 작성 (클래스 타입만 가능)
        // 기본 자료형 int → 클래스 타입 Integer
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // 리스트에 숫자 추가
        list.add(10);
        list.add(20);
        list.add(30);

        // 인덱스를 이용해 요소를 하나씩 출력
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        
        // 리스트에 저장된 전체 데이터 출력
        System.out.println(list);
        
        // 인덱스를 이용해 요소 삭제
        list.remove(2);
        System.out.println(list);
        
        // 리스트에 저장된 값의 개수
        int size = list.size();
        System.out.println("리스트 크기: " + size);

    }

}
