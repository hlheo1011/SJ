package ex02_loop;

public class Ex05_nested_for {

	public static void main(String[] args) {

		// for안에 for가 포함된다. (nested)
		// 진짜 많으면 for안에 for 안에 for 정도는 볼 수 있다. (3개 이상은 보기 어려움)
		
		// 1일차 1교시
		// 1일차 2교시
		// ...
		// 1일차 8교시
		// 2일차 1교시
		// ...
		// 3일차 8교시
		
		for (int day = 1; day <= 3; day++) {
			for(int hour = 1; hour <= 8; hour++) {
				System.out.println(day + "일차 " + hour + "교시");
			}
		}
		
		
		// 연습 (nested for문)
		// 구구단을 출력하라. 2x1 ~ 9x9까지
		for (int dan = 2; dan <= 9; dan++) {
			for (int number = 1; number <= 9; number++) {
				System.out.println(dan + " x " + number + " = " + (dan * number));
			}
		}
		
		
		// 연습 (nested for문)
		// 구구단을 출력하라. 2x1 ~ 5x5까지
		for (int dan = 2; dan <= 5; dan++) {
			for(int number = 1; number <= 9; number++) {
				System.out.println(dan + " x " + number + " = " + (dan * number));
				if(dan == 5 && number == 5) {
					break;
				}
			}
		}
		
		
		// 연습문제. 구구단
		for (int n = 1; n <= 9; n++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.print(dan + "x" + n + "=" + (dan * n) + "\t");
				}
			System.out.println();
		}
		

	}

}
