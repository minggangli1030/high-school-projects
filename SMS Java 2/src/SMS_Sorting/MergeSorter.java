package SMS_Sorting;

import java.util.Arrays;

public class MergeSorter extends SortRoutine{
	
	private int [] list = null;
	private int [] tempList = null;
	private int myLength;
	

	public MergeSorter (int[] newList) {
		myLength = newList.length;
		list = Arrays.copyOf(newList, myLength);
		tempList = new int[myLength];
	}

	
	
	public void merge(int lo, int mid, int hi) {
		
		for (int k = lo; k <=hi; k++) {
			tempList[k] = list[k];
		}
		
		int i = lo, j = mid + 1;
		for (int k = lo; k <= hi; k++) {
			
			if(i > mid) {
				list[k] = tempList[j++];
			}
			else if (j > hi) {
				list[k] = tempList[i++];
			}
			else if (tempList[j] < tempList[i]) {
				list[k] = tempList[j++];
			}
			else {
				list[k] = tempList[i++];
			}
		}
	}
	
	
	
	
	@Override
	public int[] doSort() {
		
		mergeSortIt(0, list.length-1);
		// printList();
		return list;
	}
	
	public void mergeSortIt(int lo, int hi) {
		
		if (hi <= lo) return;
		
		int mid = lo + (hi - lo)/2;
				
		mergeSortIt(lo, mid);
		mergeSortIt(mid + 1, hi);
		merge(lo, mid, hi);
		
		
	}
	
	private boolean isSorted(int lo, int mid) {
		
		boolean iAmSorted = true;
		for(int i = lo; i < mid; i++) {
			if (list[i] > list[i+1]) {
				iAmSorted = false;
			}
		}
		return iAmSorted;
	}
	
	public void printList() {
		System.out.println(Arrays.toString(list));
	}

}
