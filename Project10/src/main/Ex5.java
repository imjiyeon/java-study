package main;

import java.util.HashMap;

/*
* Map
* key와 value를 한 쌍으로 저장하는 자료구조
* */
public class Ex5 {

    public static void main(String[] args) {

        // 한 사람의 정보를 저장하기 위한 맵 생성
        // String형 키, String형 값
        HashMap<String, String> map = new HashMap<>();  // 뒤쪽 제네릭 타입은 생략 가능

        // 데이터 추가 (key, value 쌍)
        map.put("name", "이지수");
        map.put("age", "30");
        map.put("address", "인천");

        // map에 저장된 전체 데이터 출력
        System.out.println(map);

        // key를 이용해 데이터 조회
        System.out.println(map.get("name"));
        System.out.println(map.get("age"));
        System.out.println(map.get("address"));

        // key를 이용해 이름을 둘리로 변경
        map.replace("name", "둘리");
        System.out.println(map);

        // key를 이용해 나이 속성을 삭제
        map.remove("age");
        System.out.println(map);

        // map 크기 구하기
        int size = map.size();
        System.out.println("map 크기: " + size);

    }

}
