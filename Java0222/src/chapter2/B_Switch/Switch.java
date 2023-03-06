package chapter2.B_Switch;
import java.util.*;
public class Switch {

	public static void main(String[] args) {
		/*
		 * switch(비교할 대상) { 
		 * case 비교할 값1: 
		 * 비교할 값1 과 비교할 대상이 같을 경우 실행할 코드 
		 * case 비교할 값2: 
		 * 비교할 값2 와 비교할 대상이 같을 경우 실행할 코드 break구문으로 switch를 해당 위치에서 종료. 
		 * break; 
		 * default: 비교할 대상과 일치여부를 따지지 않고 실행할 코드 
		 * }
		 */
		Scanner sc = new Scanner(System.in);
		int scanner = sc.nextInt();
		
		switch(scanner) {
		case 1:
			System.out.println("기본 문법 공부");
		case 2:
			System.out.println("제어문 공부");
		case 3:
			System.out.println("연산자 공부");
			break;
		case 4:
			System.out.println("객체지향 응용 공부");
		case 5:
			System.out.println("자바 고급 공부");
		default :
			System.out.println("범위 초과");
		}
	}

}
