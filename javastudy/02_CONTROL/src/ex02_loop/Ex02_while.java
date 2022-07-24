package ex02_loop;

public class Ex02_while {

	public static void main(String[] args) {

		// while문
		// 특정 실행문을 반복할 때 사용한다.
		// while(조건문) {
		//		실행문
		// }
		//(if문과 똑같이 생김)
		
		int balance = 79350;
		int money = 450;
		// 통장 잔액이 79350일 때, 450원씩 계속 출금했을때의 통장 잔고를 모두 출력
		
		while(balance >= money) {
			System.out.println("잔액 " + balance + " 인출액" + money);
			balance -= money;
		}
		System.out.println();
		System.out.println("잔액 " + balance);
		
	}

}
