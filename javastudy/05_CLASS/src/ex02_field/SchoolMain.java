package ex02_field;

public class SchoolMain {

	public static void main(String[] args) {

		School school = new School();
		school.name = "경인중학교";
	
		Student student1 = new Student();
		student1.stuNo = "12345";
		student1.name = "가나다";
		
		Student student2 = new Student();
		student2.stuNo = "67890";
		student2.name = "라마바";

		
		school.students[0] = student1;
		school.students[1] = student2;

		
		for(int i = 0; i < school.students.length; i++) {
			System.out.println(school.students[i].stuNo);
			System.out.println(school.students[i].name);
		}
		
		
		
		
	}

}
