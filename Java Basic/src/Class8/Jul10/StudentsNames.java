package Class8.Jul10;

public class StudentsNames {
	public static void main(String[] args) {
		Students s1 = new Students();
		s1.id = "20171001";
		s1.name = "王草";
		s1.sex = true;
		s1.cellphone = "18610022345";
		System.out.println("学号：" + s1.id + " 姓名：" + s1.name);
	}
}