package chapter3.A_Object;

// class 
// 객체를 정의해 놓은 것.
// 객체를 생성하는 기반.
// 객체를 정의하는 틀 또는 설계도.
// 구조체에 메소드가 들어있는것이 class 라고도 함.

// 클래스는 객체의 상태를 나타내는 필드와 객체의 행동을 나타내는 메소드로 구성됨.
// 필드 : 클래스에 포함된 변수 혹은 상수
// 메서드 : 어떠한 특정 작업을 수행하기 위한 명령문의 집합.

// object
// 클래스로 생성된 실체

// 클래스로 생성된 각각의 객체는 독립적으로 존재함
// 같은 클래스로 생성된 객체라 하더라도 각각이 가지고 있는 "속성 값"은 다를 수 있음. (일반적으로 다름.)

// class 클래스명 {속성1, 속성2, 속성3, ....., 기능1, 기능2, .......}
// 속성 : 변수, 특성, 필드, 상태
// 기능 : 메서드, 함수, 행위

// 명명은 UpperCamelCase
class SmartPhone {
	// 기종
	String modelName;
	// 메모리
	int memory;
	// 번호
	String telNumber;
	// 전원
	boolean power;
	
	// 전화걸기
	void call(String toTelNumber) {
		System.out.println(toTelNumber + "로 전화를 겁니다.");
	}
	// 영상시청
	void showVideo() {
		System.out.println("영상을 시청 합니다.");
	}
	// 메세지
	void sendMessage(String message, String toTelNumber) {
		System.out.println(toTelNumber + "로" + message + "를 보냅니다.");
	}
	// 전원 끄고 켜기
	void setPower() {
		power = !power;
	}
}

public class ClassObject {
	public static void main(String[] args) {
		// 인스턴스
		// 특정 클래스로 생성된 객체를 "인스턴스"라고 한다.
		// 클래스로 객체를 생성하는 행위를 인스턴스화 라고 함.
		SmartPhone iPhone14  = new SmartPhone();
		SmartPhone iPhone14Pro  = new SmartPhone();
		
		// 인스턴스 속성 접근 및 기능 사용
		// 속성 접근 : 참조변수.멤버변수;
		// 기능 사용 : 참조변수.메서드(매개변수);
		iPhone14.modelName = "IPHONE";
		iPhone14.memory = 512;
		iPhone14.telNumber = "010-1111-1111";
		iPhone14.power = false;
		
		iPhone14.call("010-2222-2222");
		// 자바에서 null은 위치 메모리 주소를 지정하지 않았다는 의미.
		// SmartPhone galaxy = null => 나는 주소값을 지정하지 않겠다.
		
		iPhone14Pro = iPhone14; // 참조(주소) 바라봄.
		iPhone14Pro.telNumber = "010-9999-9999"; // 이렇게 하면 iPhone14 값도 바뀜.
		
		// 객체 배열
		// 클래스명[] 객체배열명 = new 클래스명[길이];
		SmartPhone[] smartphoneList = new SmartPhone[3];
		
		smartphoneList[0] = iPhone14;
		smartphoneList[1] = iPhone14Pro;
		smartphoneList[2] = new SmartPhone();
		
		for(int index = 0 ; index < smartphoneList.length ; index++) {
			SmartPhone smartphone = new SmartPhone(); // 반복문이 돌아가는 횟수만큼 객체를 새로 만듬. ( 새로운 배열의 주소가 계속 생김 )
			smartphone.telNumber = "010-1111-111" + index;
			smartphoneList[index] = smartphone;
		}
		
		for(SmartPhone phone : smartphoneList)
			System.out.println(phone.telNumber);
		
	}
}
