package chapter3.E_VariableMethod;

// 클래스의 변수
// 인스턴스 변수 : 각각 인스턴스마다 고유하게 가지고 있는 속성.
// 클래스 변수 : 해당 클래스로 만들어진 모든 인스턴스가 동일하게 가지는 속성.
// 지역변수 : 메서드 내에서 선언된 변수.
// 전역변수 : 인스턴스 , 클래스 변수.

class GalaxyPhone {
	// 인스턴스 변수 : 고유하게 가지는 속성.
	String model;
	String owner;
	String telNumber;
	// 클래스 변수
	static String maker = "SAMSUNG"; // static은 선언한 클래스 내에서 초기화 해주는 것이 가장 좋다.
	
	// 인스턴스 변수는 인스턴스 생성 후 사용. 클래스는 그냥 바로 사용.
}

class MonitorSize {
	// 상수값 가져올 때 static 가장 많이 씀.
	static final int HEIGHT = 1080;
	static final int WIDTH = 1920;
}

public class VariableMethod {
	// 클래스의 전역변수(인스턴스 변수).
	int number = 10;
	int size = MonitorSize.HEIGHT * MonitorSize.WIDTH;
	
	public static void main(String[] args) {
		// main 메서드의 지역변수.
		double decimal = 10.0;
		
		GalaxyPhone myS23 = new GalaxyPhone();
		myS23.model = "S23";
		myS23.owner = "홍길동";
		myS23.telNumber = "010-1111-1111";
		
		GalaxyPhone myS22 = new GalaxyPhone();
		myS22.model = "S22";
		myS22.owner = "김돌쇠";
		myS22.telNumber = "010-2222-2222";
		
		System.out.println(myS23.telNumber); // System 이라는 클래스의 static 변수인 out을 쓰는것. out 보면 기울어져 있다.
		System.out.println(myS22.telNumber); // println도 메서드임 뒤에 괄호 있잖음.
		
		//myS23.maker = "SAMSUNG";
		
		System.out.println(myS23.maker); // 이건 이상한 예시.
		System.out.println(myS22.maker);
		System.out.println(GalaxyPhone.maker); // static 변수는 일반적으로 클래스 이름으로 접근.
	}

}
