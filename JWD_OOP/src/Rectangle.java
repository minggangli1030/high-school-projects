
public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		super();
		this.setLength(length);
		this.setWidth(width);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public void getArea() {
		System.out.println(this.getLength() * this.getWidth());
	}

	@Override
	public void getPerimeter() {
		System.out.println(2 * (this.getLength() + this.getWidth()));
	}

	public static void main(String[] args) {

		Shape rectangle1 = new Rectangle(1, 2);
		Shape rectangle2 = new Rectangle(13424234, 91291);
		Shape rectangle3 = new Rectangle(123, 321);

		rectangle1.getArea();
		rectangle1.getPerimeter();
		rectangle2.getArea();
		rectangle2.getPerimeter();
		rectangle3.getArea();
		rectangle3.getPerimeter();

	}

}
