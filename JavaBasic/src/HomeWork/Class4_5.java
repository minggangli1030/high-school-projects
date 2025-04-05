package HomeWork;

import java.util.Scanner;

public class Class4_5 {

	public static void main(String[] args) {
		int ULN = 5;
		for (int i = 1; i <= ULN; i++) { 
			for (int USP = 0; USP < ULN - i; USP++) { 
				System.out.print(" ");
			}
			for (int UST = 0; UST < 2 * i - 1; UST++) { 
				System.out.print("*");
			}
			System.out.println(""); 
		}
		int LLN = 4;
		for (int i = 1; i <= LLN; i++) { 
			for (int LSP = 4; LSP > LLN - i; LSP--) { 
				System.out.print(" ");
			}
			for (int LST = 8; LST > 2 * i - 1; LST--) { 
				System.out.print("*");
			}
			System.out.println(""); 
		}
		
	}
}
