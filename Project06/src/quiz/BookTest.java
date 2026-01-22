package quiz;

//  Book 클래스를 사용하여 다음 정보를 가지는 두 개의 인스턴스를 생성하세요.
//  (자바프로그래밍, 20000, 한빛컴퍼니, 300)
//  (스프링, 15000, 한빛컴퍼니, 500)
//  그리고 showInfo함수를 사용해 책의 정보를 출력하세요.
public class BookTest {

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.title = "자바프로그래밍";
        book1.price = 20000;
        book1.company = "한빛컴퍼니";
        book1.page = 300;

        Book book2 = new Book();
        book2.title = "스프링";
        book2.price = 15000;
        book2.company = "한빛컴퍼니";
        book2.page = 500;

        // 책 정보 출력
        book1.showInfo();
        book2.showInfo();
    }

}
