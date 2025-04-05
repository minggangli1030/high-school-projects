package LuoguExercise;

import java.io.*;
import java.util.*;

public class P1428 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] a = new int[n]; // 每只鱼的可爱程度
		int[] b = new int[n]; // 不如它可爱的个数
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int cnt = 0;
			a[i] = Integer.parseInt(st.nextToken());
			for (int j = 0; j < i; j++) {
				if (a[j] < a[i]) {
					cnt++;
				}
			}
			b[i] = cnt;
			System.out.print(cnt + " ");

		}
	}

}
