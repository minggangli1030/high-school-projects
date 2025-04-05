package LuoguExercise;

import java.io.*;
import java.util.*;

public class P1055_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine();
		int sum = 0;
		int n = 1;
		for (int i = 0; i < 11; i++) {
			if (s.charAt(i) == '-') {
				continue;
			}

			int k = s.charAt(i) - '0';
			sum = sum + k * n;
			n++;
		}

		int m = sum % 11;
		char Verifier;
		if (m == 10) {
			Verifier = 'x';
		} else {
			Verifier = (char) (m + '0');
		}

		if (s.charAt(12) == Verifier) {
			System.out.print("Right");
		} else {
			String s1 = s.substring(0, 12);
			System.out.print(s1 + Verifier);
		}
			// 问题：凭什么Char取得就是最后一个数
	}
}
