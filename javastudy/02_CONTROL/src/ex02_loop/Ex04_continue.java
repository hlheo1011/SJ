package ex02_loop;

public class Ex04_continue {

	public static void main(String[] args) {
		
		// continue��
		// �ݺ����� ���� �������� �̵��Ѵ�.
		// ���࿡�� ������ �ڵ尡 �ִ� ��쿡 ����Ѵ�.
		// (continue��.. ���ξ��ص� ��. (��ü �ڵ尡 ����))
		// (continue�� ���� ���� ���� �ڵ尡 �ƴ�.)
		// (�̷��� �ִٶ�� �Ұ����� �ϴ� ����)
		
		// 1 ~ 100 �߿��� 3�ǹ���� �����ϰ� ��� ���ϱ�
		int total = 0;
		int n = 0;
		
		while(n < 100) {			// �� 
									// 	��
			n++;					// 	��
									//	�� 
			if(n % 3 == 0) {		// 	��
				continue;			// ��
			}
			
			total += n;
		}
	
		System.out.println("�հ�(continue) " + total);
		
		// �����ڵ�
		total = 0;
		n = 0;
		while(n < 100) {
			n++;
			if(n % 3 != 0) {
				total += n;
			}
		}
		
		System.out.println("�հ�(if) " + total);
		// continue ���� �ڵ带 ����� �� ������ �����ϴ�.
		
		/*/		
		while() {
			a;
			b;
			c;
			continue;  // a b c �� �����ϰ� �ٽ� while()������ �̵��Ѵ�. 
			// �׷��� ���� �ݺ��� �ǹǷ� ���� if contune; �� ����. (Ư�� ���� ������ ����)
			d;
			e;
			f;
			g;
			h;
		}
		/*/

	}

}