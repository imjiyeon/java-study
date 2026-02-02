package main;

/*
 * 여러가지 재료를 사용하는 3D 프린터 클래스 만들기
 * */
public class Ex2 {

	public static void main(String[] args) {

		// 파우더를 사용하는 프린터 만들기
		ThreeDPrinter printer = new ThreeDPrinter();
		Powder powder = new Powder();
		printer.setMaterial(powder); //매개변수가 자동으로 형변환됨
		Powder powder2 = (Powder)printer.getMaterial(); //재료를 꺼낼때는 직접 형변환을 해야함
		powder2.doPrinting();

		// 플라스틱을 사용하는 프린터 만들기
		ThreeDPrinter printer2 = new ThreeDPrinter();
		Plastic plastic = new Plastic();
		printer2.setMaterial(plastic); //매개변수가 자동으로 형변환됨
		Plastic plastic2 = (Plastic)printer2.getMaterial(); //재료를 꺼낼때는 직접 형변환을 해야함
		plastic2.doPrinting();

	}

}

// 재료로 사용할 파우더 클래스
class Powder {
	void doPrinting() {
		System.out.println("Powder를 사용해 모형을 만듭니다");
	}
}

// 재료로 사용할 플라스틱 클래스
class Plastic {
	void doPrinting() {
		System.out.println("main.Plastic 사용해 모형을 만듭니다");
	}
}

// 파우더와 플라스틱을 재료로 사용하는 프린터
class ThreeDPrinter {

	Object material; //자료형을 Object로 선언하면 파우더와 플라스틱을 모두 저장할 수 있음

	void setMaterial(Object material) { //Object형 매개변수
		this.material = material;
	}

	Object getMaterial() { //Object형 리턴타입
		return material;
	}

}

