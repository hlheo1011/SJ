package ex03_method;

public class CalculatorMain {

	public static void main(String[] args) {
		// ��ü ����
				Calculator calculator = new Calculator();
				
				// caculator ��ü�� add() �޼ҵ� ȣ��
				
				// 1. 2, 3 : �μ�(add �޼ҵ�� �����ϴ� ��), �μ��� �Ű������� ����ȴ�.
				// 2. answer : add �޼ҵ��� ��ȯ��(return result)�� ����ȴ�.
				int answer = calculator.add(2, 3);	
				System.out.println(answer);
				
				// sub() �޼ҵ� ȣ��
				System.out.println(calculator.sub(100,85));
				
				// mul() �޼ҵ� ȣ��
				System.out.println(calculator.mul(3,15));
				
				// div() �޼ҵ� ȣ��
				System.out.println(calculator.div(7,2));
				


	}

}
