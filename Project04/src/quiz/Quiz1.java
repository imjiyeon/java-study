package quiz;

// if문
public class Quiz1 {

	public static void main(String[] args) {

		// if문
		// 1. 변수를 선언하고 임의의 숫자를 대입하세요
        // 숫자가 0보다 크면 "양수입니다"를 출력하세요
        int x = 5;
        if (x > 0) {
            System.out.println("양수입니다");
        }

        // 2. 나이를 저장할 변수를 선언하고 임의의 숫자를 대입하세요
        // 나이가 8살 이상이면 "학생입니다"를 출력하세요
        int age = 10;
        if (age >= 8) {
            System.out.println("학생입니다");
        }

        // if-else문
        // 3. 점수를 저장할 변수를 선언하고 임의의 숫자를 대입하세요
        // 점수가 60점 이상이면 "합격"을 출력하고
        // 그렇지 않으면 "불합격"을 출력하세요
        int score = 75;
        if (score >= 60) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }

        // 4. 나이를 저장할 변수를 선언하고 임의의 숫자를 대입하세요
        // 나이가 65세 이상이면 "무료 승차", 그렇지 않으면 "유료 승차"를 출력하세요
        age = 70;
        if (age >= 65) {
            System.out.println("무료 승차");
        } else {
            System.out.println("유료 승차");
        }

        // if-elseif-else문
        // 5. 성별을 저장할 변수를 선언하고 성별을 'F' 또는 'M'으로 대입하세요
        // 변수의 값이 F이면 "여성입니다", M이면 "남성입니다"를 출력하세요
        // 모두 아니면 "잘못된 입력입니다"를 출력하세요
        char gender = 'F';
        if (gender == 'F') {
            System.out.println("여성입니다");
        } else if (gender == 'M') {
            System.out.println("남성입니다");
        } else {
            System.out.println("잘못된 입력입니다");
        }

	}

}
