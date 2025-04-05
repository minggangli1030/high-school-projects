

public class Rabbit extends Animal {

	private String legs;

	public Rabbit(String color, String gender, int age, int weight, String legs) {
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
		System.out.println("The rabbit is jumping.");
	}
}
