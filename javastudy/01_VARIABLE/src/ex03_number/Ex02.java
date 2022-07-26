package ex03_number;

public class Ex02 {

	public static void main(String[] args) {

		// 증감 연산
		// 1씩 증가하거나 감소하는 연산
		// 증가는 ++, 감소는 --를 사용한다.
		
		// 전위 연산(pre operator)
		// ++a
		// 변수 a의 값을 1 증가시키고 사용한다.
		int a = 1;
		int b = ++a;
		System.out.println(a);
		System.out.println(b);
		
		// 후위 연산(post oprator)
		// a++
		// 변수 a의 값을 사용하고나서 1 증가시킨다.
		int x = 1;
		int y = x++;
		System.out.println(x);
		System.out.println(y);
		
		// 연습
		int i = 1;
		int j = 1;
		int result = i++ + --j;
		// 계산 추론 //
		System.out.println(i);			// 2
		System.out.println(j);			// 0
		System.out.println(result);		// 1
		
		System.out.println();

		// 연습(내가낸 문제)
		int c = 3;
		int d = 6;
		int result1 = ++c + --d;
		int result2 = c++ + d--;
		int result3 = ++c + d--;
		int result4 = c++ + --d;
										// c = 7 , d = 2
		System.out.println(result1);	// 4 + 5 = 9
		System.out.println(result2);	// 4 + 5 = 9
		System.out.println(result3);	// 6 + 4 = 10
		System.out.println(result4);	// 6 + 2 = 8
		System.out.println();
		System.out.println(c);			// 6
		System.out.println(d);			// 7

	}

}
