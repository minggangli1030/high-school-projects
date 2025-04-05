package SMS_Sorting;

import java.util.Arrays;

public class BubbleSorter extends SortRoutine{
	
	private int [] list = null;
	private int length;
	
	
	public BubbleSorter (int[] newList) {
		length = newList.length;
		list = Arrays.copyOf(newList, length);
			
	}
	
	@Override
	public int [] doSort() {
		
		int howManyRuns = 0;
		boolean Sorted = false;
		
		while  (!Sorted){
			boolean didSwap = false;
			for (int i=0; i<length-howManyRuns-1; i++) {
				if(list[i]>list[i+1]) {
					swap(i, i+1);
					didSwap = true;
				}
			}
			
			
			if (!didSwap) {
				Sorted = true;
			}
			howManyRuns ++;
		}
		
		return list;
	}
	
	private void swap(int low, int s) {
		int temp = list[low];
		list[low] = list[s];
		list[s] = temp;
	}
}
