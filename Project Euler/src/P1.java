
public class P1 {

	public static void main(String[] args) {
		int ans = 0; 
		for (int x=0;x<1000;x++) {
			if (x%3==0 || x%5==0) {
				ans = ans + x;
			}
		}
		System.out.print(ans);

	}

}
