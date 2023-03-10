package example.exchange;

// 화폐 : 화폐 = 환율

public class ExchangeRate {
	
	private String exchagingCurrency; // 넣을 화폐 (원화, 달러, 엔화, 위완화...)
	private String exchagedCurrency; // 바꿀 화폐 (원화, 달러, 엔화, 위완화...)
	private double exchageRate; // 환율 ( 1000 / 1,316.30 )
	
	// private로 되어있어서 생성자를 public으로 선언해 다른 곳에서도 사용하도록 함.
	// 생성자는 생성될때만 사용. 초기화용도로만 쓰고 이후에 데이터를 바꾸는 상황을 위해서 set을 사용한다.
	public ExchangeRate(String exchagingCurrency, String exchagedCurrency, double exchageRate) {
		this.exchagingCurrency = exchagingCurrency;
		this.exchagedCurrency = exchagedCurrency;
		this.exchageRate = exchageRate;
	}
	
	// get 메서드 : 값을 반환하기 위한 메서드.
	public String getExchangingCurrency() {
		return this.exchagingCurrency;
	}
	
	public String getExchagedCurrency() {
		return this.exchagedCurrency;
	}
	
	public double getExchageRate() {
		return this.exchageRate;
	}
	
	// set 메서드 : 인스턴스의 변수 값을 변경하는 메서드. 반환X 변경만.
	public void setExchangingCurrency(String exchagingCurrency) {
		this.exchagingCurrency = exchagingCurrency;
	}
	
	public void setExchagedCurrency(String exchagedCurrency) {
		this.exchagedCurrency = exchagedCurrency;
	}
	
	public void setExchageRate(double exchageRate) {
		this.exchageRate = exchageRate;
	}
}
