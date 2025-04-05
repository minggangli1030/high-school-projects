
public class Quiz_on_JavaConceptsCH6_Arrays {

	public static void main(String[] args) {
		int[][] data = { { 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1 },
				{ 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1 } };

		for (int i = 0; i < 6; i++) {
			{
				System.out.print("[");
				for (int j = 0; j < 6; j++) {
					if (j < 5) {
						System.out.print(data[i][j] + ", ");
					} else {
						System.out.print(data[i][j]);
					}
				}
				System.out.print("]");
				System.out.println();
			}
		}

	}

}
