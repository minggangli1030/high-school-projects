package Class5.Jul7;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("请输入要求多少以内的质数");
		int x = number.nextInt();
		int[] a = new int[x];
		int index = 0;
		for (int i = 2; i <= x; i++) {
			int cnt = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					cnt++;
					break;
				}
			}
			if (cnt == 0) {
				a[index] = i;
				index++;
			}

		}
		System.out.println("共有" + index + "个质数");
		System.out.print("以下都是质数: ");
		for (int i = 0; i < index; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
