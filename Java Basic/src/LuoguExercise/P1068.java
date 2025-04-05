package LuoguExercise;

import java.util.*;

public class P1068 {

	public static void main(String[] args) {
		int[] id = new int[5001];// 表示学号
		int[] score = new int[5001];// 表示分数
		int[] cnt = new int[101];// 表示每个分数有多少人

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 报名总人数
		int m = sc.nextInt(); // 预计录取人

		for (int i = 0; i < n; i++) {
			id[i] = sc.nextInt();// 将学号导入
			score[i] = sc.nextInt(); // 将分数导入
			cnt[score[i]]++;//记录同分选手的个数
		}
		// 按照分数排序选手（分数+学号）
		for (int i = n; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				if (score[j] < score[j + 1]) {
					// 交换分数
					int t = score[j];
					score[j] = score[j + 1];
					score[j + 1] = t;
					// 交换学号
					int q = id[j];
					id[j] = id[j + 1];
					id[j + 1] = q;
				}
			}
		}

		// 同分选手按照学号排序
		for (int i = 0; i < n;) {
			for (int j = i + cnt[score[i]] - 1; j > i; j--) {
				for (int k = i; k < j; k++) {
					if (id[k] > id[k + 1]) {
						// 交换学号
						int q = id[k];
						id[k] = id[k + 1];
						id[k + 1] = q;
					}
				}
			}
			i+=cnt[score[i]];
		}

		
		for (int i = 0; i < n; i++) {
			System.out.println(id[i] + " " + score[i]);
		}

	}

}
