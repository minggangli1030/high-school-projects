package LuoguExercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class P1093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Student[] students = new Student[n];
		for (int i = 0; i < n; i++) {
			int id = i+1;
			int score_Chinese = sc.nextInt();
			int score_Math = sc.nextInt();
			int score_English = sc.nextInt();
			int score_Total = 0;
			Student s = new Student(id, score_Chinese, score_Math, score_English, score_Total);
			students[i] = s;
		}

		Arrays.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student a1, Student a2) {
				if (a1.score_Total != a2.score_Total) {
					return a2.score_Total - a1.score_Total;
				} else if (a1.score_Chinese != a2.score_Chinese) {
					return a2.score_Chinese - a1.score_Chinese;
				}
				{
					return a1.id - a2.id;
				}
			}
		});

		for (int i = 0; i < 5; i++) {
			System.out.println(students[i].id + " " + students[i].score_Total);
		}
	}

	static class Student {
		int id;
		int score_Chinese;
		int score_Math;
		int score_English;
		int score_Total;

		public Student(int id, int score_Chinese, int score_Math, int score_English, int score_Total) {
			this.id = id;
			this.score_Chinese = score_Chinese;
			this.score_Math = score_Math;
			this.score_English = score_English;
			this.score_Total = score_Chinese + score_Math + score_English;
		}
	}
}
