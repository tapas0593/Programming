
import java.util.Scanner;
public class Gambler {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the stake, goal and number of times");
		int stake=sc.nextInt();
		int goal=sc.nextInt();
		int n=sc.nextInt();
		int win=0,bet=0; double wp=0;
		for(int i=1;i<n;i++)
		{ 
			int cash=stake;
			while(cash>0 &&cash<goal)
			{
				bet++;
				if(Math.random()<0.5)
					cash--;
				else
					cash++;
			}
			if(cash==goal)
				win++;
			
		}
		wp=win*100.0/n;
		System.out.println("Number of wins is: "+win);
		System.out.println("Win % is= "+wp);
		System.out.println("Loss % is= "+(100.0-wp));

	}

}
