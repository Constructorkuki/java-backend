package example.SignUp;
import java.util.*;

class SignUpDto { // Data Transform Object
	String userId;
	String userPassword;
	String userPasswordCheck;
	String userName;
}

// 회원가입 프로세스 구현
public class SignUp {

	public static void main(String[] args) {
		String[] idList = {"qwer", "asdf", "zxcv"}; // " "은 문자열(배열)이기 때문에 문자배열들이 3번 들어갔으니 이 배열은 다차원 배열이 된다.
		
		// 1. 정보 입력. --------------------------------------------------------------------------------------------------------------------------------
		Scanner scanner = new Scanner(System.in);
		SignUpDto dto = new SignUpDto();
		
		System.out.println("아이디: ");
		dto.userId = scanner.nextLine();
		System.out.println("패스워드: ");
		dto.userPassword = scanner.nextLine();
		System.out.println("패스워드 확인: ");
		dto.userPasswordCheck = scanner.nextLine();
		System.out.println("이름: ");
		dto.userName = scanner.nextLine();
		
		// 2. 모두 입력 받았는지 검증. -----------------------------------------------------------------------------------------------------------------
		// string.isBlank() : 문자열이 비었거나 띄어쓰기만 구성됐을 때 true 아니면 false
		if (dto.userId.isBlank() || dto.userPassword.isBlank() || dto.userPasswordCheck.isBlank() || dto.userName.isBlank()) {
			System.out.println("모두 입력해 주세요.");
			return;
		}
		
		//3. 아이디 중복 체크 -------------------------------------------------------------------------------------------------------------------------------
		// 1) 일반 for문 사용
		for (int index = 0 ; index < idList.length ; index++) {
			if (dto.userId.equals(idList[index])) {
				System.out.println("중복된 아이디 입니다.");
				return;
			}
		}
		
		// 3-2) foreach문 사용
		/*
		 * for(String id: idList) { if (userId.equals(id)) {
		 * System.out.println("중복된 아이디 입니다."); return; } }
		 */
		// for과 foreach 차이.
		// 위 처럼 아이디 비번을 읽어들여 검증만을 하려고하면 코드상 깔끔한 foreach가 더 좋고
		// 값을 바꾸면서 사용하기 위해서는 for을 써야한다. foreach는 읽기전용이며 값을 바꿀 수 없기 때문이다.
		
		// 4. 비밀번호 확인 -------------------------------------------------------------------------------------------------------------------------------
		if (!dto.userPassword.equals(dto.userPasswordCheck)) {
			System.out.println("비밀번호가 서로 다름.");
			return;
		}
		
		System.out.println("성공");
	}
	// 결과
	// 성공, 실패 ( 모두 입력하지 않았을 때, 아이디가 중복 될 때 , 비밀번호가 서로 다를때 )
	// 개발자 직군 : 퍼블리셔 , 프론트엔드 , 백엔드 , 아키텍처
}
