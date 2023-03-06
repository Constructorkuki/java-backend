package chapter3.C_Overloading;

// 오버로딩
// 메서드의 이름이 같지만 매개변수의 갯수나 타입이 다르면 정의 가능.
// 반환 타입은 오버로딩에 영향을 미치지 않는다.
public class Overloading {
	
	int add(int x, int y) {
		return x + y;
	}
	
	double add(int x, int y, int d) {
		return x + y + d;
	}

	public static void main(String[] args) {
		add.adding();
	}
}

class add {
	
	static void adding() {
		Overloading over = new Overloading();
		System.out.println(over.add(1, 2));
	}
}
// static을 사용하면 힙 영역에 데이터가 새로운 공간에 저장된다.
// 일반 메서드 및 변수는 스택영역에 데이터 저장. 그렇다면 데이터의 보존방식에 차이가 있는것인가.