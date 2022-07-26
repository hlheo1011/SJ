package ex02_writer;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONWirter {
	
	public static void m1() {
		// JSON
		// 1. JavaScript Object Notation
		// 2. 자바스크립트 객체 표기법
		// 3. 객체 : { }
		// 4. 배열 : [ ]
		
		// JSON-Jave(JSON in Jave) 라이브러리
		// 1. 객체 : JSONObject 클래스 (Map 기반)
		// 2. 배열 : JSONArray 클래스
		
		JSONObject obj = new JSONObject();
		obj.put("name", "허효림");
		obj.put("age", "30");
		obj.put("man", true);
		obj.put("height", 157.5);
		
		System.out.println(obj.toString());
		
	}
	
	
	public static void m2() {
		
		JSONObject obj1 = new JSONObject();
		obj1.put("name", "제임스");
		obj1.put("age", 30);
		
		JSONObject obj2 = new JSONObject();
		obj1.put("name", "에밀리");
		obj1.put("age", 40);
		
		JSONArray arr = new JSONArray();
		arr.put(obj1);
		arr.put(obj2);
		
		System.out.println(arr.toString());
		
	}
	
	public static void m3() {
		
		String str = "{\"name\":\"허효림\",\"age\":\"30\",\"man\":true,\"height\":157.5}";
		
		JSONObject obj = new JSONObject(str);
		
		String name = obj.getString("name");
		boolean man = obj.getBoolean("man");
		int age = obj.getInt("age");
		double height = obj.getDouble("height");
		
		System.out.println(name);
		System.out.println(man);
		System.out.println(age);
		System.out.println(height);
		
	}
	
	public static void main(String[] args) {
		m3();		
	}

	
}
