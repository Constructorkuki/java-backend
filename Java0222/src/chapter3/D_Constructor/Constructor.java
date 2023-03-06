package chapter3.D_Constructor;

// 생성자
// 인스턴스가 생성될 때 호출되는 인스턴스 초기화 메서드.
// 인스턴스 초기화.
// 생성자의 이름은 해당 클래스명과 같아야함.
// 반환값 없음.
class Circle {
	// 전역 변수.
	double radius;
	double diameter;
	double circumference;
	double area;
	
	// 생성자 사용 방법. ( 인스턴스 초기화 )
	// 생성자 안만들면 컴파일러가 알아서 0 또는 null로 초기화 시켜줌.
	Circle(double radius) {
		System.out.println("Circle이 생성됩니다.");
		this.radius = radius; // 위에 선언한 인스턴스를 따라라 => this. 생성자에서 꼭 this 써주는것이 좋다.
		this.diameter = 2 * radius;
		this.circumference = 3.14 * 2 * radius;
		this.area = 3.14 * radius * radius;
	}
	// 오버로딩
	// 오버로딩은 어지간해서 생성자 만들때 좀 쓰인다.
	Circle() {
		System.out.println("빈 생성자 입니다.");
		this.radius = 10;
		this.diameter = 2 * this.radius;
		this.circumference = 3.14 * 2 * this.circumference;
		this.area = 3.14 * this.radius * this.radius;
	}
	
	// 생성자를 이용한 인스턴스 복사.
	Circle(Circle circle) {
		this.radius = circle.radius;
		this.diameter = circle.diameter;
	}
}

public class Constructor {

	public static void main(String[] args) {
		// new Circle(); 에서 Circle(); 는 생성시 초기화 해주는 메서드.
		// circle1는 0 또는 null 로 초기화 되어있는것.
		System.out.println("생성자아아아=============");
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(5);
		System.out.println("======================");
		
		//circle1.radius = 10;
		//circle1.diameter = 20;
		//circle1.circumference = 62.8;
		//circle1.area = 314;
		
		System.out.println(circle1.area);
		System.out.println(circle2.area);
	}

}
