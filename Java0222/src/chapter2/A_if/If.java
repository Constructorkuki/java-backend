package chapter2.A_if;

public class If {

	public static void main(String[] args) {
		int age = 10;
		// 중괄호 있는 버전.
		if(age > 19) {
			System.out.println("성인입니다.");
		} else if (age < 8) {
			System.out.println("미취학 아동 입니다.");
		} else {
			System.out.println("청소년 입니다.");
		}
		// 중괄호 없는 버전.
		if(age > 19) System.out.println("성인입니다.");
		else if (age < 8) System.out.println("미취학 아동 입니다.");
		else System.out.println("청소년 입니다.");
		
		// 강사는 어지간해서 else 안씀 if문에서 끝냄.
		// if 안에 if 쓰는거 매우 비추천. 어쩔 수 없이 사용할땐 사용. else if 도 마찬가지.
		// 프로그램 로직의 흐름을 따라가야하기 때문에 비정상적인 결과를 내선 안된다.
		
		boolean nomal = true;
		
		// 비추천
		if (nomal) {
			boolean nomal2 = true;
			if(nomal) {
				System.out.println("비정상2");
			}
		} else {
			System.out.println("비정상1");
		}
		
		// 추천
		if(!nomal) System.out.println("비정상1");
		boolean nomal2 = true;
		if(!nomal2) System.out.println("비정상2");
		
		System.out.println("정상 결과");;
		
	}
}
