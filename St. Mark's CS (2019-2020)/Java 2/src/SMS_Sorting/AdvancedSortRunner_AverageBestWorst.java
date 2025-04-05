package SMS_Sorting;

import java.io.*;
import java.util.*;

public class AdvancedSortRunner_AverageBestWorst {

	public static void main(String[] args) {

		int ListSize = 100000000;
		int ListMAX = 100000000;

//		int[] avgCase = makeAverageCase(ListSize, ListMAX);
//		int[] bestCase = makeBestCase(ListSize);
//		int[] worstCase = makeWorstCase(ListSize, ListMAX);

//		BubbleSorter b2 = new BubbleSorter(bestCase);
//		BubbleSorter b3 = new BubbleSorter(worstCase);
//		BubbleSorter b1 = new BubbleSorter(avgCase);
//		
//
//		SelectionSorter s2 = new SelectionSorter(bestCase);
//		SelectionSorter s3 = new SelectionSorter(worstCase);
//		SelectionSorter s1 = new SelectionSorter(avgCase);
//
//		
//		InsertionSorter i2 = new InsertionSorter(bestCase);
//		InsertionSorter i3 = new InsertionSorter(worstCase);
//		InsertionSorter i1 = new InsertionSorter(avgCase);
		
		
//		MergeSorter m2 = new MergeSorter(bestCase);
//		MergeSorter m3 = new MergeSorter(worstCase);
//		MergeSorter m1 = new MergeSorter(avgCase);
//		
//		MergeSorter_NonRecursive mn2 = new MergeSorter_NonRecursive(bestCase);
//		MergeSorter_NonRecursive mn3 = new MergeSorter_NonRecursive(worstCase);
//		MergeSorter_NonRecursive mn1 = new MergeSorter_NonRecursive(avgCase);

//		QuickSorter q2 = new QuickSorter(bestCase);
//		QuickSorter q3 = new QuickSorter(worstCase);
//		QuickSorter q1 = new QuickSorter(avgCase);

//		runSorter(b2, " Bubble  ", "Best");
//		runSorter(b3, " Bubble  ", "Worst");
//		runSorter(b1, " Bubble  ", "Average");
//		
//		runSorter(s2, "Selection", "Best");
//		runSorter(s3, "Selection", "Worst");
//		runSorter(s1, "Selection", "Average");
//		
//		runSorter(i2, "Insertion", "Best");
//		runSorter(i3, "Insertion", "Worst");
//		runSorter(i1, "Insertion", "Average");

//		runSorter(mn2, "  Merge Non", "Best");
//		runSorter(mn3, "  Merge Non", "Worst");
//		runSorter(mn1, "  Merge Non", "Average");
//
//		runSorter(m2, "  Merge  ", "Best");
//		runSorter(m3, "  Merge  ", "Worst");
//		runSorter(m1, "  Merge  ", "Average");

//		runSorter(q2, "  Quick  ", "Best");
//		runSorter(q3, "  Quick  ", "Worst");
//		runSorter(q1, "  Quick  ", "Average");

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

	public static int[] makeAverageCase(int size, int randNumMax) {

		int[] newList = new int[size];

		for (int i = 0; i < size; i++) {
			Random rand = new Random();
			int rand_int = rand.nextInt(randNumMax) + 1;
			newList[i] = rand_int;
		}

		return newList;
	}

	public static void runSorter(SortRoutine sorter, String type, String whichCase) {

		long startTime = System.currentTimeMillis();
		int[] sortedList = sorter.doSort();
		long endTime = System.currentTimeMillis();

		long totalTime = endTime - startTime;
		long totalTimeSec = totalTime / 1000;
		
		System.out.println("Time(mS)\t" + type + "\t" + whichCase + "\t\t" + totalTime);
		System.out.println("Time(S)" + "\t\t\t\t\t\t" + totalTimeSec);
		
		if (checkList(sortedList) == true) {
			System.out.println("\t\t\t\t\t\t\tList sorted");
		}
		else
			System.out.println("\t\t\t\t\t\t\tSorting failed");
		
		System.out.println("");

	}
		
	public static boolean checkList(int[] l) {

		boolean listOK = true;
		for (int i = 0; i < l.length-1; i++) {
			if (l[i] > l[i + 1]) {
				listOK = false;
			}
		}
		return listOK;
	}

}
