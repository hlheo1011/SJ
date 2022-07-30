package ex02_datetime;

public class Ex01_System {

	public static void main(String[] args) {

		// System.out.println(); �� System�̴�.
		
		// 1. Ÿ�ӽ�����(timestamp)
		// ��� ������, �߿���, ������� �� �� �ʿ�
		// 1970-01-01 0:00���� 1/1000�ʸ��� �����ϴ� long Ÿ���� ������ (1�ʿ� ���� 1000�� ������)
		long timestamp = System.currentTimeMillis();
		System.out.println(timestamp);
		
		// 2. ����Ÿ��(nanoTime) (�ð�������)
		// ���� ������ ���� // ���߿���
		/* s(second) 
		   > ��(�и�����)(õ���� 1��)
		   > ��(����ũ�μ���)(�鸸���� 1��)
		   > ��(���뼼��)(�ʾ���� 1��) ('��' �� ����) */
		// ������(��) ���� ������ long Ÿ���� ������
		// � �������ڴ� ��� �� ���� ������(��) ������ ����ð� ����
		long beginTime = System.nanoTime();
		int total = 1 + 2 + 3 + 4 + 5;
		long endTime = System.nanoTime();
		System.out.println(total + "��꿡 �ɸ� �ð� : " + (endTime - beginTime) + "��");


	}

}
