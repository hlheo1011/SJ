package ex01_random;

public class Ex01 {

	public static void main(String[] args) {

		// ����(Random number)�߻�
		// Random Ŭ����, Math Ŭ������ �ַ� Ȱ���Ѵ�.
		// �����ڵ� ���� ���ڷ� Ȱ�� �����ϴ�.
		
		System.out.println("Math.random ��ɾ� : " + Math.random());
		
		// 0.0 ~ 1.0 ������ ���� Ȯ��
		// 0% ~ 100% �� �ǹ̿� ���ٰ� �� �� �ִ�.
		
		// 1. Ȯ�� ó���ϱ�
		// 10% Ȯ���� "���", 90% Ȯ���� "�ʹ�"
		if(Math.random() < 0.1) {
			System.out.println("���");
		} else {
			System.out.println("�ʹ�");
		}
		
		// 2. ���� �� ����
		
		// Math.random()					0,0 <= n < 1.0
		// Math.random() * 5 				0.0 <= n < 5.0
		// (int)(Math.random() * 5)			0   <= n < 5				// ���� �� ��ȯ
		// (int)(Math.random() * 5) + 1		1   <= n < 6	

		// ����
		// �ֻ��� 2�� ������		
		for(int n = 0; n < 2; n++) {
			int dice = (int)(Math.random() * 6) + 1;
			System.out.println("�ֻ��� : " + dice);
		}
		
		
		// ����
		// 6�ڸ� ������ȣ �����
		String code = "";
		for(int n = 0; n < 6; n++) {
			code += (int)(Math.random() * 10);
		}
		System.out.println(code);
		
		// �ƽ�Ű �ڵ�
		// 48 = '0'
		// 65 = 'A' ~ 90 = 'Z'
		// 97 = 'a'
		
		// 1 + 1.5 =				// ������ �Ǽ� ����� �ڵ�ĳ�������� ��� ���ش�
		// 1 + 'A';	
		
		
		// ����
		// �빮�ڿ� �ҹ��ڸ� �� �״�� �����ϰ� ��� 6�ڸ�
		code = "";
		for(int n = 0; n < 6; n++) {
			if(Math.random() < 0.5) {
			code += (char)(int)((Math.random() * 26) + 'a');	
		} else {
			code += (char)(int)((Math.random() * 26) + 'A');
			}
		}
		System.out.println(code);
		
		
	}

}
