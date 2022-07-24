package ex02_loop;

public class Ex01_for {

	public static void main(String[] args) {

		// for��
		// ���ӵ� ���ڸ� ������ �� �ַ� ����Ѵ�.
		// �迭�� �Բ� ���� ���ȴ�.
		// for(�ʱ⹮; ���ǹ�; ������) {
		//		���๮
		// }
		
		// 1 ~ 10
		// �ʱ⹮�� �����ϵ��� ������ �δ� ���̴�. (int n = 1;)
		// ���ǹ��� �񱳰� �ʿ��� (n <= 10)
		// �������� (++, --)
		for(int n = 1; n <= 10; n++) {
			System.out.print(n);
		}
		
		// �ʱ⹮ 1�� -> ���ǹ� ��, ���ǹ� ���� �� -> ���๮ -> ������
		// -> ������ǥ (���ǹ�..���๮..������..)	
		
		System.out.println();
		
		// ����.
		// 10 ~ 1.
		for(int n = 10; n >= 1; n--) {
			System.out.print(n);
		}
		
		System.out.println();

		// ����
		// ������ 7�� ���
		for(int n = 1; n <= 9; n++) {
			System.out.println("7x" + n + "=" + n * 7);
		}
		
		// ����
		// 1 ~ 100 ������ ��� 3�� ����� ����ϱ�
		for(int n = 1; n <= 100; n++) {
			if(n % 3 == 0) {
				System.out.print(n + " ");
			}	
		}
		
		System.out.println();
		
		// ����. for�� (���� ���� ���ø� ���� ����)
		// 1 ~ 100 ��� ���� ���ϱ� (5,050)
		int total = 0;
		for(int n = 1; n <= 100; n++) {
				total += n;
				}
		System.out.println(total);
		
		// ����
		// begin ~ end ��� ���� ���ϱ�
		// begin�� end�� ���� ū �� �𸣴� ��Ȳ
		// begin�� end���� �׻� ���� ������ �ٲٴ� �۾��� �� ��, begin ~ end ��� ���ϱ� ����
		// begin�� end���� ũ�ٸ� begin�� end�� ��ȯ

		int begin = 100;
		int end = 1;
		
		if(begin > end) {
			int temp;
			temp = begin;
			begin = end;
			end = temp;
		}
		
		int sum = 0;
		for(int n = begin; n <= end; n++) {
			sum += n;
		}
		System.out.println("sum�� �� " + sum);
		
		// ����
		// ����(1~5)�� ���� ��(��) ����ϱ�
		int point = 4;
		String star = "";
		
		for(int n = 1; n <= point; n++) {
				star += "��";
		}
		System.out.println(star);
		
		
		
	}

}
