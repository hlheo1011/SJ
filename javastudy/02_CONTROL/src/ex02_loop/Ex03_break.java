package ex02_loop;

public class Ex03_break {

	public static void main(String[] args) {

		// break문
		// switch 문을 종료할 때 사용한다.
		// 반복문(for, while)을 종료시킬 때 사용한다.
		
		/* while(true) {	 		// while(true) {}의 true는 항상 만족한다. = 무한 루프
		   if(조건문) {				// System.out.println(); 을 할 수 없다. 끝이 없어서 도달할수 없는 값.
			    break;				// 그래서 break를 써줘야 함
			}
		}
		 */
		
		// 모금 목표 : 1000000원
		// 한 번에 5000원씩 모금
		
		// 1회 모금액 50000원	현재 50000원
		// 2회 모금액 50000원	현재 100000원
		// ... 위와 같이 출력
		int total = 0;
		int money = 50000;
		int serial = 0;
		int goal = 1000000;
		while(true) {
			if(total >= goal) {
				break;
			}	
			total += money;
			serial++;
			System.out.println(serial + "회 모금액 " + money + "원" + "\t 현재 " + total + "원");
		}
	}

}
