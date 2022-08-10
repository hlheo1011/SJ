package quiz04_employee;

import java.util.Scanner;

public class Company {
	
	// �ʵ�
		private Employee[] employees;
		private int idx;
		private Scanner sc;
		
		// ������
		public Company() {
			employees = new Employee[5];
			sc = new Scanner(System.in);		
		}
		
		
		// 1. ��ϸ޼ҵ� (���ַ�����,�۹���������) (Ǯ,1)
		public void addEmployee() throws EmployeeException {
			System.out.println("���� ��ϵ� ���� : " + idx + "��");
			if(idx == employees.length) {
				throw new EmployeeException("FULL", 1000);
			}
			
			System.out.print("������(M)���� �ñ���(T)���� �����ϼ���.");
			String type = sc.next().substring(0, 1);
			
			if(type.equalsIgnoreCase("m")) {
				System.out.println("�� ������ ���� ���");
				System.out.print("1.������ȣ >>> ");
				int regularNo = sc.nextInt();
				System.out.print("2.�����̸� >>> ");
				String regularName = sc.next();
				System.out.print("3.�����Է� >>> ");
				int salary = sc.nextInt();
				Regular regular = new Regular(regularNo, regularName, salary);
				employees[idx++] = regular;
				
			} else if (type.equalsIgnoreCase("t")) {
				System.out.println("�� �ñ��� ���� ���");	
				System.out.print("1.������ȣ >>> ");
				int temporaryNo = sc.nextInt();
				System.out.print("2.�����̸� >>> ");
				String temporaryName = sc.next();
				System.out.print("3.�ñ��Է� >>> ");
				int timeMoney = sc.nextInt();
				System.out.print("4.���ѽð��Է� >>> ");
				int times = sc.nextInt();
				
				Temporary temporary = new Temporary(temporaryNo, temporaryName);
				employees[idx++] = temporary;		
				
				temporary.setPay(timeMoney * times);
				temporary.setWorkTimes(times);			
				
			} else {
				throw new EmployeeException("�߸��� �Է�", 1500);
			}


		}
		
		
		// 2. �����޼ҵ� (�����ȣ ��ġ�ϸ� ����) (��Ƽ,2)
		public void dropEmployee() throws EmployeeException {
			if(idx == 0) {
				throw new EmployeeException("EMPTY", 2000);
				}
			System.out.print("���� ��ȣ >>> ");
			int employeeNo = sc.nextInt();
			for(int i = 0; i < idx; i++) {
				if(employees[i].getEmpNo() == employeeNo) {
					System.arraycopy(employees, i + 1, employees, i, idx - i - 1);
					employees[--idx] = null;
					System.out.println("������ȣ " + employeeNo + "�� ������ �����Ǿ����ϴ�.");
					return;
				}
			}
			System.out.println("������ȣ�� �߸� �Է��Ͽ����ϴ�.");
			
		}
		
		
		// 3. ��ȸ�޼ҵ� (�����ȣ ��ġ�ϸ� ����) (��Ƽ,2)
		public void findEmployee() throws EmployeeException {
			if(idx == 0) {
				throw new EmployeeException("EMPTY", 2000);
				}
			System.out.print("��ȸ�� ���� ��ȣ �Է� >>> ");
			int empNo = sc.nextInt();
			// �������� �ƴ� ���ڿ��� ����ؾ� �ҰŰ�����  .. . 
			
			for(int i = 0; i < employees.length; i++) {
				if(employees[i].toString().equals(empNo)) {
					System.out.println(employees[i]);
					return;
				}
			}
			System.out.println("������ȣ�� �߸� �Է��Ͽ����ϴ�.");
			
		
		}
		
		
		// 4. ��ȸ�޼ҵ� (��Ƽ,2)
		public void printAllEmployees() throws EmployeeException {
			if(idx == 0) {
				throw new EmployeeException("EMPTY", 1000);
			}
			System.out.println("��ü ������ ��ȸ�մϴ�.");
			for(int i = 0; i < employees.length; i++) {
				if(employees[i] != null) {
					System.out.println(employees[i]);
				}
			}
		}
		
		
		public void manage() {
			
			while(true) {		
				try {
					System.out.print("1.��� 2.���� 3.����������ȸ 4.��ü������ȸ 0.����");
					int choice = sc.nextInt();
					sc.nextLine();
					
					switch(choice) { 
					case 1 : addEmployee(); break;
					case 2 : dropEmployee(); break;
					case 3 : findEmployee(); break;
					case 4 : printAllEmployees(); break;
					case 0 : System.out.println("���� ���� ���α׷��� �����մϴ�."); return;
					default : throw new RuntimeException();
					}
				} catch (EmployeeException e) {
					System.out.println(e.getMessage());
				} catch (InputMismatchException e) {
					sc.next();
					System.out.println("ó�� ����� ����(1~4,0) �Դϴ�.");
				} catch (RuntimeException e) {
					System.out.println(e.getMessage());
				}
			}
			
		}

}
