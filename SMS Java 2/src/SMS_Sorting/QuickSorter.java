package SMS_Sorting;

import java.util.Arrays;

public class QuickSorter extends SortRoutine {

	private int[] list = null;
	private int myLength;

	public QuickSorter(int[] newList) {
		myLength = newList.length;
		list = Arrays.copyOf(newList, myLength);
	}

	@Override
	public int[] doSort() {
		int start = 0;
		int end = myLength - 1;
		sort(start, end);
		return list;

	}

	public void sort(int s, int e) {
		if (s < e) {
			int pi = partition(s, e);
			sort(s, pi - 1);
			sort(pi + 1, e);
		}
	}

	public int partition(int s, int e) {

		int pivotNum = list[s];
		int p1 = s + 1, p2 = e;

		while (p1 <= p2) {
			if (list[p1] <= pivotNum) {
				p1++;
			} else if (list[p2] > pivotNum) {
				p2--;
			} else {
				swap(p1, p2);
				p1++;
				p2--;
			}
		}
		swap(p1 - 1, s);
		return p1 - 1;
	}

	private void swap(int low, int s) {
		int temp = list[low];
		list[low] = list[s];
		list[s] = temp;
	}

}
