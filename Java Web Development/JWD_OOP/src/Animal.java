

public abstract class Animal {

	private String color;
	private String gender;
	private int age;
	private int weight;

	public Animal(String color, String gender, int age, int weight) {
		super();
		this.color = color;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public abstract void move();
}
