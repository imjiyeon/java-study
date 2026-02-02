package main;

/*
 * 제네릭 클래스 만들기
 * */
public class Ex3 {

	public static void main(String[] args) {
		
		//파우더를 사용하는 프린터기 생성
		Printer<Powder> printer1 = new Printer<>();
		printer1.setMaterial(new Powder());
		// 제네릭을 사용하면 형변환 없이 재료를 꺼낼 수 있음
		Powder powder = printer1.getMaterial(); //형변환 필요 없음
		powder.doPrinting();

		//플라스틱을 사용하는 프린터기 생성
		Printer<Plastic> printer2 = new Printer<>();
		printer2.setMaterial(new Plastic());
		Plastic plastic = printer2.getMaterial();
		plastic.doPrinting();
	}

}

//제네릭 클래스 만들기
class Printer<T> { //다이아몬드 연산자안에 문자T 작성
	
	private T material; //Object대신 문자T 작성

	public void setMaterial(T material) { //매개변수 변경
		this.material = material;
	}
	
	public T getMaterial() { //리턴타입 변경
		return material;
	}
	
}

