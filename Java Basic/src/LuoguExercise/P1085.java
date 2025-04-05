package LuoguExercise;

import java.io.*;
import java.util.*;

public class P1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 8;
		int day = 1;
		for (int i = 1; i <= 7; i++) {
			int out = sc.nextInt();
			int in = sc.nextInt();
			int sum = out + in;
			if (sum > max) {
				max = sum;
				day = i;
			}

		}
		if (max > 8) {
			System.out.print(day);
		} else {
			System.out.print(0);
		}

	}

}
