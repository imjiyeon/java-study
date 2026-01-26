package quiz;

public class MethodQuiz {

    public static void main(String[] args) {
        // 오늘의 날씨 출력
        weather("맑음");

        // 사용자 환영 인사
        welcome("또치");

        // 두 수의 뺄셈
        sub(20, 10);

        // 두 수를 곱한 값 반환
        int result = multiply(4, 6);
        System.out.println(result);
    }

    // 1. 아래와 같이 오늘의 날씨를 입력받아 출력하는 함수를 작성하고 호출하세요
    // 입력값 예시: "맑음"
    // 출력 예시: "오늘 날씨는 맑음입니다."
    public static void weather(String w) {
        System.out.println("오늘 날씨는 " + w + "입니다.");
    }

    // 2. 아래와 같이 사용자의 이름을 입력받아 환영 인사를 출력하는 함수를 작성하고 호출하세요
    // 입력값 예시: "또치"
    // 출력 예시: "또치님, 환영합니다!"
    public static void welcome(String name) {
        System.out.println(name + "님, 환영합니다!");
    }

    // 3. 아래와 같이 두 개의 숫자를 입력받아 곱한 값을 반환하는 함수를 작성하고 반환값을 출력하세요
    // 입력값 예시: 4, 6
    // 반환값 예시: 24
    public static int multiply(int a, int b) {
        return a * b;
    }

    // 4. 두 개의 숫자를 입력받아,
    // 첫 번째 수에서 두 번째 수를 뺀 결과를 출력하는 함수를 작성하고 호출하세요
    // 단, 첫 번째 수가 두 번째 수보다 작으면 "계산할 수 없습니다"를 출력합니다
    // 1) 입력값 예시: 20, 10
    // 출력 예시: "20 - 10 = 10"
    // 2) 입력값 예시: 10, 20
    // 출력 예시: "계산할 수 없습니다"
//    public static void sub(int n1, int n2) {
//        if (n1 < n2) {
//            System.out.println("계산할 수 없습니다");
//        } else {
//            int result = n1 - n2;
//            System.out.println(n1 + " - " + n2 + " = " + result);
//        }
//    }

}
