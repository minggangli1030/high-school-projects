package Class4.Jul4;

public class MagicNumberSeven {

	public static void main(String[] args) {
		int i = 0;
		for (i = 0; i <= 100; i++) {
			if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
				continue;
			}

			System.out.print(i + " ");

		}
	}
}
