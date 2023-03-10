package chapter5.B_ApiClass;

// API Class
// Java 자체에서 제공해주는 개발에 도움을 주는 각종 라이브러리

public class ApiClass {

	public static void main(String[] args) {
		// Object Class
		// 모든 Class의 조상 Class
		//Object object = new Scanner(System.in);
		//object = new int[10];
		
		// String Class
		// 문자열 처리에 대한 메서드가 정의되어 있는 클래스
		String string = " This is string contents ";
		
		// .subString(시작인덱스, 종료인덱스);
		String subString = string.substring(6, 8);
		System.out.println(subString);
		
		// .toUpperCase(); - 모든 문자를 대문자로.
		// .toLowerCase(); - 모든 문자를 소문자로.
		String upeerCase = string.toUpperCase();
		String lowerCase = string.toLowerCase();
		
		// .indexOf (문자열);
		// 해당하는 문자열이 존재하면 그 위치의 첫번째 인덱스 번호를 반환.
		// 문자열이 존재 안하면 -1 반환.
		int stringIndex = string.indexOf("is");
		System.out.println(stringIndex);
		
		// .replaceAll : 문자 바꾸기
		// .trim() : 문자 앞뒤 공백 제거
	}

}
