package ex04_condition;

public class Ex01 {

	public static void main(String[] args) {

		// �� ������
		// �ʰ�	: >
		// �̸�	: <
		// �̻�	: >=
		// ����	: <=
		// ����	: ==
		// �ٸ��� : !=
		// ���� ����� boolean(true, false)
		
		int a = 7;
		int b = 2;
		
		boolean result1 = a > b;  // true
		boolean result2 = a < b;  // false
		boolean result3 = a >= b; // true
		boolean result4 = a <= b; // false
		boolean result5 = a == b; // false
		boolean result6 = a != b; // true
		
		// ��ȣ(=)�� �Բ� ���� �����ڴ�, ��ȣ�� ���� ������ �ʴ´�.
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		

	}

}
