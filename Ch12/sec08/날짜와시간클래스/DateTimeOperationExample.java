package Ch12.sec08.날짜와시간클래스;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		System.out.println("현재 시간 : " + now.format(dtf));
		
		LocalDateTime result1 = now.plusYears(1);
		System.out.println("1년 덧셈 : " + result1.format(dtf));
		
		LocalDateTime result2 = now.minusMonths(2);
		System.out.println("2월 뺄셈 : " + result2.format(dtf));
		
		LocalDateTime result3 = now.plusDays(7);
		System.out.println("7일 덧셈 : " + result3.format(dtf));
	}

}
// 날짜와 시간 조작