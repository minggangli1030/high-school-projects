package LuoguExercise;

import java.util.*;

public class P2615 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[40][40]; // 从0开始计数
		int h = 0, l = n / 2;
		a[h][l] = 1;
		for (int i = 2; i <= n * n; i++) {
			if (h == 0 && l != n - 1) {
				h = n - 1;
				l++;
				a[h][l] = i;
			} else if (l == n - 1 && h != 0) {
				l = 0;
				h--;
				a[h][l] = i;
			} else if (h == 0 && l == n - 1) {
				h++;
				a[h][l] = i;
			} else {
				if (a[h - 1][l + 1] == 0) {
					h--;
					l++;
					a[h][l] = i;
				} else {
					h++;
					a[h][l] = i;
				}
			}

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println(" ");
		}

	}

}
