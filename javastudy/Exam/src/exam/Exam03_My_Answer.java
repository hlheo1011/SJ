package exam;

import java.util.Scanner;

public class Exam03_My_Answer {

	// ����1. String serial�� ù ��° ���ڰ� "1"�̸� "����", "2"�̸� "����"�� ����Ͻÿ�.
	// ����
	// 1234567�� �����Դϴ�.
	public static void q1() {
		String serial = "1234567";
		int gender = Integer.parseInt(serial);
		String result = ((gender / 1000000) % 2 == 0) ? "����" : "����";
		System.out.println(result);
	}
	
	// ����2. int a�� int b�� ����� ����� �̿��ؼ� ��Ģ���� ����� ����Ͻÿ�.
	// ����
	// 7 + 2 = 9
	// 7 - 2 = 5
	// 7 * 2 = 14
	// 7 / 2 = 3.5
	public static void q2() {
		int a = 7;
		int b = 2;
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + ((double)a / b));	
	}
	
	// ����3. Scanner Ŭ������ �̿��ؼ� �Է� ���� ������ int score�� ������ �� �Ʒ��� ���� ó���Ͻÿ�.
	//  0 <= score < 60   : "���հ�" ����ϱ�
	// 60 <= score < 70   : "�հ�C" ����ϱ�
	// 70 <= score < 90   : "�հ�B" ����ϱ�
	// 90 <= score <= 100 : "�հ�A" ����ϱ�
	// score < 0, score > 100 : "�߸��� ����" ����ϱ�
	// ����
	// ���� �Է� >>> 75
	// 75���� �հ�B�Դϴ�.
	public static void q3() {
		int score = 91;
		if(score < 0 || score > 100) {
			System.out.println("�߸��� ����");
		} else if (score >= 90) {
			System.out.println("�հ�A");
		} else if (score >= 70) {
			System.out.println("�հ�B");
		} else if (score >= 60) {
			System.out.println("�հ�C");
		} else {
			System.out.println("���հ�");
		}	
	}
	
	// ����4. 0���� Scanner Ŭ������ �̿��ؼ� �Է� ���� �������� ��� ���� �� ����� ����Ͻÿ�.
	// ����, 0���� ���� ������ �ԷµǸ� ����� �׳� 0�� ����Ͻÿ�.
	// ����1
	// ������ ���� �Է� >>> 5
	// 0���� 5���� ��� ������ ��� : 3.0
	// ����2
	// ������ ���� �Է� >>> -5
	// ��� : 0
	public static void q4() {
		 // �Ҽ������� �����ֱ����� ������ Ÿ�� double �� ���� ����
        // ��հ� �����ֱ� ���� ����
        double begin = 0.0;  // 0

        // ���� �Է¹ޱ� ���� ���� ����
        int end = 0;    // �Է� ���� ����

        // ���� �Է¹ޱ� ���� ��ĳ�� ��ü ����
        Scanner sc = new Scanner(System.in);


        System.out.println("������ ������ �Է����ּ���.");

        // ��ĳ�� ��ü�� Ȱ���Ͽ� �Է¹��� �� ������ �ֱ�
        end = sc.nextInt();

        // �Է¹��� ������ ���� 0���� Ŭ���
        // - ���� ��� �������� 0���� ó��
        if (end > 0) {
            // �հ踦 �ϱ����� ���� ����
            int sum = 0;
            // �Է¹��� ���� �ݺ��� �ϸ鼭 ���� 1���� ������
            for (int i = 0; i <= end; i++) {
                //ex : 0 ~ 5 ������ ���� sum ������ �ְ� ������
                // +=�� Ȱ���ص� �ǰ�  sum = sum + i; �� �ص� ������
                // +=�� ���� �����ؼ� ���ϴ� ����
                sum += i;
            }
            begin = sum / end;
        }

        System.out.println("�Է��� ������ ��հ��� = " + begin + " �Դϴ�.");

		/*
		int begin = 0;  // 0
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���� �Է� >>> ");
		int end = sc.nextInt();

		for(int n = begin; n <= end; n++) {
			end = begin + n;
			
			}	
		System.out.println(end);
		*/
	}
	
	// ����5. 1���� 100 ������ ��� ������ ������� ¦������ �հ�� Ȧ������ �հ踦 ���� ����Ͻÿ�.
	// ����
	// ¦�� �� : 2550
	// Ȧ�� �� : 2500
	public static void q5() {
		int even = 0;  // ¦�� ��
		int odd = 0;   // Ȧ�� ��
		for(int n = 1; n <= 100; n++) {
			if(n % 2 == 0) {
				even += n;
			} else {
				odd += n;
			}
		}
		
		System.out.println(even);
		System.out.println(odd);
		
	}
	
	// ����6. ����(balance)�� 5000���� �ִ�. 1������ 1000�� ������ ������ �߻����Ѽ� �ش� ������ŭ 10�� ��� ó���Ͻÿ�.
	// ���̳ʽ� �����̹Ƿ� �ܾ��� ������ �� �ִ�.
	// ����
	// ��� �� 5000��, 1ȸ ��� 1��, ��� �� 4999��
	// ��� �� 4999��, 2ȸ ��� 10��, ��� �� 4989��
	// ...
	// ��� �� 100��, 10ȸ ��� 500��, ��� �� -400��
	public static void q6() {
		int balance = 5000;  // ����
		
		for(int n = 0; n < 10; n++) {
			int money = (int)((Math.random() * 1000) + 1);
			System.out.println("��� �� " + balance + "��, " + (n + 1) + "ȸ ��� " + money + "��, ��� �� " + (balance - money) + "��");
			balance -= money;
		}	
	}
	
	// ����7. Scanner Ŭ������ �̿��ؼ� �Է� ���� ���ڿ��� ���� 'h'�� �� �� ���ԵǾ� �ִ��� ������ ���ؼ� ����Ͻÿ�.
	// next() �޼ҵ带 �̿��ؼ� ���ڿ��� �Է� �����ÿ�.
	// ����
	// ���ڿ� �Է� >>> happy
	// happy�� ���Ե� h�� 1���Դϴ�.
	public static void q7() {
		int count = 0;  // 'h'�� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� >>> ");
		String text = sc.next();
		
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == 'h') {
				count++;
			}
		}
		System.out.println(text + "�� ���Ե� h�� " + count + "�� �Դϴ�.");
		
	}
	
	// ����8. ���� ���ؿ� ���� ���ϸ��� ��ȯ�Ͻÿ�.
	// Scanner Ŭ������ next() �޼ҵ带 �̿��ؼ� ���ϸ��� �Է� ���� �� ���ϸ� �������� ����(_)�� Ÿ�ӽ����� ���� ���̽ÿ�.
	// ����
	// ��ȯ �� ���ϸ� >>> happy.jpg
	// ��ȯ �� ���ϸ� = happy_1658792128410.jpg
	public static void q8() {
		 String beforeName = "";  // ��ȯ �� ���ϸ�
	        String afterName = "";   // ��ȯ �� ���ϸ�

	        // ���� �Է¹ޱ� ���� ��ĳ�� ��ü ����
	        Scanner sc = new Scanner(System.in);

	        System.out.println("���ϸ��� �Է����ּ���.");
	        
	        // ���ϸ� �޾ƿ���
	        beforeName = sc.nextLine();

	        // ���ϸ��� .(��) �������� �߶󳻰� �迭�� ����
	        // ex : ["���ϸ�", "Ȯ����"]
	        String[] fileNameArray = beforeName.split("\\.");

	        // ����ð� ���ϱ�
	        long timestamp = System.currentTimeMillis();
	        // ù��° �迭�� _ (�����) �� ����ð� ���̱�
	        fileNameArray[0] = fileNameArray[0] + "_" + timestamp;

	        System.out.println(System.currentTimeMillis());
	        System.out.println("��ȯ �� ���ϸ� = " + beforeName);

	        // ��ȯ ���ϸ����� ���� �ٿ��ֱ��
	        afterName = fileNameArray[0] + "."+fileNameArray[1];
	        System.out.println("��ȯ �� ���ϸ� = " + afterName);

	}
	
	// ����9. Scanner Ŭ������ next() �޼ҵ带 �̿��ؼ� ��� �̸��� �Է� ���� ��
	// �ƴ� ����� �̸��̸� "�ݰ��� ģ����"�� ����ϰ�, 
	// �𸣴� ����� �̸��̸� "�ȳ��ϼ��� ó���˰ڽ��ϴ�"�� ����Ͻÿ�.
	// �ƴ� ����� "������", "���켺", "������" ���̴�.
	// ����1
	// �̸� �Է� >>> ���켺
	// �ݰ��� ģ����
	// ����2
	// �̸� �Է� >>> ���缮
	// �ȳ��ϼ��� ó���˰ڽ��ϴ�
	public static void q9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���. >>> ");
		String name = sc.next();
		if(name.equals("���켺") || name.equals("������") || name.equals("������")) {
			System.out.println("�ݰ��� ģ����");
		} else {
			System.out.println("�ȳ��ϼ���. ó���˰ڽ��ϴ�.");
		}
		
	}
	
	// ����10. ���� ���ǿ� ���� ��й�ȣ üũ ���α׷��� �����Ͻÿ�.
	// 1. ��й�ȣ�� �ִ� 5������ �Է��� �����ϴ�.
	// 2. ��й�ȣ�� "1234abcd"�� �����Ѵ�.
	// 3. ��й�ȣ �Է��� �����ϸ� "����"�� ����ϰ� ���α׷��� �����Ѵ�.
	// 4. ��й�ȣ �Է��� �����ϸ� "����"�� ����ϰ� �ٽ� ��й�ȣ�� �Է� �޴´�.
	// 5. 5��° ��й�ȣ �Է� ����� �����ϸ� "Ƚ�� �ʰ�"�� ����ϰ� ���α׷��� �����Ѵ�.
	// ����1
	// ��й�ȣ �Է�(1ȸ) >>> 1234
	// ����
	// ��й�ȣ �Է�(2ȸ) >>> abcd
	// ����
	// ��й�ȣ �Է�(3ȸ) >>> 1234abcd
	// ����
	// ����2
	// ��й�ȣ �Է�(1ȸ) >>> 1234
	// ����
	// ��й�ȣ �Է�(2ȸ) >>> abcd
	// ����
	// ��й�ȣ �Է�(3ȸ) >>> 5678
	// ����
	// ��й�ȣ �Է�(4ȸ) >>> 8888
	// ����
	// ��й�ȣ �Է�(5ȸ) >>> 5555
	// Ƚ�� �ʰ�
	public static void q10() {
	     String pw = "";  // ��й�ȣ
	        // ���� �Է¹ޱ� ���� ��ĳ�� ��ü ����
	        Scanner sc = new Scanner(System.in);

	        String pwd = "1234abcd";

	        for (int i = 1; i <=5 ; i++) {

	            System.out.print("��й�ȣ �Է�(" + i + ") >>> " );
	            pw = sc.nextLine();
	            // ��й�ȣ ���̰� 5���� �������
	            if (!pw.equals(pwd)) {
	                // 5°�� Ʋ�������
	                if (i >= 5) {
	                    System.out.println("Ƚ�� �ʰ�");
	                } else {
	                    System.out.println("����");
	                }
	            } else {
	                System.out.println("����");
	                break;
	            }

	        }
		/*
		Scanner sc = new Scanner(System.in);
		int count = 1;
		
		for (int n = count; n <= 5; n++) {
			System.out.print("��й�ȣ �Է�(" + count + "ȸ) >>> ");
			String pw = sc.next();
			if(pw.equals("1234abcd")) {
				System.out.println("����");
				return;
			} else {
				count++;
				System.out.println("����");
			} 
		}
		System.out.println("Ƚ�� �ʰ�");
		*/

		
	}
	
	// main �޼ҵ�� �״�� ����մϴ�.
	public static void main(String[] args) {
		//System.out.println("=����1=");
		//q1();
		//System.out.println("=����2=");
		//q2();
		//System.out.println("=����3=");
		//q3();
		//System.out.println("=====����4=====�ڡ�");
		//q4();
		//System.out.println("=====����5=====");
		//q5();
		//System.out.println("=====����6=====");
		//q6();
		//System.out.println("=====����7===== Ǯ�� �Ϸ�, ���ۺ��� ã��..");
		//q7();
		//System.out.println("=====����8===== �ڡ�");
		//q8();
		//System.out.println("=====����9=====");
		//q9();
		System.out.println("=====����10===== �ָ��ϴ�.");
		q10();
	}

}
