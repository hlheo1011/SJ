package ex02_loop;

public class Ex05_nested_for {

	public static void main(String[] args) {

		// for�ȿ� for�� ���Եȴ�. (nested)
		// ��¥ ������ for�ȿ� for �ȿ� for ������ �� �� �ִ�. (3�� �̻��� ���� �����)
		
		// 1���� 1����
		// 1���� 2����
		// ...
		// 1���� 8����
		// 2���� 1����
		// ...
		// 3���� 8����
		
		for (int day = 1; day <= 3; day++) {
			for(int hour = 1; hour <= 8; hour++) {
				System.out.println(day + "���� " + hour + "����");
			}
		}
		
		
		// ���� (nested for��)
		// �������� ����϶�. 2x1 ~ 9x9����
		for (int dan = 2; dan <= 9; dan++) {
			for (int number = 1; number <= 9; number++) {
				System.out.println(dan + " x " + number + " = " + (dan * number));
			}
		}
		
		
		// ���� (nested for��)
		// �������� ����϶�. 2x1 ~ 5x5����
		for (int dan = 2; dan <= 5; dan++) {
			for(int number = 1; number <= 9; number++) {
				System.out.println(dan + " x " + number + " = " + (dan * number));
				if(dan == 5 && number == 5) {
					break;
				}
			}
		}
		
		
		// ��������. ������
		for (int n = 1; n <= 9; n++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.print(dan + "x" + n + "=" + (dan * n) + "\t");
				}
			System.out.println();
		}
		

	}

}
