package ex01_variable;

public class Ex01 {

	public static void main(String[] args) {

		// �������� (2)
		// �������� 1��
		for(int n = 1; n <= 10; n++) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		
		// �������� 2��
		for(int n = 10; n >= 1; n--) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		
		// �������� 3��
		for(int n = 1; n <= 9; n++) {
			System.out.print("7x" + n + "=" + n * 7 + "\t");
		}
		
		System.out.println();
		
		// �������� 4��
		for(int n = 1; n <= 100; n++) {
			if(n % 3 == 0) {
				System.out.print(n + " ");
			}
		}
		
		System.out.println();
		
		// �������� 5��
		int total = 0;
		for(int n = 1; n <= 100; n++) {
			total += n;
		}
		System.out.println(total);
		
		// �������� 6��
		
		// �������� 7��
		int point = 5;
		String star = "";
		for(int n = 1; n <= point; n++) {
			star += "��";
		}
		System.out.println(star);
		
		// �������� 8��
		long balance = 69450;
		int dis = 25000;
		while(balance >= dis) {
			System.out.println("�����" + dis + "\t" +"�����ݾ�" + balance);
			balance -= dis;
		}
		System.out.println("���� �ݾ�" + balance);
		
		// �������� 9��
		int total2 = 0;
		int money = 50000;
		int serial = 0;
		int goal = 1000000;
		while(true) {
			if(total2 >= goal) {
				break;
			}
			total2 += money;
			serial++;
			System.out.println(serial + " " + money + " " + total2);
		}
		
		// �������� 10��
		int total3 = 0;
		int n = 0;
		while(n < 100) {
			n++;
			if(n % 3 != 0) {
				total3 += n;
			}
		}
		System.out.println(total3);
		

		

	}

}
