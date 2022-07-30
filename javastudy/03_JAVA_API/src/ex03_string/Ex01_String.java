package ex03_string;

public class Ex01_String {

	public static void main(String[] args) {
		
		// ���� ������ ����
		String str1 = "hello";
		String str2 = "hello";					
		System.out.println(str1 == str2); // true
		
		// �ٸ� ������ ����
		String str3 = new String("hi");
		String str4 = new String("hi");
		System.out.println(str3 == str4); // false
		
		// �ٸ� ������ �����̴� false��� ��� ���� ���´�.
		// �׷��� "���ڿ�"��ü�� �� �Ҷ��� �񱳿����� ��ȣ�� ���� �ȵȴ�.
		
		// 1. ���ڿ� ���� ��
		// - ���ڿ��� ���� ���Ҷ��� equals��� �޼ҵ带 ����Ѵ�.
		// �޼ҵ带 ȣ���ϴ� ���� Ŭ������ �̿��� ȣ�����, ��ü�� �̿��� ȣ����� �ִ�.
		// �Ʒ� ���ô� ��ü�� �̿��� ȣ����̴�.
		// Sting str3 = �� ��ü�̴�.
		// �Ʒ� ���ô� ������(������)�� ���ϴ°� �ƴ϶�, ���ڿ��� ���ϴ� ���̴�.
		
		// ���� �� ��.
		boolean result1 = str1.equals(str2);
		boolean result2 = str3.equals(str4);
		System.out.println(result1);
		System.out.println(result2);
		
		// �ٸ� �� ��.
		if(str1.equals(str2)) {
			System.out.println("str1, str2�� ���ƿ�");
		} else {
			System.out.println("str1, str2�� �޶��");
		}
		
		if(!str3.equals(str4)) {
			System.out.println("str3, str4�� �޶��");
		} else {
			System.out.println("str3, str4�� ���ƿ�");
		}
		// �������� ������ ������� �ʴ´�.
		
		// 2. ��ҹ��ڸ� ������ ���ڿ� ���� ��.
		// (���� ��� ID ĥ�� ��ҹ��� ����)
		String str5 = "Hello World";
		String str6 = "hELLO wORLD";
		boolean result3 = str5.equalsIgnoreCase(str6);
		System.out.println(result3);
		
		// 3. ���ڿ� ���� ��ȯ
		String name = "ȫ�浿";
		int length = name.length();
		System.out.println("���ڼ� : " + length);
		// ���鵵 ���ڼ��� ����
		// �ƽ�Ű �ڵ�ѹ� : 32��
		
		// 4. Ư�� ��ġ�� ���ڸ� ��ȯ.
		// Ư����ġ�� �ε���(Index)��� �Ѵ�.
		// ���ڸ��� �ο��� ������.
		// 0���� ����
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		System.out.println();
		
		// 5. ���ڿ��� �Ϻ� ���ڿ�(String)�� ��ȯ
		// 	1) substring(begin) " �ε��� begin(�ε��� ����)���� ������ ��ȯ
		//  2) substring(begin, end) : �ε��� begin(�ε��� ����)���� �ε��� end(������)���� ��ȯ
		System.out.println(name.substring(1));		// �ι�° ���ڻ��� ������
		System.out.println(name.substring(0,3));	// ù��° ���ڸ�
		
		// 6. Ư�� ���ڿ��� ã�Ƽ� �ش� �ε���(int)�� ��ȯ
		//	1) indexOf
		//		(1) �߰ߵ� ù ��° ���ڿ��� �ε����� ��ȯ
		//		(2) �߰ߵ� ���ڿ��� ���� ��� -1�� ��ȯ
		//	2) lastIndexOf
		//		(1) �߰ߵ� ������ ���ڿ��� �ε����� ��ȯ
		//		(2) �߰ߵ� ���ڿ��� ���� ��� -1�� ��ȯ
		int idx1 = name.indexOf("ȫ"); 		// ȫ�� �ε����� 0 �̹Ƿ�, 0
		int idx2 = name.indexOf("ȫ�浿");		// �浿���� ù��° �ε����� '��'���� �ν��ؼ� 1.
		System.out.println("indexOf : " + idx1);
		System.out.println("indexOf : " + idx2);
		
		int idx3 = name.lastIndexOf("��"); 	// ���� �ε����� 2 �̹Ƿ�, 2
		int idx4 = name.lastIndexOf("ȫ�浿"); // �浿���� ������(last)�ε����� '��'�� �ν��ؼ� 2.
		System.out.println("lastInderxOf : " + idx3);
		System.out.println("lastInderxOf : " + idx4);
		
		
	}

}
