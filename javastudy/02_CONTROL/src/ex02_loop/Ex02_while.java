package ex02_loop;

public class Ex02_while {

	public static void main(String[] args) {

		// while��
		// Ư�� ���๮�� �ݺ��� �� ����Ѵ�.
		// while(���ǹ�) {
		//		���๮
		// }
		//(if���� �Ȱ��� ����)
		
		int balance = 79350;
		int money = 450;
		// ���� �ܾ��� 79350�� ��, 450���� ��� ����������� ���� �ܰ� ��� ���
		
		while(balance >= money) {
			System.out.println("�ܾ� " + balance + " �����" + money);
			balance -= money;
		}
		System.out.println();
		System.out.println("�ܾ� " + balance);
		
	}

}
