package Class12.Jul16;

public class PrimeNumbers {

	public static boolean isprime(int n)
	{
		for (int i=2;i<n;i++)
		{
			if (n%i==0) 
				return false;
		}
		return true;
		
	}
	public static void main(String[] args)
	{
		for (int i=3;i<=98;i+=2) 
		{
			if (isprime(i) && isprime(i+2))
				System.out.println(i + " " + (i+2));
			
		}
		

	}

}
