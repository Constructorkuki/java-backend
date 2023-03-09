package chapter4.B_Ploymorphism;

// 다형성
// 조상 클래스의 참조변수가 자손 클래스의 인스턴스를 참조할 수 있도록 하는 것.
// 참조변수 형변환.
// 참조변수는 주소를 바라보기 떄문에 형변환 해도 인스턴스에 영향은 안가고 인스턴스의 사용 범위를 조절하는 것 뿐.
// 리스트 , 해쉬? 를 사용하기 위해 다형성 쑴.
class SuperClass {
	int number1;
	int number2;
	
	void method1() {}
	void method2() {}
}

class SubClass1 extends SuperClass {
	int number3;
	
	void method3() {}
}

class SubClass2 extends SuperClass {
	int number4;
	
	void method4() {}
}

public class Ploymorphism {

	public static void main(String[] args) {
		SuperClass superClass = new SuperClass();
		SubClass1 subClass1 = new SubClass1();
		SubClass2 subClass2 = new SubClass2();
		
		// 자손타입 -> 조상타입 : 자동 형변환 가능 ( Up casting )
		SuperClass super1 = subClass1;
		System.out.println(super1);
		System.out.println(subClass1.number3);
		System.out.println(super1.number1); // number1 , number2 만 사용 가능.
		
		SubClass1 sub1 = (SubClass1) super1; // number1 , number2 , number3 사용 가능.
		System.out.println(sub1.number3);
		
		// 조상타입 -> 자손타입 : 자동 형변환 불가능 (Down casting)
		//SubClass1 sub1 = superClass; X
		//SubClass1 sub1 = (SubClass1)superClass;
		//SubClass2 sub2 = (SubClass2)superClass;
	}
	 // 응집도와 결합도 모듈 같은거에 대해서 면접때 물어봄.
}
