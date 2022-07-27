package ex01_variable;

public class Ex02 {

	public static void main(String[] args) {

		String str1 = "hello";
		String str2 = "hello";
		
		/*
		     |-------|
		str1 | 0x123 |
		     |-------|
		str2 | 0x123 |
		     |-------|
		     | hello | 0x123
		     |-------|
		*/
		System.out.println(str1 == str2);
		
		String str3 = new String("hi");
		String str4 = new String("hi");
		
		/*
		     |-------|
		str3 | 0x123 |
		     |-------|
		str4 | 0x456 |
		     |-------|
		     | hi    | 0x123
		     |-------|
		     | hi    | 0x456
		     |-------|
		*/
		System.out.println(str3 == str4);
		
		
		// 1. ���ڿ� ���� ��
		boolean result1 = str1.equals(str2);
		boolean result2 = str3.equals(str4);
		System.out.println(result1);
		System.out.println(result2);
		
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
		
		// 2. ��ҹ��ڸ� ������ ���ڿ� ���� ��
		String str5 = "Hello World";
		String str6 = "hELLO wORLD";
		boolean result3 = str5.equalsIgnoreCase(str6);
		System.out.println(result3);
		
		// 3. ���ڿ� ���� ��ȯ
		String name = "�쿵��";
		int length = name.length();
		System.out.println("���ڼ� : " + length);
		
		// 4. Ư�� ��ġ�� ����(char)�� ��ȯ
		// Ư�� ��ġ
		// �ε���(Index)��� ��
		// ���ڸ��� �ο��� ������
		// 0���� ����
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		
		// 5. ���ڿ��� �Ϻ� ���ڿ�(String)�� ��ȯ
		//    1) substring(begin) : �ε��� begin(����)���� ������ ��ȯ
		//    2) substring(begin, end) : �ε��� begin(����)���� �ε��� end(������)���� ��ȯ
		System.out.println(name.substring(0, 1));
		System.out.println(name.substring(1));
		
		// 6. Ư�� ���ڿ��� ã�Ƽ� �ش� �ε���(int)�� ��ȯ
		//    1) indexOf
		//       (1) �߰ߵ� ù ��° ���ڿ��� �ε����� ��ȯ
		//       (2) �߰ߵ� ���ڿ��� ���� ��� -1�� ��ȯ
		//    2) lastIndexOf
		//       (1) �߰ߵ� ������ ���ڿ��� �ε����� ��ȯ
		//       (2) �߰ߵ� ���ڿ��� ���� ��� -1�� ��ȯ
		int idx1 = name.indexOf("��");
		int idx2 = name.indexOf("����");
		int idx3 = name.lastIndexOf("��");
		int idx4 = name.lastIndexOf("����");
		System.out.println(idx1);
		System.out.println(idx2);
		System.out.println(idx3);
		System.out.println(idx4);
		
		// 7. ���ڿ��� Ư�� �������� �����ϴ��� ���θ� boolean(true, false) ��ȯ
		//    startWith(���ڿ�)
		if(name.startsWith("��")) {
			System.out.println("�ξ��Դϴ�.");
		} else {
			System.out.println("�ξ��� �ƴմϴ�.");
		}
		
		// 8. ���ڿ��� Ư�� �������� �������� ���θ� boolean(true, false) ��ȯ
		//    endWith(���ڿ�)
		String filename = "image.jpg";  // jpg, png�� ������ �̹����� ����
		if(filename.endsWith("jpg") || filename.endsWith("png")) {
			System.out.println("�̹����Դϴ�.");
		} else {
			System.out.println("�̹����� �ƴմϴ�.");
		}
		
		// 9. ���ڿ��� Ư�� ������ �����ϴ��� ���θ� boolean(true, false) ��ȯ
		String email = "gt_min@naver.com";
		if(email.contains("@") && email.contains(".")) {
			System.out.println("�̸����Դϴ�.");
		} else {
			System.out.println("�̸����� �ƴմϴ�.");
		}
		
		// 10. ���ʿ��� ���� ����(�¿� ����)
		String message = "  �ȳ�  �ϼ���  ";
		System.out.println(message.trim());
		System.out.println(message.trim().length());
		
		// 11. ��ҹ��� ��ȯ�ϱ�
		// toUpperCase() : �빮�ڷ� ��ȯ�ϱ�
		// toLowerCase() : �ҹ��ڷ� ��ȯ�ϱ�
		String source = "best of best";
		System.out.println(source.toUpperCase());
		System.out.println(source.toLowerCase());
		
		// 12. ã�� �ٲٱ�
		// replace(old, new) : old�� new�� ��ȯ�ϱ�
		String replaced = source.replace("best", "worst");
		System.out.println(source);
		System.out.println(replaced);
		
		// ����. replaceAll() �޼ҵ�� Ư�� ���ڿ��� ã�Ƽ� ��ȯ�ϴ� ���� �ƴ�.
		String ip = "192.168.101.91";
		String replacedIp = ip.replaceAll(".", "_");  // 192_168_101_91�� ���
		System.out.println(replacedIp);
		
		// 13. �� ���ڿ����� ���θ� �˻��� �� boolean(true, false) ��ȯ
		String id = " ";
		if(id.trim().isEmpty()) {
			System.out.println("�� ���ڿ�");
		} else {
			System.out.println("�� ���ڿ� �ƴ�");
		}
		
		// ����. �����̸��� ���ϸ�� Ȯ���ڷ� �и��Ͻÿ�.
		// ��, jpg, git, png �̹����� ��쿡�� �۾��� �����Ѵ�.
		String fullName = "apple.jpg";
		String fileName = "";  // apple
		String extName = "";   // jpg
		int idxOfDot = fullName.lastIndexOf(".");
		fileName = fullName.substring(0, idxOfDot);
		extName = fullName.substring(idxOfDot + 1);
		System.out.println(fileName);
		System.out.println(extName);
		
		// ����. ���ڿ� "abc12345def67890ghijk"����
		// �ƶ��� ���� 1234567890�� �����ϰ� �� ���ھ� ȭ�鿡 ����Ͻÿ�.
		String str = "abc12345def67890ghijk";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= '0' && ch <= '9') {
				continue;
			}
			System.out.println(ch);
		}
		
		byte a = 10;
		double b = a;
		System.out.println(b);

	}

}
