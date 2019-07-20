
import java.util.Scanner;
class Factor
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		while(n%2==0)
		{
			System.out.print(2+" ");
			n=n/2;
		}
		for(int i=3;i*i<=n;i+=2)
		{
			while(n%i==0)
			{
				System.out.print(i+" ");
				n=n/i;
			}
		}
		if(n>=3)
			System.out.print(n);
	}
}