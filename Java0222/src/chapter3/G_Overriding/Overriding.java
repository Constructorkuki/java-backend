package chapter3.G_Overriding;


// 오버라이딩
// 조상 클래스로부터 상속받은 메서드의 내용을 변경.
// 상속받은 메서드를 자손 클래스에 맞게 변형.

class Human {
	// 공통된 인스턴스를 클래스 변수로 static함.
	static String name;
	
	Human(String name) {
		Human.name = name;
	}
	
	void eat(String food) {
		System.out.println(Human.name + "가 " + food + " 를 먹어요.");
	}
}

class Develpoer extends Human {
	// 생성자 상속
	Develpoer(String name) {
		super(name);
	}
	// Override => 상속 받은 메서드 변경.
	void eat(String food) {
		System.out.println(super.name + "가 " + food + " 를 반만 먹어요.");
	}
	// Overload => 새로운 메서드 생성.
	void eat() {
		System.out.println(super.name + "가 식사를 합니다.");
	}
}

public class Overriding {
	
	public static void main(String[] args) {
		Develpoer developer = new Develpoer("Jeoung Bin");
		//developer.name = "Jeoung Bin";
		
		developer.eat("사과");
		developer.eat();
		
		Human human = new Human("Michle");
		//human.name = "Michle";
		
		human.eat("바나나");
	}

}
