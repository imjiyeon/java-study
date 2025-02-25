package downcasting;

import java.util.ArrayList;

//리스트를 하나 생성하세요
//리스트에 사람, 호랑이, 독수리를 하나씩 추가하세요
//
//반복문으로 리스트에 저장된 요소를 하나씩 꺼내서
//사람이라면 readBook() 메소드 호출하세요
//호랑이라면 hunting() 메소드 호출하세요
//독수리라면 flying() 메소드 호출하세요

public class Quiz1 {

	public static void main(String[] args) {

		// Animal 타입의 리스트를 생성하면, 사람 호랑이 독수리 저장 가능
		ArrayList<Animal> list = new ArrayList<Animal>();

		list.add(new Human()); // 리스트에 사람 추가
		list.add(new Tiger()); // 리스트에 호랑이 추가
		list.add(new Eagle()); // 리스트에 독수리 추가

		// for문으로 리스트의 요소를 하나씩 꺼냄
		for (int i = 0; i < list.size(); i++) {

			Animal ani = list.get(i); //요소를 꺼내서 Animal형 변수에 저장

			if (ani instanceof Human) { // 인스턴스의 타입이 Human형이면
				Human h = (Human) ani; // Human형으로 다운캐스팅
				h.readBook();
			} else if (ani instanceof Tiger) { // 인스턴스의 타입이 Tiger형이면
				Tiger t = (Tiger) ani; // Tiger형으로 다운캐스팅
				t.hunting();
			} else if (ani instanceof Eagle) { // 인스턴스의 타입이 Eagle형이면
				Eagle e = (Eagle) ani; // Eagle형으로 다운캐스팅
				e.flying();
			}
		}
	}

}
