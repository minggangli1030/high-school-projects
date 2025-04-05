package LuoguExercise;

import java.io.*;
import java.util.*;

public class P1425 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int x = (c-a)*60;
		int y = d-b + x;
		int e = y/60;
		int f = y%60;
		

		System.out.print(e + " " + f);

	}

}
