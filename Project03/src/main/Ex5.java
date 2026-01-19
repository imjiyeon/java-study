 package main;

 /*
  * 논리연산자와 논리부정연산자
  * */
public class Ex5 {

	public static void main(String[] args) {

        // 놀이기구 탑승 조건
        // 10살 이상이고 키가 140cm 이상이면 탑승 가능
        int age = 12;        // 나이
        int height = 140;    // 키
        // && : 두 조건 모두 만족하면 true
        System.out.println(age >= 10 && height >= 140); 

        // 영화 관람 조건
        // 15살 이상이거나 보호자를 동반했으면 관람 가능
        age = 12;                    // 나이
        boolean withParent = true; // 보호자 동반 여부
        // || : 두 조건 중 하나라도 만족하면 true
        System.out.println(age >= 15 || withParent);

        // 좌석이 비어있으면 예약 가능
        // isOccupied: true(자리에 사람이 있음)
        // isOccupied: false(자리에 아무도 없음)
        boolean isOccupied = false;
        // !  : 결과를 반대로
        System.out.println(!isOccupied); // 반대로 변경

	}
}
