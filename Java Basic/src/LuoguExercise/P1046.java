package LuoguExercise;

import java.io.*;
import java.util.*;

public class P1046 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
//		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
//			a[i] = sc.nextInt();
			a[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int hgt = Integer.parseInt(st.nextToken());
//		int hgt = sc.nextInt();
		hgt += 30;
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			if (hgt >= a[i]) {
				cnt++;
			}
		}
		System.out.print(cnt);

	}

}
