package Class4.Jul4;

public class SumofArray {

	public static void main(String[] args) {

		int[] a = new int[10];
		for (int i = 0; i <= 9; i++) {
			a[i] = i + 1;
		}

		int sum = 0;
		for (int i = 0; i <= 9; i++) {
			sum += a[i];
		}
		System.out.print(sum);

	}

}
