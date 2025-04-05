package HomeWork;

public class Class4_1 {

	public static void main(String[] args) {
		for (int i = 50; i <= 250; i++) {
			if (i % 5 == 0 || i % 10 == 5 || i / 10 == 5 || i/10%10 == 5) {
				continue;
			}

			System.out.print(i + " ");

		}

	}

}
