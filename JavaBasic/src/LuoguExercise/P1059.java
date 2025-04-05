package LuoguExercise;

import java.util.Scanner;

public class P1059 {

	public static void main(String[] args) {
		int [] nmb = new int[1001];// 每一个数出现的次数

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 随机数的个数

		for (int i = 1; i <=n ; i++) 
		{
			int t = sc.nextInt();//记录每个数出现的次数
			nmb[t]++;
		}
		int  cnt=0;
		for (int i=1; i<1000;i++) 
		{
			if (nmb[i]!=0) // 只要 一个数出现了大于等于一次，就都输出一次
			{
				cnt++;
			}
		}
		System.out.println(cnt); 
		for (int i=1; i<1000;i++) 
		{
			if (nmb[i]!=0)
			{
				System.out.print(i + " ");;
			}
		}

	}

}
