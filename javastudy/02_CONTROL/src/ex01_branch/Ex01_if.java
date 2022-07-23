package ex01_branch;

public class Ex01_if {

	public static void main(String[] args) {

		// if문
		// 조건을 만족하는 경우에만 실행
		// if(조건){
		//		실행문
		// }	// 실행문이 한개밖에 없을때는 중괄호 생략 가능하나, 생략하지 말아라.
		
		int score = 15;
		if (score >= 60) {
			System.out.println("합격");
		}
		
		if (score < 60) {
			System.out.println("불합격");
		}

	}

}
