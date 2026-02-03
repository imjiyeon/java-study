package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* Scanner 클래스를 활용하여
* 회원 관리 프로그램을 구현한다
* */
public class Ex5 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        List<Member> list = new ArrayList<>();

        while (true) {
            System.out.println("=== 메뉴 ===");
            System.out.println("1. 새로운 회원 정보 입력");
            System.out.println("2. 모든 회원 정보 출력");
            System.out.println("0. 종료");
            System.out.print("선택: ");

            int menu = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            if (menu == 1) {

                Member member = new Member();

                System.out.print("이름: ");
                member.name = scanner.nextLine();

                System.out.print("나이: ");
                member.age = scanner.nextInt();
                scanner.nextLine();

                System.out.print("주소: ");
                member.address = scanner.nextLine();

                list.add(member);
                System.out.println("회원 정보가 저장되었습니다.");

            } else if (menu == 2) {
                for(int i=0; i<list.size(); i++){
                    list.get(i).showInfo();
                }
            } else if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        }

    }

}

// 회원
class Member {
    String name;    // 이름
    int age;        // 나이
    String address; // 주소

    void showInfo() {
        System.out.println("이름: " + name + ", 나이: " + age + ", 주소: " + address);
    }
}