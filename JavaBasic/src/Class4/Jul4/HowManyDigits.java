package Class4.Jul4;

import java.util.Scanner;

public class HowManyDigits {

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		int cnt = 0;
		while (n > 0) {
			n /= 10;
			cnt++;
		}

		System.out.println(cnt);

	}

}
