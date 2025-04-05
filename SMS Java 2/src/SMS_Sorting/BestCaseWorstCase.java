package SMS_Sorting;

import java.io.*;
import java.util.*;

public class BestCaseWorstCase {

	public static void main(String[] args) {

		int ListSize = 1000000;
		int ListMAX = 1000000;

		// System.out.println("Best:\n" + printList(makeBestCase(ListSize)));
		// System.out.println("Worst:\n" + printList(makeWorstCase(ListSize, ListMAX)));

		//
		// Best Case
		//

		System.out.println("Best Case: ");
		System.out.println("");
		long BSstartTime = System.currentTimeMillis();
		BubbleSorter b = new BubbleSorter(makeBestCase(ListSize));
		// System.out.println("Sorted:\n" + printList(b.doSort()));
		b.doSort();
		long BSendTime = System.currentTimeMillis();

		long BStotalTime = BSendTime - BSstartTime;
		long BStotalTimeSec = BStotalTime / 1000;
		System.out.println("Bubble Sort - Time milli = " + BStotalTime);
		System.out.println("Bubble Sort - Time sec Selection = " + BStotalTimeSec);
		System.out.println("");

		//

		long SLstartTime = System.currentTimeMillis();
		SelectionSorter s = new SelectionSorter(makeBestCase(ListSize));
		// System.out.println("Sorted:\n" + printList(s.doSort()));
		s.doSort();
		long SLendTime = System.currentTimeMillis();

		long SLtotalTime = SLendTime - SLstartTime;
		long SLtotalTimeSec = SLtotalTime / 1000;
		System.out.println("Selection Sort - Time milli = " + SLtotalTime);
		System.out.println("Selection Sort - Time sec Selection = " + SLtotalTimeSec);
		System.out.println("");

		//
		// Worst Case
		//

		System.out.println("Worst Case: ");
		System.out.println("");
		BSstartTime = System.currentTimeMillis();
		BubbleSorter bs = new BubbleSorter(makeWorstCase(ListSize, ListMAX));
		// System.out.println("Sorted:\n" + printList(b.doSort()));
		bs.doSort();
		BSendTime = System.currentTimeMillis();

		BStotalTime = BSendTime - BSstartTime;
		BStotalTimeSec = BStotalTime / 1000;
		System.out.println("Bubble Sort - Time milli = " + BStotalTime);
		System.out.println("Bubble Sort - Time sec Selection = " + BStotalTimeSec);
		System.out.println("");

		//

		SLstartTime = System.currentTimeMillis();
		SelectionSorter ss = new SelectionSorter(makeWorstCase(ListSize, ListMAX));
		// System.out.println("Sorted:\n" + printList(s.doSort()));
		ss.doSort();
		SLendTime = System.currentTimeMillis();

		SLtotalTime = SLendTime - SLstartTime;
		SLtotalTimeSec = SLtotalTime / 1000;
		System.out.println("Selection Sort - Time milli = " + SLtotalTime);
		System.out.println("Selection Sort - Time sec Selection = " + SLtotalTimeSec);

		// ListSize => the size of the list
		// ListMax => the maximum value of the possible element in the list

	}

	public static String printList(int[] l) {
		String lString = "";

		for (int i = 0; i < l.length; i++) {
			lString += l[i];
			if (i < l.length - 1) {
				lString += "\t";
			}
			if ((i + 1) % 10 == 0) {
				lString += "\n";
			}
		}

		// lString => the string object that it turned to list (l) into to print
		// l => the list of random values

		return lString;

	}

	
	public static int[] makeBestCase(int nNums) {
		
		int[] newList = new int[nNums];
		for (int i = 0; i < nNums; i++) {
			newList[i] = i + 1;
		}

		return newList;

	}

	public static int[] makeWorstCase(int nNums, int nMax) {

		int[] newList = new int[nNums];
		for (int i = 0; i < nNums; i++) {
			newList[i] = nMax;
			nMax--;
		}
		return newList;
	}
	
	
	
}
