package Class15.Jul21;
import java.util.*;
public class ArrayListExercise {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		for (int i=1;i<=10;i++)
		{
			list.add(i);
		}
		list.set(5,1000);
		list.remove(3);
		for(int n:list) {
			System.out.print(n + " ");
		}
		
		System.out.println(" ");
		
		Collections.sort(list);
		for(int n : list)
		{
			System.out.print(n+" ");
		}


	}

}
