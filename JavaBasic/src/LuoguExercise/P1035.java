package LuoguExercise;

import java.util.Scanner;

public class P1035 {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int k = number.nextInt();
		double sum = 0;
		double n = 1;
		while (sum < k) {
			sum = sum+ 1/n;
			n++;
		}
		int m = (int)n;
		System.out.print(m-1);
	}

}
