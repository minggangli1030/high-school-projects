package SMS_Sorting;

import java.util.Arrays;

public class InsertionSorter extends SortRoutine{
	
	private int [] list = null;
	private int length;
	

	public InsertionSorter (int[] newList) {
		length = newList.length;
		list = Arrays.copyOf(newList, length);
			
	}

	@Override
	public int[] doSort() {
		
		for (int i = 1; i < list.length; i++) {
			int temp = list[i];
			int j = i-1;
			
			while(j>=0 && list[j]>temp ) {
				list[j+1] = list[j]; // moves j value
				j--;
			}
			list[j+1] = temp;
			
		}
		return (list);
	}



}
