import java.util.Scanner;
public class SumOfThreeInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=readArray(); int c=0;
		for (int i = 0; i < arr.length-2; i++) {
			for (int j = i+1; j < arr.length-1; j++) {
				for (int k = j+1; k < arr.length; k++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					c++;
					}
				}
			}
		}
		if(c==0)
			System.out.println("No Triplets found");
		else
			System.out.println("There are "+c+" triplets");
		
	}
	static int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the "+n+" elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}

}
