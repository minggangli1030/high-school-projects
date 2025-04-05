package Class13.Jul17;

import java.util.Arrays;

public class JavaSortDES {
	
	public static void sort (int []a ) 
	{
		Arrays.sort(a);
		int i=0,j=a.length-1;
		while (i<j) 
		{
			int t = a[i];
			a[i] = a[j];
			a[j]=t;
			i++;
			j--;
			
		}
		
		// 作用：将顺序颠倒过来
	}

	public static void main(String[] args) 
	{
		
		int [] a = {20,0,4,103,70};
		Arrays.sort(a);
		sort(a);
		for (int i:a) 
		{
			System.out.println(i);
		}
		
	}

}
