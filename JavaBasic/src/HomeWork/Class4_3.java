package HomeWork;

import java.util.Scanner;

public class Class4_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int number = sc.nextInt();
		int x = number;
		int sum = 1;
		for (int i = 0; i < x; i++) {
			number = x - i;
			sum = sum * number;
		}
		System.out.println(x + "!= " + sum);

	}
}
