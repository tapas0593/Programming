
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 4 digit Year ");
		int year=sc.nextInt();
		int c=count(year);
		if(c<4)
			System.out.println("The year should be a 4 digit number");
		else
		{
			String ly=(year%400==0 || year%4==0&&year%100!=0)?" A Leap Year":"Not a Leap Year";
			System.out.println("The entered year is "+ly);
					
		}
	}
	static int count(int year)
	{
		int c=0;
		while(year>0)
		{
			c++;
			year/=10;
		}
		return c;
	}

}
