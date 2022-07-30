package ex03_string;

public class Ex01_String {

	public static void main(String[] args) {
		
		// 같은 번지수 저장
		String str1 = "hello";
		String str2 = "hello";					
		System.out.println(str1 == str2); // true
		
		// 다른 번지수 저장
		String str3 = new String("hi");
		String str4 = new String("hi");
		System.out.println(str3 == str4); // false
		
		// 다른 번지수 저장이니 false라는 결과 값이 나온다.
		// 그래서 "문자열"자체를 비교 할때는 비교연산을 등호로 쓰면 안된다.
		
		// 1. 문자열 동등 비교
		// - 문자열을 동등 비교할때는 equals라는 메소드를 써야한다.
		// 메소드를 호출하는 법은 클래스를 이용한 호출법과, 객체를 이용한 호출법이 있다.
		// 아래 예시는 객체를 이용한 호출법이다.
		// Sting str3 = 은 객체이다.
		// 아래 예시는 참조값(번지수)를 비교하는게 아니라, 문자열을 비교하는 것이다.
		
		// 같을 때 비교.
		boolean result1 = str1.equals(str2);
		boolean result2 = str3.equals(str4);
		System.out.println(result1);
		System.out.println(result2);
		
		// 다를 때 비교.
		if(str1.equals(str2)) {
			System.out.println("str1, str2는 같아요");
		} else {
			System.out.println("str1, str2는 달라요");
		}
		
		if(!str3.equals(str4)) {
			System.out.println("str3, str4는 달라요");
		} else {
			System.out.println("str3, str4는 같아요");
		}
		// 부정문은 가급적 사용하지 않는다.
		
		// 2. 대소문자를 무시한 문자열 동등 비교.
		// (예를 들면 ID 칠때 대소문자 무시)
		String str5 = "Hello World";
		String str6 = "hELLO wORLD";
		boolean result3 = str5.equalsIgnoreCase(str6);
		System.out.println(result3);
		
		// 3. 문자열 길이 반환
		String name = "홍길동";
		int length = name.length();
		System.out.println("글자수 : " + length);
		// 공백도 글자수에 포함
		// 아스키 코드넘버 : 32번
		
		// 4. 특정 위치의 문자만 반환.
		// 특정위치는 인덱스(Index)라고 한다.
		// 글자마다 부여된 정수값.
		// 0으로 시작
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		System.out.println();
		
		// 5. 문자열의 일부 문자열(String)을 반환
		// 	1) substring(begin) " 인덱스 begin(인덱스 포함)부터 끝까지 반환
		//  2) substring(begin, end) : 인덱스 begin(인덱스 포함)부터 인덱스 end(불포함)까지 반환
		System.out.println(name.substring(1));		// 두번째 글자뿌터 끝까지
		System.out.println(name.substring(0,3));	// 첫번째 글자만
		
		// 6. 특정 문자열을 찾아서 해당 인덱스(int)를 반환
		//	1) indexOf
		//		(1) 발견된 첫 번째 문자열의 인덱스를 반환
		//		(2) 발견된 문자열이 없는 경우 -1을 반환
		//	2) lastIndexOf
		//		(1) 발견된 마지막 문자열의 인덱스를 반환
		//		(2) 발견된 문자열이 없는 경우 -1을 반환
		int idx1 = name.indexOf("홍"); 		// 홍은 인덱스가 0 이므로, 0
		int idx2 = name.indexOf("홍길동");		// 길동에서 첫번째 인덱스인 '길'먼저 인식해서 1.
		System.out.println("indexOf : " + idx1);
		System.out.println("indexOf : " + idx2);
		
		int idx3 = name.lastIndexOf("동"); 	// 동은 인덱스가 2 이므로, 2
		int idx4 = name.lastIndexOf("홍길동"); // 길동에서 마지막(last)인덱스인 '동'을 인식해서 2.
		System.out.println("lastInderxOf : " + idx3);
		System.out.println("lastInderxOf : " + idx4);
		
		
	}

}
