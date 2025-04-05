package LuoguExercise;

import java.io.*;
import java.util.*;

public class P1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int a[] = new int[100];
		int index = 0;
		while (n != 0) {
			a[index] = n;
			index++;
			n = Integer.parseInt(st.nextToken());
		}
		for (int i = index; i > 1; i--) {
			System.out.print(a[index]);
		}

	}

}
