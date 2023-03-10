package chapter5.C_DateTime;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
// 날짜 및 시간

public class DateTime {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); // 현재 시간을 long 타입으로 0.001초 단위로 표현
		System.out.println(startTime);
		
		for(int count = 0; count < 100000000; count++) {
			count++;
		}
		
		long endTime = System.currentTimeMillis(); 
		System.out.println(endTime - startTime); // 반복문 돌리고 나서 걸린 시간.
		
		// Date Class
		// 날짜를 관리 해주는 클래스
		Date date = new Date();
		System.out.println(date);
		
		System.out.println(date.getMonth()); // 인덱스 개념으로 1월을 0번으로 다루고있음. 그래서 현재 월 보다 -1 값으로 나온다.
		
		// 요즘에 이렇게 씀.
		Date now = Date.from(Instant.now());
		System.out.println(now);
		
		Date minusTwoHour = Date.from(Instant.now().minus(2, ChronoUnit.HOURS)); // 시간 계산하고 싶으면 이 형식은 외워야함.
		System.out.println(minusTwoHour);
		
		// SimpleDateFormat
		// Date 타입의 참조변수를 지정한 포멧의 문자열로 변경해주는 클래스
		// y : 연, M : 월, d : 일, H : 시간, m : 분, s : 초
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy. MM. dd. HH:mm:ss");
		String formatedDate = simpleDateFormat.format(now);
		System.out.println(formatedDate);
		
		// Time Package
		// Date와 Calander 클래스 단점 보완
		
		// LocalDate Class
		// 날짜를 관리하는 Class
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		LocalDate localDateOf = LocalDate.of(2022, 12, 25);
		System.out.println(localDateOf);
		
		// LocalTime Class
		// 시간을 관리하는 Class
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		LocalTime localTimeOf = LocalTime.of(12, 40);
		System.out.println(localTimeOf);
		
		// LocalDateTime Class
		// 날짜와 시간 관리하는 Class
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		LocalDateTime localDateTimeOf = LocalDateTime.of(localDateOf, localTimeOf);
		System.out.println(localDateTimeOf);
		
		// 특정 날짜 혹은 시간 가져오기
		// .getXXX();
		int year = localDateTime.getYear(); 
		System.out.println(year); // 2023
		int month = localDateTime.getMonthValue();
		System.out.println(month); // 3 현재 달
		Month enumMonth = localDateTime.getMonth(); // 문자열로 가져옴.
		System.out.println(enumMonth); // MARCH
		int dayOfYear = localDateTime.getDayOfYear();
		System.out.println(dayOfYear); // 69
		int dayOfMonth = localDateTime.getDayOfMonth();
		System.out.println(dayOfMonth); // 10
		
		DayOfWeek dayOfWeek = localDateTime.getDayOfWeek(); // 문자열로 가져옴.
		System.out.println(dayOfWeek);
		boolean isLeapYear = localDate.isLeapYear();
		System.out.println(isLeapYear);
		
		int hour = localDateTime.getHour();
		int minite = localDateTime.getMinute();
		int second = localDateTime.getSecond();
		int nano = localDateTime.getNano();
		
		// 특정 날짜 및 시간 변경 (직접 변경, 더하기, 뺴기)
		// 직접 변경 : withXXX(int 타입 데이터)
		// 더하기 - 뺴기 : plusXXX, minusXXX
		localDateTime.withYear(2012).plusWeeks(4).minusHours(9);
		localDateTime.withDayOfYear(1).plusMinutes(50).minusNanos(50000);
		
		Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
		Date dateTime = Date.from(instant);
		System.out.println(dateTime);
	}

}
