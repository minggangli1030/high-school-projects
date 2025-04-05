package SMS_Sorting;

import java.util.*;

public class HW_SelectionSort_1_22_20 {

	public static void main(String[] args) {

		int ListSize = 10000;
		int ListMAX = 1000000;
		int[] unsortedList = makeTheList(ListSize, ListMAX);

		System.out.println("Sorted:\n" + SortList(unsortedList));

		// ListSize => the size of the list
		// ListMax => the maximum value of the possible element in the list

	}

	// Print the list
	public static String printList(int[] l) {
		String lString = "";

		for (int i = 0; i < l.length; i++) {
			lString += l[i];
			if (i < l.length - 1) {
				lString += "\t";
			}
			if ((i + 1) % 20 == 0) {
				lString += "\n";
			}
		}

		// lString => the string object that it turned to list (l) into to print
		// l => the list of random values

		return lString;

	}

	// Construct the list
	public static int[] makeTheList(int size, int randNumMax) {

		int[] NumList = new int[size];

		for (int i = 0; i < size; i++) {
			Random rand = new Random();
			int rand_int = rand.nextInt(randNumMax) + 1;
			NumList[i] = rand_int;
		}
		// size => the size of the list
		// randNumMax => the maximum possible value in the list
		// rand_int => the random value that is about to be put into the list

		return NumList;
	}

	// Sort the list
	public static String SortList(int[] S) {
		for (int i = 0; i < S.length; i++) {
			int original = S[i];
			int min = 100000000;
			int order = 0;
			for (int j = i; j < S.length; j++) {
				int number = S[j];
				if (number < min) {
					min = number;
					order = j;
				}
			}
			S[i] = min;
			S[order] = original;
		}
		return (printList(S));
	}
}
