
public class Circle extends Shape {

	private int radius;

	public Circle(int radius) {
		super();
		this.setRadius(radius);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void getArea() {
		System.out.println(PI * (this.getRadius()) * (this.getRadius()));
	}

	@Override
	public void getPerimeter() {
		System.out.println(PI * 2 * this.getRadius());
	}

	public static void main(String[] args) {

		Shape circle1 = new Circle(7);
		Shape circle2 = new Circle(999);
		Shape circle3 = new Circle(1);

		circle1.getArea();
		circle1.getPerimeter();
		circle2.getArea();
		circle2.getPerimeter();
		circle3.getArea();
		circle3.getPerimeter();
	}

}
