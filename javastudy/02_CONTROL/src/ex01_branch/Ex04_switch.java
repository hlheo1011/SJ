package ex01_branch;

public class Ex04_switch {

	public static void main(String[] args) {

		// switch ��
		// ǥ������ ��� ���� ���� �б⸦ ó���Ѵ�.
		// ǥ������ ��� ���� double, boolean ������ Ÿ���� �� ����.
		// switch(ǥ����) {
		// case ��: ���๮; break;
		// case ��: ���๮; break;
		// case ��: ���๮; break; // break�� ���� 'switch ���๮�� �����մϴ�' ��� �ǹ��̴�.
		// default: ���๮; // default�� ��� break�� ���� �ʴ´�.
		// }
		
		// switch�� ���� ������ if�� �������� ���� ����.
		
		int step = 1;
		switch(step) {
		case 1: System.out.println("1�ܰ�"); break;
		case 2: System.out.println("2�ܰ�"); break;
		case 3: System.out.println("3�ܰ�"); break;
		default: System.out.println("�߸��� �ܰ�");
		}
		
		// ��������
		// �� ���� �����ڸ� ���
		// 1 ~ 2�� : ������
		// 3 ~ 4�� : ������
		// 5 ~ 6�� : ������
		// ������ : �ں���
		
		int floor = 7;
		String manager;
		
		switch(floor) {
		case 1:
		case 2: manager = "������"; break;
		case 3:
		case 4: manager = "������"; break;
		case 5:
		case 6: manager = "������"; break;
		default : manager = "�ں���";
		}
		
		System.out.println(floor + "�� �����ڴ� " + manager + "�Ŵ��� �Դϴ�.");
		
		// ��������
		// ¦��, Ȧ��
		int n = 6;
		
		switch(n % 2) {
		case 1: System.out.println("Ȧ��"); break;
		default: System.out.println("¦��");
		}
		
		// ��������
		// �б� ����ϱ�
		// 1 ~ 3��   : 1�б�
		// 4 ~ 6��   : 2�б�
		// 7 ~ 9��   : 3�б�
		// 10 ~ 12�� : 4�б�		
		
		int month = 8;
		
		switch((month - 1) / 3) {
		case 0: System.out.println("1�б�"); break;
		case 1: System.out.println("2�б�"); break;
		case 2: System.out.println("3�б�"); break;
		case 3: System.out.println("4�б�"); break;
		}
		
		// ��������
		// ������ ���� ����
		// score    grade
		// 100 ~ 90 A
		// 89 ~ 80  B
		// 79 ~ 70  C
		// 69 ~ 60  D
		// 59 ~ 0   F
		
		int score = 100;
		char grade;
		
		switch(score / 10) {
		case 10: 
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default: grade = 'F';		
		}
		
		System.out.println("������ : " + score + "\t" + "������ : " + grade);
		
		// ��������
		// ���(1,2,3)�� ���� ���� ���
		// 1��� : ���� ���� �б�
		// 2��� : ���� �б�
		// 3��� : �б�
		// ������ : ����
		
		int level = 1;
		String right = "";
		
		switch(level) {
		case 1: right += "����";
		case 2: right += "����";
		case 3: right += "�б�"; break;
		}
		
		System.out.println(right);

		

	}

}
