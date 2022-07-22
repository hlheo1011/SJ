package ex03_number;

public class Ex01 {

	public static void main(String[] args) {

		// 산술 연산
		// /와 %의 계산이 중요함
		int a = 7;
		int b = 2;
		int result1 = a + b; // 9
		int result2 = a - b; // 5
		int result3 = a * b; // 14
		int result4 = a / b; // 3		// 나눈 몫의 값
		int result5 = a % b; // 1		// 나누고 난 뒤 나머지 값
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		// 연습
		// 25를 2와 5로 나눠보세요. 몫이 2고 나머지가 5로 나오게.
		int c = 25;
		int d = 10;
		int result6 = c / d;
		int result7 = c % d;
		
		System.out.println(result6);
		System.out.println(result7);
		
		// 연습
		// 90초를 1분이랑 30초로 나눠보기
		int second = 90;
		int result8 = second / 60;
		int result9 = second % 60;
		
		System.out.println(result8);
		System.out.println(result9);
		
		// 연습
		// a = 7이고, b = 2이므로
		// a 나누기 b 는 3.5이다.
		
		int result10 = a / b;
		System.out.println("result10: " + result10);
		System.out.println("result10의 결과는 데이터타입을 int로 주었기 때문에 소수점이 잘린 3으로 표현된다.");
		System.out.println();
		
		double result11 = a / b;
		System.out.println("result11: " + result11);
		System.out.println("result11의 결과는 데이터타입을 double로 주었지만 결과값만 double로 준거기 때문에,");
		System.out.println("a와 b의 계산은 정수(int)로 계산하여서 이미 소수점이 잘려서 계산되었다.");
		System.out.println();
		
		double result12 = (double)a / b;
		System.out.println("result12: " + result12);
		System.out.println("result12의 결과는 결과값의 데이터값도 실수, 계산도 castion을 해주었기 때문에 결과값은 3.5이다");
		// 실수와 정수의 계산은 실수로 promotion 해주어서 계산된다. 따라서 b앞에는 강제형변환을 안시켜도 된다.
		
		
		
		

	}

}
