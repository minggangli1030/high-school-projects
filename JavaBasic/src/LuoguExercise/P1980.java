package LuoguExercise;

import java.util.Scanner;

public class P1980 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int cnt=0;
		for(int i=1;i<=n;i++) {
			int k=i;
			while(k>0) {
				if(k%10==x) {
					cnt++;
				}
				k/=10;
			}
		}
		System.out.println(cnt);
	}

}
