
public class P9 {

	public static void main(String[] args) {
		for (int c=1;c<1000;c++) {
			for (int a=1;a<1000;a++)
			{
				int b=1000-a-c;
				if (a*a + b*b == c*c && a>=0 && b>=0 && c>=0) {
					System.out.println(a*b*c);
				}
			}
		}

	}

}
