package example.exchange;
import java.util.Scanner;
// 환전기 어플리케이션
// Input : 금액, 넣을 화폐, 바꿀 화폐
// Output : 금액, 바뀐 화폐
// 원화, 엔, 달러 사용할것.
// 자바 유틸이란??
public class ExchangeApplication {
	
	private static String[] managedCurrencies = {
			"KRW", "USD", "JPY"
	};
	
	private static ExchangeRate[] exchangeRates = {
			// 환율을 지금 DB가 없어서 우선 지정해서 연산.
			// 원화 => 달러
			new ExchangeRate("KRW", "USD", 1000 / 1318.80),
			// 원화 => 엔
			new ExchangeRate("KRW", "USD", 1000 / 0.96035),
			// 달러 => 원화
			new ExchangeRate("USD", "KRW", 1318.80 / 1000),
			// 달러 => 엔
			new ExchangeRate("USD", "JPY", 1318.80 / 0.96035),
			// 엔 => 원화
			new ExchangeRate("JPY", "KRW", 0.96035 / 1000),
			// 엔 => 원화
			new ExchangeRate("JPY", "KRW", 0.96035 / 1000),
			// 엔 => 달러
			new ExchangeRate("JPY", "USD", 0.96035 / 1318.80)
	};

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.println("넣을 화폐 : ");
		String exchagingCurrency = scanner.nextLine();
		System.out.println("바꿀 화폐 : ");
		String exchagedCurrency = scanner.nextLine();
		System.out.println("금액 : ");
		int amount = scanner.nextInt();
		
		// 입력 검증
		// 모두 입력이 되었는가
		if (exchagingCurrency.isBlank() || exchagedCurrency.isBlank()) {
			System.out.println("모두 입력해 주세요.");
			return; // 반환값 없는 void 메서드를 반환값 없는 return으로 종료.
		}
		// 입력한 화폐가 동일한 경우
		if (exchagingCurrency.equals(exchagedCurrency)) {
			System.out.println("동일한 화폐로 환전할 수 없습니다.");
			return;
		}
		
		// 유효한 금액이 아닐 때 (금액이 양수가 아닐때)
		if (amount <= 0) {
			System.out.println("유효한 금액이 아닙니다.");
			return;
		}
		// 관리하는 화폐 단위가 아닐 때
		boolean hasExchanging = false;
		boolean hasExchanged = false;
		
		for (String menagedCurrency: managedCurrencies) {
			if (exchagingCurrency.equals(menagedCurrency)) {
				hasExchanging = true;
			}
			
			if (exchagedCurrency.equals(menagedCurrency)) {
				hasExchanged = true;
			}
		}
		
		if (!(hasExchanging && hasExchanged)) {
			System.out.println("유효하지 않은 화폐 단위 입니다.");
			return;
		}
		
		double resultAmount = amount;
		
		for (ExchangeRate exchangeRate: exchangeRates) {
			boolean isSame = exchagingCurrency.equals(exchangeRate.getExchangingCurrency()) && 
					exchagedCurrency.equals(exchangeRate.getExchagedCurrency());
			// private로 접근 안되서 get 메서드를 불러와야함.
			if (isSame)
			{
				resultAmount *= exchangeRate.getExchageRate();
				break;
			}
		}
		
		//출력
		System.out.println(exchagedCurrency + ": " + resultAmount);
	}

}
