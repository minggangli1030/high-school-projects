package SMS_Sorting;
import java.io.*;
import java.util.*;

public class SortRunner {

	public static void main(String[] args) {
		
		int ListSize = 150;
		int ListMAX = 150;
		
		int [] unsortedlist = makeTheList(ListSize, ListMAX);
		System.out.println("Unsorted:\n" + printList(unsortedlist));
		
		long BSstartTime = System.currentTimeMillis();
		InsertionSorter i = new InsertionSorter(unsortedlist);
		System.out.println("Sorted:\n" + printList(i.doSort()));
		//i.doSort();
		long BSendTime = System.currentTimeMillis();

		long BStotalTime = BSendTime - BSstartTime;
		long BStotalTimeSec = BStotalTime/1000;
		System.out.println("Insertion Sort - Time milli = " + BStotalTime);
		System.out.println("Insertion Sort - Time sec Selection = " + BStotalTimeSec);
		
		//
		
		long SLstartTime = System.currentTimeMillis();
		SelectionSorter s = new SelectionSorter(unsortedlist);
		System.out.println("Sorted:\n" + printList(s.doSort()));
		s.doSort();
		
		
		long SLendTime = System.currentTimeMillis();

		long SLtotalTime = SLendTime - SLstartTime;
		long SLtotalTimeSec = SLtotalTime/1000;
		System.out.println("Selection Sort - Time milli = " + SLtotalTime);
		System.out.println("Selection Sort - Time sec Selection = " + SLtotalTimeSec);
		
		// ListSize => the size of the list
		// ListMax => the maximum value of the possible element in the list

	}
	
	public static String printList(int [] l) {
		String lString = "";
		
		for(int i=0; i<l.length;i++) 
		{
			lString += l[i];
			if (i<l.length-1) 
			{
				lString += "\t";
			}
			if ((i+1)%10==0) 
			{
				lString += "\n";
			}
		}
		
		// lString => the string object that it turned to list (l) into to print
		// l => the list of random values
		
		return lString;
 
	}
	public static int[]makeTheList(int size, int randNumMax) {
		
		int [] NumList = new int[size];
		
		
		for (int i=0; i<size; i++) 
		{
			Random rand = new Random(); 
			int rand_int = rand.nextInt(randNumMax)+1; 
			NumList[i] = rand_int;
		}
		//size => the size of the list
		//randNumMax => the maximum possible value in the list
		// rand_int => the random value that is about to be put into the list
		
		return NumList;
	}
	
}
