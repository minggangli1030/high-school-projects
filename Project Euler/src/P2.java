import java.io.*;
import java.util.*;

public class P2 {

	static int fibonacci(int n) {
		// base
		if (n==1) {
			return 1;
		}
		if (n==2){
			return 2;
		}
		// recursion formula
		return (fibonacci(n-1) + fibonacci(n-2));
	}

	public static void main(String[] args) throws IOException {
		int sum =0;
		int i=1;
		while (fibonacci(i)<=4000000) {
				int x = fibonacci(i);
				if (x%2==0) {
					sum = sum + x;
				}
				i++;
			}
			System.out.print(sum);
		}
		


	}

