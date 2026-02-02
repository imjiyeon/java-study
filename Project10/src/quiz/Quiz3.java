package quiz;

import java.util.HashMap;

// 상품정보를 저장하는 맵을 생성하세요
// 이때, Integer형 key, String형 value를 사용하세요
// 다음과 같이 상품코드와 상품명을 저장하세요
// {1001, "노트북"}, {1002, "마우스"}, {1003, "키보드"}
// 상품코드(키)로 상품정보를 하나씩 조회하세요
public class Quiz3 {

    public static void main(String[] args) {

        // 상품 정보를 저장하는 맵 생성
        // 키-상품코드, 값-상품명
        // Integer형 key, String형 value
        HashMap<Integer, String> map = new HashMap<>();

        // 상품코드와 상품명 저장
        map.put(1001, "노트북");
        map.put(1002, "마우스");
        map.put(1003, "키보드");

        // 상품코드(key)로 상품 정보 조회
        System.out.println(map.get(1001));
        System.out.println(map.get(1002));
        System.out.println(map.get(1003));
    }

}
