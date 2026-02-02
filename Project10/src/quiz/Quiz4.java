package quiz;

import java.util.HashMap;

// 학생들의 시험점수를 저장하는 맵을 생성하세요
// 이때, String형 key, Integer형 value를 사용하세요
// 다음과 같이 과목명과 점수를 저장하세요
// {"국어", 80},  {"수학", 90}, {"영어", 100}
// 국어를 50점으로 수정하세요
// 맵에 저장된 전체 데이터를 출력하세요
public class Quiz4 {

    public static void main(String[] args) {

        // 학생들의 시험 점수를 저장하는 맵 생성
        // String형 key, Integer형 value
        HashMap<String, Integer> map = new HashMap<>();

        // 과목명과 점수 저장
        map.put("국어", 80);
        map.put("수학", 90);
        map.put("영어", 100);

        // 국어 점수를 50점으로 수정
        map.replace("국어", 50);

        // 맵에 저장된 전체 데이터 출력
        System.out.println(map);
    }

}
