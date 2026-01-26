package quiz;

public class Quiz3 {

	public static void main(String[] args) {
		Slime slime = new Slime(); // 슬라임 생성
		slime.atack = 30; // 부모클래스에서 물려받은 속성
		slime.health = 200; // 부모클래스에서 물려받은 속성
		slime.skill = "마비";
	}

}

// 몬스터
class Monster {
	int atack; // 공격력
	int health; // 체력
}

//슬라임
class Slime extends Monster {
	String skill;
}
