
import java.util.*;
public class PowerOf2 {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		if(n<0&&n>=31)
			System.out.println("Overflow");
		else
		{ int pw;
			for(int i=1;i<=n;i++)
			{
				pw=(int)Math.pow(n, i);
				System.out.println("2^"+i+" is= "+pw);
			}
		}
		
	}

}
