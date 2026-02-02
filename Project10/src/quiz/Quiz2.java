package quiz;

import java.util.ArrayList;

/*
 * 실수 여러개를 저장할 수 있는 리스트를 생성하세요
 * 실수 기본 자료형 double → 클래스 타입 Double
 * 리스트에 실수 3개를 추가하세요 1.1 2.2 3.3
 * 리스트에서 3.3을 삭제하세요
 * 리스트에 저장된 전체 데이터를 출력하세요
 * */
public class Quiz2 {
    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<>();

        list.add(1.1);
        list.add(2.2);
        list.add(3.3);

        list.remove(3.3);

        System.out.println(list);

    }
}
