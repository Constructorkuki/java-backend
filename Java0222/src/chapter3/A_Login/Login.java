package chapter3.A_Login;
import java.util.*;
public class Login {

	public static void main(String[] args) {
		final String ID = "qwer1234";
		final String PASSWORD = "qwer1234";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디 및 비번 입력.");
		String userId = scanner.nextLine();
		String userPassword = scanner.nextLine();
		
		// isEmpty : 값이 비었으면 true , 아니면 false.
		if(userId.isEmpty() || userPassword.isEmpty()) {
			System.out.println("모두 입력하세요");
			 return; // 끝나면 프로세스? 스레드? 가 끝나야댐. 알고리즘? 적으로. 아마  프로세스인거같음.
		}
		
		// 사용자 입력값과 저장된 값이 같은지 검증.
		// strung.equals 같으면 true , 아니면 false.
		if(!userId.equals(ID) || !userPassword.equals(PASSWORD)) {
			System.out.println("로그인 정보가 일치하지 않습니다."); // 조건문에 비정상이 들어가야 하기 때문에 "성공"인 정상 프로세스는 밖으로 보내고 비정상인 "로그인 정보 일치 하지 않는다"는 경우를 if문으로 짜주었다.
			return; // 그리고 비정상이 실행 되면 return으로 종료 시켜주면서 조건문 밖으로 나가도록 함.
		}
		System.out.println("성공");
	}
	
	// 1. 암호화 처리 및 로그인 성공 시 토큰작업 , 인증작업 추가.
	// 2. 아이디 및 비번같은 개인정보 DB에서 가져오는 작업 추가.
	// 위 코드에서 1 ,2 까지 추가하면 실제 로그인 API와 다를바 없다고 하심.

}
