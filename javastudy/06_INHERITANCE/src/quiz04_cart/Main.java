package quiz04_cart;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();       // ���� ���� ���� ��
		customer.setMoney(10000);                 // 10000���� ���� ��
		customer.buy(new Meat("�ѿ�", 5000));     // 5000��¥�� �ѿ츦 ���.(īƮ�� ��´�.)
		customer.buy(new Milk("�������", 2500)); // 2500��¥�� ��������� ���.(īƮ�� ��´�.)
		customer.buy(new Snack("Ȩ����", 1500));  // 1500��¥�� Ȩ������ ���.(īƮ�� ��´�.)
		customer.buy(new Meat("�Ұ��", 5000));   // ���� �Ұ�
		customer.receipt();                       // �������� ����.

	}


}
