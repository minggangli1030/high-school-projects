package SMS_Sorting;

import java.io.*;
import java.util.*;

public class TestingSortRunner {

	public static void main(String[] args) {

		int ListSize = 100;
		int ListMAX = 100;

		System.out.println("The size of the list: " + ListSize);
		System.out.println();
		int [] avgCase = makeAverageCase(ListSize, ListMAX);
//		int [] bestCase = makeBestCase(ListSize);
//		int [] worstCase = makeWorstCase(ListSize, ListMAX);
		

		QuickSorter q1 = new QuickSorter(avgCase);
		
		System.out.println("Before:\n" + printList(avgCase));
		System.out.println();
		
		runSorter(q1, "  Merge  ", "Average");
		
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
	
//	public static int[] makeBestCase(int nNums) {
//		
//		int[] newList = new int[nNums];
//		for (int i = 0; i < nNums; i++) {
//			newList[i] = i + 1;
//		}
//
//		return newList;
//
//	}
//
//	public static int[] makeWorstCase(int nNums, int nMax) {
//
//		int[] newList = new int[nNums];
//		for (int i = 0; i < nNums; i++) {
//			newList[i] = nMax;
//			nMax--;
//		}
//		return newList;
//	}
	
	
	
	public static int[]makeAverageCase(int size, int randNumMax) {
		
		int [] NumList = new int[size];
		
		
		for (int i=0; i<size; i++) 
		{
			Random rand = new Random(); 
			int rand_int = rand.nextInt(randNumMax)+1; 
			NumList[i] = rand_int;
		}
		
		return NumList;
	}

	public static void runSorter(SortRoutine sorter, String type, String whichCase) {
		long startTime = System.currentTimeMillis();
		System.out.println("After:\n" + printList(sorter.doSort()));
		System.out.println();
		long endTime = System.currentTimeMillis();

		long totalTime = endTime - startTime;
		long totalTimeSec = totalTime / 1000;
		System.out.println("Time(mS)\t" + type + "\t" + whichCase + "\t\t" + totalTime);
		System.out.println("Time(S)" + "\t\t\t\t\t\t" + totalTimeSec);
		System.out.println("");

	}
	
	
}
