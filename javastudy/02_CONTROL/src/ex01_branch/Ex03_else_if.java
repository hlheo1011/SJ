package ex01_branch;

public class Ex03_else_if {

	public static void main(String[] args) {

		// else if��
		// ������ ���� �� ���Ǵ� ��쿡 �� ������ ó���Ѵ�.
		// if(����) {
		//		���๮
		// } else if(����) {
		//		���๮
		// } else if(����) {
		//		���๮
		// }
		
		// ���̿� ���� ��� ���
		// 0 ~ 7   : �����оƵ�
		// 8 ~ 13  : �ʵ��л�
		// 14 ~ 16 : ���л�
		// 17 ~ 19 : ����л�
		// 20 ~    : ����
		
		int age = 20;
		if (age <= 7) {
			System.out.println("�����оƵ�");
		} else if (age <= 13) {
			System.out.println("�ʵ��л�");
		} else if (age <= 16) {
			System.out.println("���л�");
		} else if (age <= 19) {
			System.out.println("����л�");
		} else {
			System.out.println("����");
		}
		
		// ����.
		// ���� ���� ���� ���
		// ��  : 3 ~ 5��
		// ���� : 6 ~ 8��
		// ���� : 9 ~ 11��
		// �ܿ� : 12, 1 ~ 
		
		int month = 10;
		if (month < 1 || month > 12) {
			System.out.println("�߸��� ��");
		} else if (month == 12 || month <= 2) {
			System.out.println("�ܿ�");
		} else if (month <= 5) {
			System.out.println("��");
		} else if (month <= 8) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		
		// ��������.
		// ������ ���� ����
		// score	grade
		// 100 ~ 90 A
		// 89 ~ 80  B
		// 79 ~ 70  C
		// 69 ~ 60  D
		// 59 ~ 0   F
		
		int score = 80;
		char grade;
		if (score < 0 || score > 100) {
			grade = 'x';
		} else if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("���� : " + score + "��" + "\t" + "���� : " + grade + "���");
		
		
		// ��������.
		// ���� �� ���� ���
		// 1���� �������̴�.
		// n�� �� ���� �������� ����ϱ�.
		int day = 1;
		int n = 1;
		String weekName;
		
		day += n;
		
		if (day % 7 == 1) {
			weekName = "������";
		} else if (day % 7 == 2) {
			weekName = "�����";
		} else if (day % 7 == 3) {
			weekName = "�ݿ���";
		} else if (day % 7 == 4) {
			weekName = "�����";
		} else if (day % 7 == 5) {
			weekName = "�Ͽ���";
		} else if (day % 7 == 6) {
			weekName = "������";
		} else {
			weekName = "ȭ����";		
		}
		
		System.out.println(weekName);
	
		
		
		
	}

}
