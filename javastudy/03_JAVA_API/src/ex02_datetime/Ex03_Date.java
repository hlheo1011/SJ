package ex02_datetime;

import java.util.Date;

public class Ex03_Date {

	public static void main(String[] args) {

		// java.sql.Date Ŭ����
		// �����ͺ��̽��� ��¥ ǥ�� ��Ŀ� ���� ���� Ŭ����
		// Oracle �����ͺ��̽��� ��¥ Ÿ��("/", "-")�� ��Ī�ؼ� ���
		
		// long Ÿ���� Date�� timestemp ���̴�.
		
		
		// �Ʒ��� ���ô� ������ ��, �ȿܿ��� �ȴ�.
		// ���� �ּ� 3���� �߿��ϴ�.
		Date now = new Date(System.currentTimeMillis());
		System.out.println(now);	

	}

}
