

public class Student {

	private String name;
	private int age;
	private int score;

	public Student() {

	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if (School.getCurrentRole().equals("STUDENT")) {
			System.out.println("Student can not change their own score.");
		} else {
			this.score = score;
		}
	}
}
