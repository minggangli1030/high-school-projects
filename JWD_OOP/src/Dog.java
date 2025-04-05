

public class Dog extends Animal {

	private String legs;

	public Dog(String color, String gender, int age, int weight, String legs) {
		super(color, gender, age, weight);
		this.legs = legs;
	}

	public String getLegs() {
		return legs;
	}

	public void setLegs(String legs) {
		this.legs = legs;
	}

	@Override // Override注解
	public void move() {
		System.out.println("The dog is running.");
	}

	@Override
	public String toString() {
		return this.getColor() + "|" + this.getGender() + "|" + this.getAge();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Dog)) {
			return false;
		}

		Dog dog = (Dog) obj;
		if (this.getColor().equals(dog.getColor()) && this.getGender().equals(dog.getGender())
				&& this.getAge() == dog.getAge() && this.getWeight() == dog.getWeight()
				&& this.getLegs().equals(dog.getLegs())) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {

		// Animal animal = new Animal("black", "male", 2, 5);

		Animal animal2 = new Dog("black", "male", 2, 5, "4 legs");

		// animal.move();
		animal2.move();

		// Test equals
		Dog dog1 = new Dog("black", "male", 2, 5, "4 legs");
		Dog dog2 = new Dog("black", "male", 2, 5, "4 legs");

		System.out.println(dog1.equals(dog2));
		System.out.println(dog1.toString());
		System.out.println(dog1.hashCode());


	}
}
