package parking;

import java.util.Scanner;

public class ParkingLot {

	private String name;
	private Car[] cars;
	private int idx;
	private Scanner sc;
	
	
	public ParkingLot(String name) {
		this.name = name;
		cars = new Car[10];
		sc = new Scanner(System.in);			
	}

	public void addCar() {
		System.out.println("���� ��ϵ� ���� " + idx + "��");
		if ( idx == cars.length) {
			System.out.println("�� �̻� ���� ����� �Ұ����մϴ�.");
			return;
		}
		System.out.println("������ȣ >>> ");
		String carNo = sc.next();
		System.out.print("������ >>> ");
		String model = sc.next();
		Car car = new Car(carNo,model);
		cars[idx++] = car;
	}
	
	
	public void deleteCar() {
		if (idx == 0) {
			System.out.println("��ϵ� ������ �����ϴ�.");
			return;
		}
		System.out.println("������ ������ȣ >>> ");
		String carNo = sc.next();
		for( int i = 0; i < idx; i++) {
			if( cars[i].getCarNo().equals(carNo)) {
				System.arraycopy(cars, i + 1, cars, i, idx - i - 1);
				cars[--idx] = null;
				System.out.println("������ȣ " + carNo + "������ �����Ǿ����ϴ�.");
				return;
			}
		}
		System.out.println("��� ������ �������� �ʽ��ϴ�.");	
	}
	
	
	
	public void printAllCars() {

		if ( idx == 0) {
			System.out.println("��ϵ� ������ �����ϴ�.");
			return;
		}
		System.out.println(name + "���� ���");
		for( int i = 0 ; i < idx; i++) {
			System.out.println(cars[i]);
		}
	}
	
	
	public void manage() {
		while(true) {
			System.out.println("1.�߰� 2.���� 3.��ü 0.����");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1 : addCar(); break;
			case 2 : deleteCar(); break;
			case 3 : printAllCars(); break;
			case 0 : System.out.println("�������� �ý����� �����մϴ�."); return;
			default : System.out.println("�������� �ʴ� �޴��Դϴ�.");
			}
		}
	}

}
