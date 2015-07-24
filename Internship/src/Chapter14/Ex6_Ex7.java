package Chapter14;

public class Ex6_Ex7 {

	public static void main(String[] args) {
		Ex1_To_Ex5 student1 = new Ex1_To_Ex5("Emil Cholakov", (byte) 3, "UNSS", "PR",
				"emo.cholakov@gmail.com", "0888123456");

		student1.info();
		staticStudent();

		System.out.println(Ex1_To_Ex5.getCount());

	}

	static void staticStudent() {
		Ex1_To_Ex5 student2 = new Ex1_To_Ex5();
		Ex1_To_Ex5 student3 = new Ex1_To_Ex5();
		Ex1_To_Ex5 student4 = new Ex1_To_Ex5();

		Ex1_To_Ex5 student5 = new Ex1_To_Ex5("Emil Cholakov2", (byte) 3, "SU", "PR",
				"emo.cholakov2@gmail.com", "0888123456");
	}

}
