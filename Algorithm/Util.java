import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public final class Util {
	static boolean isAnagram(String s1, String s2) {
		int[] count1 = new int[26];
		int[] count2 = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
				if (ch >= 'A' && ch <= 'Z')
					count1[ch - 65]++;
				if (ch >= 'a' && ch <= 'z')
					count1[ch - 97]++;
			}
		}
		for (int i = 0; i < s2.length(); i++) {
			char ch = s2.charAt(i);
			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
				if (ch >= 'A' && ch <= 'Z')
					count2[ch - 65]++;
				if (ch >= 'a' && ch <= 'z')
					count2[ch - 97]++;
			}
		}
		for (int i = 0; i < s1.length(); i++) {
			if (count1[i] != count2[i])
				return false;
		}
		return true;
	}

	static boolean isPrime(int n) {
		for (int i = 3; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	static boolean primeIsPallindrome(int n) {
		int a = n;
		int rev = 0;
		do {
			int r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		} while (n != 0);
		if (rev == a)
			return true;
		else
			return false;
	}
	static int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	static String[] readStringArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the String array");
		int n=sc.nextInt();
		String arr[]=new String[n];
		System.out.println("Enter the "+n+" String elememts");
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
		}
		return arr;
	}
	static void dispArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	static void dispArray(String arr[])
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	

	static int binarySearch(int a[], int x) {
		int len = a.length;
		int start = 0;
		int end = len - 1;
		while (start<= end) {
			int mid = (start + end) / 2;
			if (a[mid] == x) {
				return mid;
			}
			if (a[mid] < x)
				start = mid + 1;
			if (a[mid] > x)
				end = mid - 1;
		}
		return -1;
	}
	static int binarySearch(String[] s1,String s2)
	{
		int len=s1.length;
		int start=0;
		int end=len-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(s1[mid].compareTo(s2)==0)
				return mid;
			if(s1[mid].compareTo(s2)<0)
				start=mid+1;
			else
				end=mid-1;
		}
		return -1;
	}
	
	static void insertionSort(int[] arr)
	{
		int len=arr.length;
		for(int i=1;i<len;i++) {
			int j=i-1;
			int x=arr[i];
			while(j>=0&&x<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=x;
		}
	}
	static void insertionSort(String[] arr)
	{
		int len=arr.length;
		for(int i=1;i<len;i++) {
			int j=i-1;
			String x=arr[i];
			while(j>=0&&x.compareTo(arr[j])<0) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=x;
		}
	}
	static void bubbleSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++) {
			boolean swap=false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1])
				{
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
					swap=true;
				}
			}
			if(swap=false)
				break;
		}
	}
	static void bubbleSort(String[] arr)
	{
		for(int i=0;i<arr.length-1;i++) {
			boolean swap=false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j].compareTo(arr[j+1])>0)
				{
					String t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
					swap=true;
				}
			}
			if(swap=false)
				break;
		}
	}
	static int dayOfWeek(int d, int m, int y) {
		int y1=y+(14-m)/12;
		int x=y1+y1/4-y1/100+y1/400;
		int m1=m+12*((14-m))/12-2;
		int d1= (d+x+31*m1/12)%7;
		return d1;
	}
	static void temperatureConversion(double temp, char ch) {
		Scanner sc=new Scanner(System.in);
		if(ch=='C'||ch=='c')
			System.out.println("The temperature in °F is "+(temp*9/5+32)+"°F");
			else if(ch=='F'||ch=='f')
			System.out.println("The temperature in °C is "+((temp-32)*5/9)+"°C");
			else
				System.out.println("Invalid Temperature type");
		}

	static double monthyPayment(double p, double r, double y) {
		double r1=r/(12*100);
		double n1=12*y;
		return p*r1/(1-Math.pow((1+r1),-n1));
		
	}
	
	static ArrayList<String> readStringArrayList()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the List");
	int size=sc.nextInt();
	ArrayList<String> str=new ArrayList<String>(size);
	System.out.println("Enter the list of words");
	for(int i=0;i<size;i++) {
		String s=sc.next();
		str.add(s);
	}
	return str;
}
	static ArrayList<Integer> readIntArrayList(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the list");
		int size=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>(size);
		System.out.println("Enter the list of ints");
		for(int i=0;i<size;i++) {
			int num=sc.nextInt();
			list.add(num);
		}
		return list;
	}
	
	static int binarySearch(ArrayList<String> str, String word) {
		int start=0;
		int end=str.size()-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(word.equals(str.get(mid)))
				return mid;
			else
				if(word.compareTo(str.get(mid))>0)
					start=mid+1;
				else
					end=mid-1;
		}
		return -1;
	}
	
	static void insertionSort(ArrayList<String> str) {
		String[] arr=new String[str.size()];
		str.toArray(arr);
		insertionSort(arr);
		str=new ArrayList<>(Arrays.asList(arr));
	System.out.println(str);	
	}
	
	
}
