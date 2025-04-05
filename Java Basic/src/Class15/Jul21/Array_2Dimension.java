package Class15.Jul21;

public class Array_2Dimension {

	public static void main(String[] args) {
		int a [][] = new int [4][3];
		int n=1;
		for(int i=0;i<4;i++)
		{
			for (int j=0;j<3;j++)
			{
				a[i][j]=n;
				n++;
			}
		}
		for(int i=0;i<4;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println(" ");
		}
		

	}

}
