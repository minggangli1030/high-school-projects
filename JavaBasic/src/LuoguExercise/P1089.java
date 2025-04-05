package LuoguExercise;

import java.io.*;
import java.util.*;

public class P1089 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int save = 100;
		int sum = 0;
		int mom = 0;
		for (int i = 1; i <= 12; i++) {
			int plan = sc.nextInt();
			sum = sum + 300 - plan;
			if (sum > save) {
				int ems = sum / save * 100;
				mom = mom + ems;
				sum = sum - ems;
			}
			if (sum < 0) {
				System.out.print("-" + i);
				break;
			}

		}
		if (sum > 0) {
			double last = mom * 1.2 + sum;
			int p = (int)last;
			System.out.print(p);
		}

	}

}
