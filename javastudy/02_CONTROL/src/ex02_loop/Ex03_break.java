package ex02_loop;

public class Ex03_break {

	public static void main(String[] args) {

		// break��
		// switch ���� ������ �� ����Ѵ�.
		// �ݺ���(for, while)�� �����ų �� ����Ѵ�.
		
		/* while(true) {	 		// while(true) {}�� true�� �׻� �����Ѵ�. = ���� ����
		   if(���ǹ�) {				// System.out.println(); �� �� �� ����. ���� ��� �����Ҽ� ���� ��.
			    break;				// �׷��� break�� ����� ��
			}
		}
		 */
		
		// ��� ��ǥ : 1000000��
		// �� ���� 5000���� ���
		
		// 1ȸ ��ݾ� 50000��	���� 50000��
		// 2ȸ ��ݾ� 50000��	���� 100000��
		// ... ���� ���� ���
		int total = 0;
		int money = 50000;
		int serial = 0;
		int goal = 1000000;
		while(true) {
			if(total >= goal) {
				break;
			}	
			total += money;
			serial++;
			System.out.println(serial + "ȸ ��ݾ� " + money + "��" + "\t ���� " + total + "��");
		}
	}

}
