package chpater5.D_EtcClass;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;

// Timer - TimerTask
// 특정 작업을 지연 시킬때 사용
// TimerTask Class를 상속 받아서 run 메서드를 구현

class Delay extends TimerTask {
	public void run() { // 추상 클래스인 TimerTask Class 의 run 메서드 가져와 구현.
		System.out.println("지연됨!");
	}
}

public class EtcClass {

	public static void main(String[] args) {
		// Timer Class의 인스턴스로 TimerTask 구현채를 실행.
		Timer timer = new Timer(true);
		Delay delay = new Delay();
		timer.schedule(delay, 50);
		
		System.out.println("완료");
		
		// BigDecimal
		// 정확한 소수점 연산을 하기 위한 클래스
		double double1 = 9.4720230310;
		double double2 = 1.303202749;
		System.out.println(double1 + double2); // 10.775225780000001 나옴 여기서 마지막 0000001 식으로 나오니까 BigDecimal 써서 깔끔하게 나오게함.
		
		BigDecimal bigDecimal1 = new BigDecimal(String.valueOf(double1));
		BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(double2));
		System.out.println(bigDecimal1.add(bigDecimal2)); // 10.775225780
		
		// DecimalFormat
		// 일정형식으로 데이터 줄력해주는 클래스
		DecimalFormat decimalFormat = new DecimalFormat("$###,###,###.00");
		System.out.println(decimalFormat.format(1000000)); // $1,000,000.00
	}

}
