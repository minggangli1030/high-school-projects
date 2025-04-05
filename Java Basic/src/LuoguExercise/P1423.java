package LuoguExercise;

import java.util.Scanner;

public class P1423 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dst = sc.nextDouble();
		double sum = 0;
		double step = 2;
		int cnt = 0;
		while(sum<dst) {
			sum = sum + step;
			cnt++;
			step = step * 0.98;
			if(cnt<=0) {
				break;
			}
			
		}
		System.out.println(cnt);
	}

}
