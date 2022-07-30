package ex02_datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex05_LocalDateTime {

	public static void main(String[] args) {

		// java.time.LocalDateTime Ŭ����
		// JDK 1.8���� ����� ������ Ŭ����
		// Ư�� ��¥ ��� ����� ����
		// ��¥�� ���� ������ ����
		
		LocalDateTime now = LocalDateTime.now();	// ���� ��¥�� �ð�
		System.out.println(now);
		
		// Ư�� ��¥ ��� ���
		int year = now.getYear();
		int month = now.getMonthValue(); // 1 ~ 12		
		int day = now.getDayOfMonth();   // 1 ~ 31
		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond();
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		// ����
		// ������ ���� ����� ������ String �̴�. (��¥�� �ð� Ÿ���� �ƴϴ�.)
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("a h:mm yyyy-MM-dd");
		String date = dtf.format(now);
		System.out.println(date);


	}

}
