package ex03_method;

public class Calculator {

	// �޼ҵ�(Method) (�ͼ��� ����, �� + �а��� = ������ �ǵ���)
	// �Լ��� ����
	// Ŭ���� ���ο� ���Ե� �Լ��� �޼ҵ��� �θ�
	
	// ��� ���(�޼ҵ�)
	
	// add �޼ҵ� ����
	// 1. int : ��ȯŸ��(add �޼ҵ带 �����ϸ� int Ÿ���� ������� ��ȯ�ȴ�.
	// 2. add : �޼ҵ��(������� ������ ��)
	// 3. int a, int b : �Ű�����(add �޼ҵ带 ȣ���� ���� int Ÿ���� �� 2���� ���޵Ǿ�� �Ѵ�.
	int add(int a, int b) {
		int result = a + b;
		return result;						// return = ����� ��ȯ �ϰڴ�.
	}										// ��ȯ�� : �Լ��� ����� ������ ��
											// ��ȯ��(result)�� ������Ÿ��(int)�� ���� ����� �Ѵ�.
											// ����� ������Ÿ��(int)�� ����
	
	// sub �޼ҵ� ����
	int sub(int a, int b) {
		int result = a - b;
		return result;
	}
	
	// mul �޼ҵ� ����
	int mul(int a, int b) {
		int result = a * b;
		return result;
	}
	
	// div �޼ҵ� ���� ( div(7, 2) --> 3.5 )
	double div(int a, int b) {
		double result = (double)a / b;
		return result;
	}
	
}
