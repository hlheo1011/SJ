package ex02_datetime;

import java.util.Date;

public class Ex02_Date {

	public static void main(String[] args) {

		// Ŭ���� ��� ��Ģ
		// ��Ű�� ������ ��ħǥ(.)�� ���� Ŭ�������� ���´�.
		
		java.lang.System.out.println("Hello");
		
		// ���� ��Ģ
		// java.lang ��Ű���� �Ҽӵ� Ŭ�������� ��Ű���� ������ �� �ִ�.

		// java.util ��Ű���� Date Ŭ����
		// 1. java.util.Date
		// 2. impot java.util.Date;					// ���� �� �ʿ� ����
		//	  Date
		// 	// 1. Date �Է��� ctrl + space bar ������ 
		//	// Date ��(��Ű��)�� util�ִ°� �����ϸ� Ŭ������ ����
		
		//-------------------------------------------------------------------//
		
		// Ŭ������ ��ü
		// 1. Ŭ���� : ��ü�� ����� ���� ���赵
		// 2. ��ü   : Ŭ������ �̿��ؼ� ���� ���� ��ü
		// 3. �Ϲ����� ���� ���
		//	  Ŭ���� ��ü : new Ŭ����();
		
		// �޼ҵ� ���
		// 1. Ŭ������ �̿��ؼ� ȣ��
		//	  system.out.println()
		//	  system.currentTimeMillis()
		//	  system.nanoTime()
		//	  Math.random()
		
		// 2. ��ü�� ���� ȣ��
		//	  String str = new String("Hello");	// Ŭ���� String, ��ü str
		//	  str.equals("Hello")
		
		// 	  Date now = new Date();	// Ŭ���� Date, ��ü now
		//	  now.getMonth()
		
		//	  StringBuilder sb = new StringBuilder(); // Ŭ���� StringBuilder, ��ü sb
		//	  sb.append()
		
		// Date Ŭ������ now ��ü (��ü �̸��� ���� �̸� ���� ����) (Ŭ������ ������ ����)
		Date now = new Date();
		System.out.println(now);


	}

}
