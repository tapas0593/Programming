public class PrimeIsPallindrome {
	public static void main(String[] args) {
		System.out.println("The numbers which are both Prime and Pallindrome are");
		for(int i=3;i<=1000;i++) {
			if(Util.isPrime(i)) {
				if(Util.primeIsPallindrome(i))
					System.out.print(i+" ");
			}
				
		}
			
	}

}
