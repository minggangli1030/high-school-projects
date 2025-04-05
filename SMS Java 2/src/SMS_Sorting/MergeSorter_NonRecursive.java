package SMS_Sorting;

import java.util.*;

public class MergeSorter_NonRecursive extends SortRoutine {

	private int[] list = null;
	private int[] tempList = null;
	private int myLength;

	public MergeSorter_NonRecursive(int[] newList) {
		myLength = newList.length;
		list = Arrays.copyOf(newList, myLength);
		tempList = new int[myLength];
	}

	@Override
	public int[] doSort() {
		int groupSize;
		for (groupSize = 2; groupSize < myLength - 1; groupSize *= 2) {

			for (int i = 0; i < myLength; i += groupSize) {

				int lo = i;
				int hi = i + groupSize - 1;
				if (hi>=myLength) {
					hi = myLength - 1;
				}
				int mid = lo + (hi - lo) / 2;
				//System.out.println("lo: " + lo + ", mid: " + mid + ", hi: " + hi);
				merge(lo, mid, hi);
				//System.out.println(Arrays.toString(list));
			}
		}
		int mid = groupSize/2-1;
		merge(0, mid, myLength-1);
		
		return list;
	}

	public void merge(int lo, int mid, int hi) {

		if (hi == myLength) {
			tempList[myLength - 1] = list[myLength - 1];
		} else {
			for (int k = lo; k <= hi; ++k) {
				tempList[k] = list[k];
			}

			// System.out.println("Before merge list is " + Arrays.toString(list));
			// System.out.println("Before merge tempList is " + Arrays.toString(tempList));

			int i = lo, j = mid + 1;
			for (int k = lo; k <= hi; k++) {

				if (i > mid) {
					list[k] = tempList[j++];
				} else if (j > hi) {
					list[k] = tempList[i++];
				} else if (tempList[j] < tempList[i]) {
					list[k] = tempList[j++];
				} else {
					list[k] = tempList[i++];
				}

			}
			// System.out.println("After merge list is " + Arrays.toString(list));
		}

	}

}
