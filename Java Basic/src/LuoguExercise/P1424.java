package LuoguExercise;

import java.util.Scanner;

public class P1424 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (x >= 1 && x <= 5) {
				sum += 250;
			}
			x++;
			if (x > 7) {
				x %= 7;
			}
		}
		System.out.println(sum);
	}

}

//方法二
//for (int i = 1; i <= n; i++) {
//	if (x != 6 && x != 7) {
//		s += 250;
//	}
//	
//	if(x==7) {
//		x=1;
//	} else {
//		x++;
//	}
//}