package ex02_datetime;

import java.util.Calendar;

public class Ex04_Calendar {

	public static void main(String[] args) {

		// java.utill.Calendar Ŭ����
		// ���� ��¥ �Ǵ� Ư�� ��¥�� ��Ÿ�� �� ���
		// ��¥�� Ư�� ���(��, ��, ��, ��, ��, ��, ...)�� ���� ���
		// OOP (��ü���� ���α׷�) (Object Oriented Programming = ��ü�� ������� ���α׷����� �Ѵ�.)
		
		Calendar cal = Calendar.getInstance();	// ��ü cal�� ���� ��¥�� �ð����� ���� (����Ǵ� ������ ��¥ ����)
		
		// ��, ��, ��, ���� 	// �� �̶�� �ϴ°� ��(month) �����̿��� Day of month�� ����Ѵ�.
		int year = cal.get(Calendar.YEAR); 		// int year = cal.get(1);
		int month = cal.get(Calendar.MONTH) + 1;	// �� : 0 ~ 11 (���ǰ� �ʿ���) // ���� ���� +1 �� ���δ�.
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int weekNo = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		switch(weekNo) {
		case 1: System.out.println("�Ͽ���"); break;
		case 2: System.out.println("������"); break;
		case 3: System.out.println("ȭ����"); break;
		case 4: System.out.println("������"); break;
		case 5: System.out.println("�����"); break;
		case 6: System.out.println("�ݿ���"); break;
		default : System.out.println("�����");
		}
		
		// ����/����, ��, ��, ��
		int ampm = cal.get(Calendar.AM_PM); 			// ����(0), ����(1)
		int hour12 = cal.get(Calendar.HOUR);			// ��(1 ~ 12)
		int hour24 = cal.get(Calendar.HOUR_OF_DAY);		// ��(0 ~ 23) !!����
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		switch(ampm) {
		case 0: System.out.println("����"); break;
		case 1: System.out.println("����"); break;
		}

		System.out.println(hour12);
		System.out.println(hour24);
		System.out.println(minute);
		System.out.println(second);
		
		// timestemp
		long timestemp = cal.getTimeInMillis();
		System.out.println(timestemp);

	}

}
