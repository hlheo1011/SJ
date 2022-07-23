package ex05_string;

public class Ex01 {

	public static void main(String[] args) {

		// 문자열 연결 연산자
		// 문자열이 포함된 + 연산은 연결의 의미
		
		String str1 = "자바" + "스크립트";
		String str2 = 100 + "번지";
		String str3 = 1 + 1 + "행사";
		String str4 = "1" + "+" + "1" + "행사";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		// + 연산을 이용한 문자열 만들기
		// 빈 문자열 ("")을 + 해 주면 된다.
		String str5 = 100 +""; // String.valueOf(100)과 동일. // 숫자 -> 문자열이 된다.
		System.out.println(str5);
		
				

	}

}
