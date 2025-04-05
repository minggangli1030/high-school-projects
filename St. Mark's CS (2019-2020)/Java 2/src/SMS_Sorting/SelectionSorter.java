package SMS_Sorting;

import java.util.Arrays;

public class SelectionSorter extends SortRoutine{
	
	private int [] list = null;
	private int length;
	
	
	public SelectionSorter (int[] newList) {
		length = newList.length;
		list = Arrays.copyOf(newList, length);
			
	}
	@Override
	public int[] doSort() {
		
			for (int i = 0; i < list.length; i++) {
				int original = list[i];
				int min = 1000;
				int order = 0;
				for (int j = i; j < list.length; j++) {
					int number = list[j];
					if (number < min) {
						min = number;
						order = j;
					}
				}
				list[i] = min;
				list[order] = original;
			}
			return (list);
		}

}
