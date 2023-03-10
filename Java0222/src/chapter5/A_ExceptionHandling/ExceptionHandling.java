package chapter5.A_ExceptionHandling;

import java.util.Scanner;

// 예외
// 오류중 개발자가 예측해서 제어할 수 있는 오류.
// 컴파일 및 로직상의 문제는 없지만 
// 사용자의 입력 혹은 타 프로그램의 결과에서 예상치 못한 값을 받아 처리할 때 발생

// 시스템 에러 : 개발자가 코드상으로 조취를 취할 수 없는 문제 (전원 부족, 메모리 부족)
// 컴파일 에러 : 컴파일이 불가능한 상태 (오타, 참조 타입 불일치)
// 런타임 에러 : 프로그램이 실행 도중 발생하는 문제 (빌드 실패, 포트 중복, 데이터베이스 연결 실패...)
// 로직 에러 : 프로그램의 아웃풋이 예상과 다르게 나오는 문제
// 예외 : 정상적인 입력에서는 정상 처리가 되지만 비정상적인 입력에서는 처리가 되지 않는 문제 (null 값 참조, 로직 실행중 데이터베이스 연결 실패)

public class ExceptionHandling {
	
	// throws 예외 클래스 : 해당 예외를 호출부로 책임을 전가.
	// throws가 선언부에 추가된 메서드를 호출하는 곳에서 예외처리에 대한 강제성이 부여.
	private static void bringException() throws Exception {
		 Exception exception = new Exception("예외 던지기 발생!");
		 throw exception;
	 }

	public static void main(String[] args) {
		
		// 예외 상황
		// NullPointerException 이 뜸.
		//Scanner scanner = null;
		//scanner.nextLine();
		
		//int[] numbers = {1, 2, 3};
		//System.out.println(numbers[4]);
		
		// 예외 처리
		// 예외를 예상해서 처리
		// try - catch
		// try 구문에 예외가 발생할 수 있는 문장 작성
		// catch 구문에 해당 예외 상황에 대한 대처 구문을 작성
		
		Scanner scanner = null;
		
		try {
			int number = scanner.nextInt();
		} catch (Exception exception) {
			System.out.println("Null Pointer Exception 발생"); // 콘솔에 빨간줄로 안뜨고 처리가 됨. 서버가 안꺼지고 지속되도록 하는데 있어서 중요. (서버 지속성).
															// 외부에 접근하는 경우 대부분 try - catch문 사용. (데이터 베이스...).
		}
		
		// 예외의 형태 바꾸기. 만들 인스턴스 생성하고 throw로 던지기.
		try {
			// Exception class로 예외 생성.
			// throw로 예외를 발생.
			Exception exception = new Exception("고의 예외!");
			throw exception;
			
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		
		try {
			bringException();
		} catch (Exception exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}
		
	}

}
