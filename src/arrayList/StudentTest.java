package arrayList;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("English", 100);
		studentLee.addSubject("Math", 50);
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addSubject("English", 70);
		studentKim.addSubject("Math", 85);
		studentKim.addSubject("French", 100);
	
		studentLee.showMarkInfo();
		System.out.println("=========================");
		studentKim.showMarkInfo();
		
	}

	

}