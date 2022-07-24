package ex01_branch;

public class Ex03_else_if {

	public static void main(String[] args) {

		// else if문
		// 조건이 여러 개 사용되는 경우에 각 조건을 처리한다.
		// if(조건) {
		//		실행문
		// } else if(조건) {
		//		실행문
		// } else if(조건) {
		//		실행문
		// }
		
		// 나이에 따른 결과 출력
		// 0 ~ 7   : 미취학아동
		// 8 ~ 13  : 초등학생
		// 14 ~ 16 : 중학생
		// 17 ~ 19 : 고등학생
		// 20 ~    : 성인
		
		int age = 20;
		if (age <= 7) {
			System.out.println("미취학아동");
		} else if (age <= 13) {
			System.out.println("초등학생");
		} else if (age <= 16) {
			System.out.println("중학생");
		} else if (age <= 19) {
			System.out.println("고등학생");
		} else {
			System.out.println("성인");
		}
		
		// 연습.
		// 월에 따른 계절 출력
		// 봄  : 3 ~ 5월
		// 여름 : 6 ~ 8월
		// 가을 : 9 ~ 11월
		// 겨울 : 12, 1 ~ 
		
		int month = 10;
		if (month < 1 || month > 12) {
			System.out.println("잘못된 월");
		} else if (month == 12 || month <= 2) {
			System.out.println("겨울");
		} else if (month <= 5) {
			System.out.println("봄");
		} else if (month <= 8) {
			System.out.println("여름");
		} else {
			System.out.println("가을");
		}
		
		// 연습문제.
		// 점수에 따른 학점
		// score	grade
		// 100 ~ 90 A
		// 89 ~ 80  B
		// 79 ~ 70  C
		// 69 ~ 60  D
		// 59 ~ 0   F
		
		int score = 80;
		char grade;
		if (score < 0 || score > 100) {
			grade = 'x';
		} else if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("점수 : " + score + "점" + "\t" + "학점 : " + grade + "등급");
		
		
		// 연습문제.
		// 오직 일 수만 고려
		// 1일이 수요일이다.
		// n일 후 무슨 요일인지 출력하기.
		int day = 1;
		int n = 1;
		String weekName;
		
		day += n;
		
		if (day % 7 == 1) {
			weekName = "수요일";
		} else if (day % 7 == 2) {
			weekName = "목요일";
		} else if (day % 7 == 3) {
			weekName = "금요일";
		} else if (day % 7 == 4) {
			weekName = "토요일";
		} else if (day % 7 == 5) {
			weekName = "일요일";
		} else if (day % 7 == 6) {
			weekName = "월요일";
		} else {
			weekName = "화요일";		
		}
		
		System.out.println(weekName);
	
		
		
		
	}

}
