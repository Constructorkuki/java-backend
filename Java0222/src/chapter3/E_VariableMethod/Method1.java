package chapter3.E_VariableMethod;

// 메서드
// 메서드에 넣을 값과 반환 값만 알면 됨 (Black Box 구조)
// 작업 단위로 여러 개의 메서드에 담아 프로그램을 구조화.

 class HigherMathematics {
	 
	 static final double PIE = 3.14;
	 // 인스턴스 변수는 힙 영역에 저장.
	 static double getTriangleSize(double underside, double height) {
		 // 매개변수 검증
		// 모든 것들은 입력(파라미터)을 받으면 입력에 대한 검증을 해야한다.
		 // 파라미터로 참조변수를 받는다면 메모리 주소가 복사되어 넘어온다. 데이터를 바꾸면 실제 메모리 주소의 데이터도 바뀐다.
		 if(underside <= 0 || height <= 0) {
			 System.out.println("밑변과 높이는 양수이어야 합니다.");
			 return 0; // 리턴으로 함수 종료. 함수 타입이 double이 있어서 return0.
		 }
		 
		 double triangleSize = 0.5 * underside * height;
		 return triangleSize;
	 }
	 
	 static double getCircleSize(double radius) {
		 if(radius <= 0) {
			 System.out.println("반지름은 양수이어야 합니다.");
			 return 0;
		 }
		 
		 double circleSize = PIE * radius * radius;
		 return circleSize;
	 }
	 
	 static double getCircumference(double radius) {
		 if(radius <= 0) {
			 System.out.println("반지름은 양수이어야 합니다.");
			 return 0;
		 }
		 
		 double circumference = PIE * 2 * radius;
		 return circumference;
	 }
 }

public class Method1 {

	// 메서드 선언부
	// return로 결과 반환. void면 return으로 메서드 종료.
	public static void main(String[] args) {
		//HigherMathematics math = new HigherMathematics();
		double size = HigherMathematics.getTriangleSize(10, 10);
		System.out.println(size);
		double circleSize = HigherMathematics.getCircleSize(5);
		System.out.println(circleSize);
	}
	
	// 클래스 , 힙 , 스택 영역 중 일반 메서드의 데이터는 스택영역에 저장되고 함수가 종료되면 데이터가 사라짐.
	// GalaxyPhone myS23 = new GalaxyPhone(); 와 같이 인스턴스화 시켜놓으면 스택에도 생기지만 힙 영역에 새로운 공간이 할당되어 함수가 종료되더라도 삭제되지 않는다.

}
