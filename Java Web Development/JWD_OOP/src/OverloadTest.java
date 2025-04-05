// JAVA方法的重载 - Overload
// 必须在同一个class里面
// Overload 与 Override
public class OverloadTest {

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {

		OverloadTest overloadTest = new OverloadTest();

		System.out.println(overloadTest.add(1, 2));
		System.out.println(overloadTest.add(1, 2, 3));
	}
}
