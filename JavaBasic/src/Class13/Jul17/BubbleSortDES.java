package Class13.Jul17;

public class BubbleSortDES {

	public static void main(String[] args) {
		int[] arr= {5,8,9,3,4};
		// Bubble Sort DES
		for (int i=arr.length-1;i>=1;i--) 
		{
			for (int j=0;j<i;j++) 
			{
				if(arr[j]<arr[j+1]) 
				{
					int t = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				} 
			}
		}
		for (int x:arr) 
		{
			System.out.print(x + " ");
		}

	}

}
