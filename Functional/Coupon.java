
import java.util.Scanner;
public class Coupon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of distinct coupons");
		int n=sc.nextInt();
		int present[]=new int[n];
		int count=0;
		for(int i=0;i<n;)
		{
			int value=randomNumber(n);
			count++;
			System.out.print(value+" ");
			if(present[value]==0)
			{
				i++;
				present[value]=1;
			}
		}
		System.out.println();
		System.out.println(count);
	}
	
	static int randomNumber(int n)
	{
		int r=(int)(Math.random()*n);
		return r;
	}
	
	

}
