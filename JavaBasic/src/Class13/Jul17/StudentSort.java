package Class13.Jul17;

import java.util.*;

public class StudentSort {

	static class Student {
		int id;
		String name;

		public Student(int id, String name) {
			this.id = id;
			this.name = name;
		}
	}

	public static void main(String[] args) {
		// Object sort
		Student[] students = new Student[5];
		for (int i = 0; i < 5; i++) {
			int id = i + 1;
			Student s = new Student(id, "name" + id);
			students[i] = s;
		}

		Arrays.sort(students, new Comparator<Student>() {

			@Override // 本质上在这里并没有什么用
			public int compare(Student o1, Student o2) {
				return o1.id - o2.id; // ASC
//						return o2.id - o1.id;   // DES
			}
		});

		for (Student s : students) {
			System.out.println(s.id + " " + s.name);
		}

	}

}
