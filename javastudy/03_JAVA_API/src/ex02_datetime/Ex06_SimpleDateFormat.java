package ex02_datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex06_SimpleDateFormat {

	public static void main(String[] args) {

		// java.text.SimpleDateFormat Ŭ����
		// ������ ����� String Ÿ���� ��¥ ��ȯ
		
		Date date1 = new Date();													// util
		java.sql.Date date2 = new java.sql.Date(System.currentTimeMillis());		// sql
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String result1 = sdf.format(date1);
		String result2 = sdf.format(date2);
		
		System.out.println(result1);
		System.out.println(result2);
		
		// ���� Ŭ������ �ΰ� import �ϴ� ���� �Ұ��� �ϴ�.

	}

}
