
public class P12 {

	public static void main(String[] args) {
		int number = 0;
		int cnt = 0;
			for (int j = 1; j <= Integer.MAX_VALUE; j++) {
				boolean divider = true;
				number += j;
				if (number % j == 0 && divider == true) {
					cnt++;
					if (cnt > 10) {
						System.out.print(number);
						return;
					}

				} else {
					cnt = 0;
					divider = false;
				}
			}

		}
	}


