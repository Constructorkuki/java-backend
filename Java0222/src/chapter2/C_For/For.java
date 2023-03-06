package chapter2.C_For;

public class For {

	public static void main(String[] args) {
		// 반복 횟수 상관없이 조건만 보는 경우 while 문.
		// 횟수 정해서 돌릴떄 for 문.
		
		// 길이가 5인 int 타입의 배열을 선언 및 생성
		int[] intArray5 = new int[5]; // 선언
		
		for(int index = 0 ; index < intArray5.length ; index++) {
			intArray5[index] = index + 1;
			System.out.println(intArray5[index]);
		}
		
		// 범위 내 배열 값 순서대로 읽어주는 포이치문.
		// 요소를 하나씩 복사해서 사용.
		// 배열의 요소값을 직접 읽고자 할 때 사용. 읽기전용. 값이 바뀌지 않음. => 이 내용 아닐 수도 있으니까 조사하고 확인할것.
		for (int number : intArray5) {
			System.out.println(number);
		}
		
		int number = 0;
		while (true) {
			// continue 만나면 아래 코드 빼고 다시 올라감.
			// continue문은 일반적으로 조건문과 함께 사용.
			// 주의 할 점으로 조건문의 코드블럭 내에 해당 변수를 변경시켜주는 코드가 존재햐야함.
			if( (number % 2) == 0) {
				number++;
				continue;
			}
			// continue을 만나면 코드 블럭내에서 아래에 오는 모든 코드를 무시하고 다시 조건을 검사.
			System.out.println(number);
			// while 문에서는 조건에 사용되는 변슈가
			// 필수로 실행 코드 내에서 변경이 이루어 져야한다.
			// 특수한 상황이 왔을 때 ~~.
			// 조건에 true 쓰면 계속 돌아감.
			number++;
			
			// 일반적으로 break문은 조건문과 함께 사용.
			if(number == 200) break; // 반복문의 코드 블럭을 강제 종료.
		}
		
		// while 이나 do while은 잘 사용 안함...
	}

}
