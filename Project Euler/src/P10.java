
public class P10 {
	
	static boolean isPrime(int n) {
	     if(n<2) {
	    	 return false;
	     }
	     int len = (int)Math.sqrt(n);
	     for(int i=2; i<=len; i++) {
	    	 if(n%i==0) {
	    		 return false;
	    	 }
	     }
	     
	     return true;
	}

	public static void main(String[] args) {
		int sum=0;
		for(int i=2;i<=2000000;i++) {
			if(isPrime(i)) {
				sum +=i;
			}
		}
		System.out.print(sum);

	}

}
