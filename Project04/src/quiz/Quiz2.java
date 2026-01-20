package quiz;

// while문
public class Quiz2 {

	public static void main(String[] args) {
		
		// 1. 반복문을 사용해 "하이"를 3번 출력하세요
        int i = 1;
        while (i <= 3) {
            System.out.println("하이");
            i = i + 1;
        }

        // 2. 반복문을 사용해 1부터 3까지 출력하세요
        i = 1;
        while (i <= 3) {
            System.out.println(i);
            i = i + 1;
        }

        // 3. 반복문을 사용해 "연습을 1번 완료했습니다"부터
        // "연습을 5번 완료했습니다"까지 출력하세요
        i = 1;
        while (i <= 5) {
            System.out.println("연습을 " + i + "번 완료했습니다");
            i = i + 1;
        }

        // 4. 반복문을 사용해 11부터 20까지 출력하세요
        i = 11;
        while (i <= 20) {
            System.out.println(i);
            i = i + 1;
        }

	}

}
