package chapter3.F_Inheritance;

class Human {
	String name;
	int age;
	String telNumber;
	String country;
	
	Human(String name , int age) {
		this.name = name;
		this.age = age;
		this.telNumber = "010-1111-2222";
		this.country = "Korea";
	}
	
	void eat(String food) {
		System.out.println(this.name + " 가 " + food + " 를 먹어요");
	}
}


class Developer extends Human {
	String position;
	String language;
		
	Developer(String name , int age , String position , String language) {
		// super : 부모 클래스의 생성자를 지칭.
		super(name , age);
		this.position = position;
		this.language = language;
	}
	
	void develope() {
		System.out.println(super.name + "가" + this.language + "로 " + this.position);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Developer developer1 = new Developer("길동", 10 , "java", "Back end");
		//developer1.name = "jeoung";
		//developer1.position = "Back end";
		//developer1.language = "java";
		
		developer1.eat("사과");
		developer1.develope();
		
		Developer developer2 = new Developer("Michle" , 29 , "HTML" , "Front end");
		developer2.eat("바나나");
		developer2.develope();
	}

}
