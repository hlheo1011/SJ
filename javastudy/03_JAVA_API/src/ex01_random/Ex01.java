package ex01_random;

public class Ex01 {

	public static void main(String[] args) {

		// 난수(Random number)발생
		// Random 클래스, Math 클래스를 주로 활용한다.
		// 인증코드 랜덤 숫자로 활용 가능하다.
		
		System.out.println("Math.random 명령어 : " + Math.random());
		
		// 0.0 ~ 1.0 사이의 숫자 확률
		// 0% ~ 100% 의 의미와 같다고 볼 수 있다.
		
		// 1. 확률 처리하기
		// 10% 확률로 "대박", 90% 확률로 "쪽박"
		if(Math.random() < 0.1) {
			System.out.println("대박");
		} else {
			System.out.println("쪽박");
		}
		
		// 2. 난수 값 생성
		
		// Math.random()					0,0 <= n < 1.0
		// Math.random() * 5 				0.0 <= n < 5.0
		// (int)(Math.random() * 5)			0   <= n < 5				// 강제 형 변환
		// (int)(Math.random() * 5) + 1		1   <= n < 6	

		// 예제
		// 주사위 2개 던지기		
		for(int n = 0; n < 2; n++) {
			int dice = (int)(Math.random() * 6) + 1;
			System.out.println("주사위 : " + dice);
		}
		
		
		// 예제
		// 6자리 인증번호 만들기
		String code = "";
		for(int n = 0; n < 6; n++) {
			code += (int)(Math.random() * 10);
		}
		System.out.println(code);
		
		// 아스키 코드
		// 48 = '0'
		// 65 = 'A' ~ 90 = 'Z'
		// 97 = 'a'
		
		// 1 + 1.5 =				// 정수와 실수 계산은 자동캐스팅으로 계산 해준다
		// 1 + 'A';	
		
		
		// 연습
		// 대문자와 소문자를 말 그대로 랜덤하게 섞어서 6자리
		code = "";
		for(int n = 0; n < 6; n++) {
			if(Math.random() < 0.5) {
			code += (char)(int)((Math.random() * 26) + 'a');	
		} else {
			code += (char)(int)((Math.random() * 26) + 'A');
			}
		}
		System.out.println(code);
		
		
	}

}
