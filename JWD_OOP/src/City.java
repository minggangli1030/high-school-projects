
public class City {

	String name;
	double latitude;
	double longitude;

	@Override
	public String toString() {
		return this.name + "|" + this.latitude + "|" + this.longitude;
	}

	public static void main(String[] args) {

		City Shenzhen = new City();
		Shenzhen.name = "Shenzhen";
		Shenzhen.latitude = 22.5431;
		Shenzhen.longitude = 114.0579;

		City Southborough = new City();
		Southborough.name = "Southborough";
		Southborough.latitude = 42.3057;
		Southborough.longitude = 71.5245;

		City Boston = new City();
		Boston.name = "Boston";
		Boston.latitude = 42.3601;
		Boston.longitude = 71.0589;

		System.out.println(Shenzhen.toString());
		System.out.println(Southborough.toString());
		System.out.println(Boston.toString());

	}

}
