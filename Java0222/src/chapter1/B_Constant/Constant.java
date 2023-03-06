package chapter1.B_Constant;

public class Constant {

	public static void main(String[] args) {
		// 상수는 데이터를 변경하면 안될 경우에 사용.
		// 상수는 대문자로 선언. UPPER_SNAKE_CASE 명명 규칙. 띄어쓰기는 _ 사용.
		final int WINDOW_WIDTH = 1920;  // 고정되어있어야 하는 값.
		final int WINDOW_HEIGTH = 1080;
		int size = WINDOW_WIDTH * WINDOW_HEIGTH;
		// 데이터에 이름을 부여하고 싶을 경우에 사용.
		
		// 리터럴 상수와 상수가 존재. 
		// 리터럴 상수는 데이터 그 자체를 의미.
		// WINDOW_WIDTH = 1920; 의 경우 1920이 리터럴 상수.
	}

}
