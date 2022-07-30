package re_exam;

import java.util.Calendar;
import java.util.Scanner;

public class ReExam02_Answer {

	public static void main(String[] args) {
		System.out.println("=====����1=====");
		q1();
		System.out.println("=====����2=====");
		q2();
		System.out.println("=====����3=====");
		q3();
		System.out.println("=====����4=====");
		q4();
		System.out.println("=====����5=====");
		q5();
		System.out.println("=====����6=====");
		q6();
		System.out.println("=====����7=====");
		q7();
		System.out.println("=====����8=====");
		q8();
		System.out.println("=====����9=====");
		q9();
	}
	
	// ����1. ���밪 ���ϱ�
	// ���� a�� ����� ���밪�� ����Ͽ� ���� abs�� �����ϰ� ����Ͻÿ�.
	// ��������. ���(if, switch)�� ������� ���� ���� �����ڸ� �̿��Ͻÿ�.
	// ����)
	// -5�� ���밪�� 5�Դϴ�.
	public static void q1() {
		int a = -5;
		int abs = (a < 0) ? -a : a;
		System.out.println(a + "�� ���밪�� " + abs + "�Դϴ�.");
	}
	
	// ����2. String strAge�� ����� ���̰� 20 �̻��̸� "����", �ƴϸ� "�̼�����"�� ����Ͻÿ�.
	// ����)
	// 25���� �����Դϴ�.
	public static void q2() {
		String strAge = "5";
		int age = Integer.parseInt(strAge);
		System.out.println(age + "���� " + (age >= 20 ? "����" : "�̼�����") + "�Դϴ�.");
	}
	
	// ����3. �ʺ� 5cm, ���̰� 3cm�� �ﰢ���� ���̸� ����Ͽ� ���� area�� ������ �� ����Ͻÿ�.
	// ����)
	// �ʺ� 5cm, ���̰� 3cm�� �ﰢ���� ���̴� 7.5���Դϴ�.
	public static void q3() {
		int width = 5;
		int height = 3;
		double area = (width * height) * 0.5;
		System.out.println(area);
	}
	
	// ����4. �������� ����.
	// 1. 2~9�� ������ ������ �������� ��µȴ�.
	// 2. ������ �Է��ؼ� ������ "����", Ʋ���� "��"�� ����Ͻÿ�.
	// ����1)
	// 4x9? >>> 36
	// ����
	// ����2)
	// 8x7? >>> 49
	// ��
	public static void q4() {
		int dan = (int)(Math.random() * 8) + 2;
		int n = (int)(Math.random() * 9) + 1;
		Scanner sc = new Scanner(System.in);
		System.out.print(dan + "x" + n + "? >>> ");
		int answer = sc.nextInt();
		System.out.println(dan * n == answer ? "����" : "��");
	}
	
	// ����5. ���� month�� ����� ���� ������ �ش� ���� ��ĥ���� �ִ��� ����Ͻÿ�.
	// ����)
	// 5���� 31�ϱ��� �ְ�, ���Դϴ�.
	public static void q5() {
		int month = 5;
		int[] lastDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] seasons = {"�ܿ�", "��", "����", "����"};
		System.out.println(month + "���� " + lastDay[month] + "�ϱ��� �ְ�, " + seasons[month % 12 / 3] + "�Դϴ�.");
	}
	
	// ����6. ���� second�� ����� �ʸ� ��/��/�ʷ� ��ȯ�Ͽ� ����Ͻÿ�.
	// 1���� �Ѵ� ��� '��'���� ǥ���ϰ�, 1�ð��� �Ѵ� ��� '��'���� ǥ���Ͻÿ�.
	// ����1)
	// 40�ʴ� 40���Դϴ�.
	// ����2)
	// 90�ʴ� 1�� 30���Դϴ�.
	// ����3)
	// 3690�ʴ� 1�ð� 1�� 30���Դϴ�.
	public static void q6() {
		// int second = 40;  // �Ʒ� ������ �ٲ㰡�鼭 �׽�Ʈ
		// int second = 90;
		int second = 3690;
		if(second < 60) {
			System.out.println(second + "��");
		} else if(second < 3600) {
			System.out.println((second / 60) + "�� " + (second % 60) + "��");
		} else {
			System.out.println((second / 3600) + "�ð� " + (second % 3600 / 60) + "�� " + (second % 60) + "��");
		}
	}
	
	// ����7. Ű(height) ������ �̿��� ������ũ���� ž���� ������ ��� ��Ʈ���Ǹ� ����Ͻÿ�.
	// 1. �����̵� : 120 �̻� ž�� ����
	// 2. �θ޶��� : 130 �̻� ž�� ����
	// 3. ���Ǵ�Ǯ : 140 �̻� ž�� ����
	// ����(Ű�� 125.5�� ���)
	// �����̵� ž�� �����մϴ�.
	public static void q7() {
		String height = "125.5";
		double tall = Double.parseDouble(height);
		if(tall >= 120) {
			System.out.println("�����̵�");
		}
		if(tall >= 130) {
			System.out.println("�θ޶���");
		}
		if(tall >= 140) {
			System.out.println("���Ǵ�Ǯ");
		}
	}
	
	// ����8. �� ���� a, b�� ����� �� �߿��� ���� 10�� ����� ���� ����Ͻÿ�.
	// ����)
	// 10�� ����� ������ 8�Դϴ�.
	public static void q8() {
		int a = 8;
		int b = 14;
		int diff1 = (a > 10) ? a - 10 : 10 - a;
		int diff2 = (b > 10) ? b - 10 : 10 - b;
		System.out.println(diff1 < diff2 ? a : b);
	}
	
	// ����9. �ֹε�Ϲ�ȣ(personalId)�� �м��Ͽ� ���̿� ������ ����Ͻÿ�.
	// ���� : ����⵵ - �¾�⵵ + 1
	// ���� : ������(-) ���� ���ڰ� '1', '3', '5'�̸� "����", '2', '4', '6'�̸� "����"
	// ����)
	// 28�� �����Դϴ�.
	public static void q9() {
		String personalId = "141212-3345678";
		Calendar calendar = Calendar.getInstance();
		int nowYear = calendar.get(Calendar.YEAR);
		String genderNo = personalId.substring(7, 8);
		String birthYear = "";
		switch(genderNo) {
		case "1":
		case "2": birthYear = 19 + personalId.substring(0, 2); break;
		case "3":
		case "4": birthYear = 20 + personalId.substring(0, 2); break;
		}
		int age = nowYear - Integer.parseInt(birthYear) + 1;
		String[] gender = {"����", "����"};
		System.out.println(age + "�� " + gender[Integer.parseInt(genderNo) % 2] + "�Դϴ�.");
	}
	
}