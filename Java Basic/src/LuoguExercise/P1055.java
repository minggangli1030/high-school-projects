package LuoguExercise;

import java.io.*;
import java.util.*;

public class P1055 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine();
		int sum = 0;
		int n = 1;
		for (int i = 0; i < 11; i++)
			{
				if (s.charAt(i) == '-') 
				{
					continue;
				}
				// 防止‘-‘影响运算

					int k = s.charAt(i) - '0';
					sum = sum + k * n;
					n++;
			}
		
		int m = sum % 11;
		
		if (m == 10) 
		{
			if (s.charAt(12) == 'X') 
			{
				System.out.print("Right");
			} 
			else 
			{
				String s1 = s.substring(0, 12);
				System.out.print(s1 + 'X');
			}
			
		} 
		
		else 
			if (s.charAt(12) == m + '0') 
			{
				System.out.print("Right");
			}
			else 
			{
				String s1 = s.substring(0, 12);
				System.out.print(s1 + m);
			}

		}

}
