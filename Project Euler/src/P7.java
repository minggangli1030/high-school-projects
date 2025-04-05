import java.util.Arrays;

public class P7 {

	public static void main(String[] args) {
		
		int index = 0;
		int ans =0;
		for (int i = 2; i <= 10000000; i++) {
			int cnt = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					cnt++;
					break;
				}
			}
			if (cnt == 0) {
				ans = i;
				index++;
				if (index==10001) {
					System.out.print(ans);
				}
			}


		}

	}
}
