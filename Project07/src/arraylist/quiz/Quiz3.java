package arraylist.quiz;

import java.util.ArrayList;


//  문자열형(String) 리스트를 생성하세요.
//  문자열 5개를 추가하세요 ("AA","BB","CC","DD","EE")
//  리스트에 저장된 모든 문자열을 삭제하세요.

public class Quiz3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");

		//잘못된 경우
		//list.remove(0);
		//list.remove(1);
		//list.remove(2);
		//list.remove(3);
		//list.remove(4);

		//뒤부터 삭제
		list.remove(4);
		list.remove(3);
		list.remove(2);
		list.remove(1);
		list.remove(0);

		//앞부터 삭제
		//중간에 있던 요소가 삭제하면 배열은 연속된 구조이기 때문에 뒤에 있던 요소가 앞으로 한칸 이동한다
		//list.remove(0);
		//list.remove(0);
		//list.remove(0);
		//list.remove(0);
		//list.remove(0);

		System.out.println(list);

	}
}
