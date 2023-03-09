package chapter4.C_AbstractClass;

// 추상 클래스
// 추상 클래스로 인스턴스를 생성할 수 없다.

abstract class Abstract {
	int number1;
	
	// 추상 메서드
	// 선언부만 작성이 되어있음. 구현부는 작성 안되어있음.
	// 해당 클래스를 상속받은 자손 클래스에서 구현을 필수로 요구.
	abstract void method1();
}

class SubClass extends Abstract {
	void method1() {
		System.out.println("구현!");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// Abstract abstract1 = new Abstract(); 인스턴스화 X
		Abstract abstract1 = new SubClass(); // 상속 관계라서 이런거 가능.
		abstract1.method1();
	}

}
