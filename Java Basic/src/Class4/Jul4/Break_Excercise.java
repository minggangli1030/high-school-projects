package Class4.Jul4;

public class Break_Excercise {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}

			System.out.print(i + " ");
		}

	}

}

// break 只会跳出当前的循环，再由多个循环的时候不会跨循环执行停止
