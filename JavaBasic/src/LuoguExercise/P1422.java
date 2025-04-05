package LuoguExercise;

import java.util.Scanner;

public class P1422 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0;
		if (n <= 150) {
			sum = n * 0.4463;
		} else if (n <= 400) {
			sum = (n - 150) * 0.4663 + 150 * 0.4463;
		} else {
			sum = (n - 400) * 0.5663 + 250 * 0.4663 + 150 * 0.4463;
		}
		System.out.println(String.format("%.1f", sum));
	}

}
