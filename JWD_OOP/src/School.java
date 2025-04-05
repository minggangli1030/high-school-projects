public class School {

	public static String getCurrentRole() {
		return "STUDENT";
	}

	public void onboard(Student student) {
		System.out.println(student.getName() + " is onboarding.");
	}

	public static void main(String[] args) {

		School school = new School();
		Student ming = new Student("xiaoming", 15);

		school.onboard(ming);

		System.out.println(ming.getName());
	}
}
