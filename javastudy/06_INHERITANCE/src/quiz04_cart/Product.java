package quiz04_cart;

public class Product {
	
	// �ʵ�
	private String name;
	private int price;
	
	// ������
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// get, set �޼ҵ�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}	

}
