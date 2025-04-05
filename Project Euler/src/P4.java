import java.io.*;
import java.util.*;
public class P4 {
	static boolean isPalindromes(int n) {
		int y=n, num=0;
		while (y!=0) { // 换一下前后对应的数位（abcd => dcba）
			num = num*10 + y%10;
			y=y/10;
		}
		if (num ==n) { // 如果 abcd == dcba，则是回文数，输出
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		for (int i=100;i<=999;i++) {
			for (int j=100;j<=999;j++)
			{
				int pdt = i*j;
				if(isPalindromes(pdt)) {
					if (pdt>max) {
						max =pdt;
					}
				}
			}	
		}
		System.out.println(max);
	}

}
