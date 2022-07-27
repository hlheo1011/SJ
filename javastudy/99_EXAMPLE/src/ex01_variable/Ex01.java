package ex01_variable;

public class Ex01 {

	public static void main(String[] args) {

		// 연습문제 (2)
		// 연습문제 1번
		for(int n = 1; n <= 10; n++) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		
		// 연습문제 2번
		for(int n = 10; n >= 1; n--) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		
		// 연습문제 3번
		for(int n = 1; n <= 9; n++) {
			System.out.print("7x" + n + "=" + n * 7 + "\t");
		}
		
		System.out.println();
		
		// 연습문제 4번
		for(int n = 1; n <= 100; n++) {
			if(n % 3 == 0) {
				System.out.print(n + " ");
			}
		}
		
		System.out.println();
		
		// 연습문제 5번
		int total = 0;
		for(int n = 1; n <= 100; n++) {
			total += n;
		}
		System.out.println(total);
		
		// 연습문제 6번
		
		// 연습문제 7번
		int point = 5;
		String star = "";
		for(int n = 1; n <= point; n++) {
			star += "★";
		}
		System.out.println(star);
		
		// 연습문제 8번
		long balance = 69450;
		int dis = 25000;
		while(balance >= dis) {
			System.out.println("인출액" + dis + "\t" +"남은금액" + balance);
			balance -= dis;
		}
		System.out.println("남은 금액" + balance);
		
		// 연습문제 9번
		int total2 = 0;
		int money = 50000;
		int serial = 0;
		int goal = 1000000;
		while(true) {
			if(total2 >= goal) {
				break;
			}
			total2 += money;
			serial++;
			System.out.println(serial + " " + money + " " + total2);
		}
		
		// 연습문제 10번
		int total3 = 0;
		int n = 0;
		while(n < 100) {
			n++;
			if(n % 3 != 0) {
				total3 += n;
			}
		}
		System.out.println(total3);
		
		// 연습문제 11번
		for(int day = 1; day <= 3; day++) {
			for(int study = 1; study <= 8; study++) {
			System.out.print(day + "일차" + study + "교시 ");
			}
		}
		
		System.out.println();
		// 연습문제 12번 
		for(int dan = 2; dan <= 9; dan++) {
			for(int number = 1; number <= 9; number++) {
				System.out.print(dan + "x" + number + "=" + (dan * number + " "));
			}
		}
		
		System.out.println();
		System.out.println();
		// 연습문제 13번
		for(int dan = 2; dan <= 5; dan++) {
			for(int number = 1; number <= 9; number++) {
				System.out.print(dan + "x" + number +"=" + (dan * number + " "));
				if(number == 5 && dan == 5) {
					break;
				}
			}
		}
		
		System.out.println();
		System.out.println();
		// 연습문제 14번
		
		for(int a = 1; a <= 9; a++) {
			for(int dan = 2; dan <= 9; dan++) {
				System.out.print(dan + "x" + a + "=" + (dan * a) + "\t");
			}	System.out.println();
		}


		
		
		// 3. 문자열 길이 반환
		String name = "우영우는사랑이다";
		System.out.println(name.substring(4, 8));

	}

}
