package LuoguExercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1068_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Student[] students = new Student[n];
		for (int i = 0; i < n; i++) {
			int id = sc.nextInt();
			int score = sc.nextInt();
			Student s = new Student(id, score);
			students[i] = s;
		}

		Arrays.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student a1, Student a2) {
				if (a1.score != a2.score )
				{
				return a2.score - a1.score;
				}
				else 
				{
					return a1.id-a2.id;
				}
			}
		});
		for (int i = 0; i < n; i++) {
			System.out.println(students[i].id + " " + students[i].score);
		}

	}

	static class Student {
		int id;
		int score;

		public Student(int id, int score) {
			this.id = id;
			this.score = score;
		}
	}

}
