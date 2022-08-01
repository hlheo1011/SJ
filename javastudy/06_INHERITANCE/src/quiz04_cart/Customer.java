package quiz04_cart;

public class Customer {

	// �ʵ�
	private int money;
	private int bonusPoint;
	private int total;
	private Product[] cart = new Product[10];
	private int idx;  // cart�� ��� Product�� ����. cart �迭�� �ε���.

	// ������ ����
	// new Customer() ����
	
	// �޼ҵ�
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	// buy() �޼ҵ�
	public void buy(Product product) {
		int price = product.getPrice();
		// ���� ������ ��� ������ �� ���.
		if(money < price) {
			System.out.println(product.getName() + " ����� ���� " + (price - money) + "�� �����մϴ�.");
			return;
		}
		// īƮ�� ���� ���� ������ �� ���.
		if(idx == cart.length) {
			System.out.println("īƮ�� ���� á���ϴ�.");
			return;
		}
		// ����
		cart[idx++] = product;
		money -= price;
		total += price;
		bonusPoint += price * 0.1;
	}
	
	// receipt() �޼ҵ�
	public void receipt() {
		System.out.println();
		System.out.println("===== ������ =====");
		// ������ �� ���.
		if(idx == 0) {
			System.out.println("������ ������ �����ϴ�.");
			return;
		}
		// ���� �Ѿ� ���ϱ� �� ���
		for(int i = 0; i < idx; i++) {
			Product product = cart[i];
			System.out.println(product.getName() + "  " + product.getPrice() + "��");
		}
		System.out.println("-----------------------");
		System.out.println("�����Ѿ� " + total + "��");
		System.out.println("���ʽ� " + bonusPoint + "��");
		System.out.println("������ " + money + "��");
	}
	
}