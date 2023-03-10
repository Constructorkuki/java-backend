package chapter6.B_Generic;

// 제너릭 <E>, <T>, <D> 주로 사용됨.
// 다양한 타입을 다루는 메서드나 클래스에 컴파일 시 타입을 체크하는 기능
// 컴파일 시 타입을 체크하기 때문에 유연하게 개발을 할 수 있음.

class GenericClass<D> {
	boolean status;
	String message;
	D data; // Object 타입 Object data;
	
	// 제너릭 메서드
	static <D> GenericClass<D> getInstance(boolean status, String message, D data) { // static 경우 <D>가 사용된가는것을 선언
		GenericClass<D> instance = new GenericClass<>();
		instance.status = status;
		instance.message = message;
		instance.data = data;
		
		return instance;
	}
}

public class Generic {

	public static void main(String[] args) {
		GenericClass<Integer> gengeric1 = new GenericClass<>(); // gengeric1의 datas의 자료형은 int로 지정
		GenericClass<String> gengeric2 = new GenericClass<>(); // gengeric2의 datas의 자료형은 String으로 지정
		
		//gengeric1.data = "String"; X
		gengeric2.data = "String";
		
		GenericClass<?> gengeric3 = GenericClass.getInstance(true, "message", "String");
	}

}
