package quiz;

// Person 클래스를 사용하여 다음 정보를 가지는 인스턴스를 생성하세요.
// 김민수(40세, 171.5cm, 기혼)
public class PersonTest {

    public static void main(String[] args) {

        Person person = new Person();
        person.name = "김민수";
        person.age = 40;
        person.height = 171.5;
        person.isMarried = true;

    }

}
