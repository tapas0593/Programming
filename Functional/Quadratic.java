
import java.util.Scanner;
public class Quadratic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ax^2 + bx + c");
		System.out.println("Enter the value of a, b and c");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		double root1=0.0, root2=0.0;
		int delta=b*b-4*a*c;
		if(delta>=0)
		{
		root1=(-b+Math.sqrt(delta))/2*a;
		root2=(-b-Math.sqrt(delta))/2*a;
		System.out.println("The roots of x are: "+root1+" and "+root2);
		}else {
		System.out.println((-b/2.0*a)+"+"+(Math.sqrt(delta*(-1)))/2.0*a+"i");
		System.out.println(-b/2*a+"-"+(Math.sqrt(delta*-1))/2*a+"i");
		}
		
	}

}
