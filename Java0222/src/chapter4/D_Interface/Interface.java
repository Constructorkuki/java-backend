package chapter4.D_Interface;

// 인터페이스
// 추상클래스보다 추상화 정도가 높다.

// 사용방법
// interface 인터페이스명 {  }
// 인터페이스는 무조건 메서드를 추상 메서드로 받는다.
interface ExampleInterface {
	public static final int NUMBER = 10;
	
	// 메서드를 사용 할 떄는 public abstract 로 선언 함.
	public abstract void method1();
	public void method2();
	abstract void method3();
}

// 인터페이스 끼리 상속. 콤마( , )써서 인터페이스 상속은 다중 상속이 됨.
interface SubExampleInterface extends ExampleInterface {
	
}

// 인터페이스 구현
// 인터페이스도 추상 메서드를 포함하고 있기 때문에 해당 메서드를 구현하는 클래스를 통해서 인스턴스를 만들어 줘야함.
// 인터페이스를 클래스로 구현 할 떄는 implements 키워드 사용.
class Implement implements ExampleInterface {

	@Override
	public void method() {
		System.out.println("메서드 1");
	}
	
}

public class Interface {

	public static void main(String[] args) {
		// 인터페이스 자체로 인스턴스를 생성 할 수 없음.
		ExampleInterface exampleInterface = new Implement();
	}

}
