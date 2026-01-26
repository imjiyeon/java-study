package quiz;

public class Quiz2 {

	public static void main(String[] args) {
		Balpen balpen = new Balpen(); // 볼펜 생성
		balpen.brand = "모나미"; // 부모클래스에서 물려받은 속성
		balpen.amount = 80; // 부모클래스에서 물려받은 속성
		balpen.color = "blue";
	}

}

// 펜
class Pen {
	String brand; // 제조사
	int amount; // 남은 양
}

// 볼펜
class Balpen extends Pen { // 상속
	String color; // 볼펜의 색
}