package ex05_string;

public class Ex01 {

	public static void main(String[] args) {

		// ���ڿ� ���� ������
		// ���ڿ��� ���Ե� + ������ ������ �ǹ�
		
		String str1 = "�ڹ�" + "��ũ��Ʈ";
		String str2 = 100 + "����";
		String str3 = 1 + 1 + "���";
		String str4 = "1" + "+" + "1" + "���";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		// + ������ �̿��� ���ڿ� �����
		// �� ���ڿ� ("")�� + �� �ָ� �ȴ�.
		String str5 = 100 +""; // String.valueOf(100)�� ����. // ���� -> ���ڿ��� �ȴ�.
		System.out.println(str5);
		
				

	}

}
