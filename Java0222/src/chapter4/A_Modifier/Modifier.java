package chapter4.A_Modifier;

// 접근 제어자 : public , protect , default , private
// 기타 제어자 : static , abstract , final

class Example {
	// static 제어자가 있는 선언문은 클래스 단위로 사용 가능.
	
	static int number;
	static void function1() {}
	
	// abstract 제어자
	// 메서드는 선언만 되어있고 구현이 안되어있고, 상속을 하여 구현해서 사용. 클래스에 붙어있으면 추상 메서드가 있다는 의미.
	
	// public , private : 모든 공간에서 사용가능 , 같은 클래스 내에서만 사용 가능.
	
}

public class Modifier {

	public static void main(String[] args) {
		
	}

}
