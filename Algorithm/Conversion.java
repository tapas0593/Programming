import java.util.Scanner;
public class Conversion {
	static int[] toBinary(int dec) {
	String bin="";
	do {
		int r=dec%2;
		bin=r+bin;
		dec/=2;		
	}while(dec!=0);
	while(bin.length()%4!=0) {
		bin=0+bin;
	}
	return stringToIntArr(bin);
	}
	
	static int[] swapNibble(int[] bin) {
		for(int i=0,j=bin.length-4;i<bin.length-4;i++) {
			int t=bin[i];
			bin[i]=bin[j];
			bin[j]=t;
			j++;
		}
		return bin;
	}
	static int[] stringToIntArr(String bin) {
		int arr[]=new int[bin.length()];
		for(int i=0;i<bin.length();i++)
			arr[i]=bin.charAt(i)-48;
		return arr;
	}
	static int binToDec(int[] bin) {
		int dec=0;
		int j=0;
		for(int i=bin.length-1;i>=0;i--) {
			dec+=bin[i]*(int)Math.pow(2,j++);
		}
		return dec;
	}
	static boolean isPowerOf2(int dec) {
		int i=0;
		while((int)Math.pow(2,i)<=dec) {
			if((int)Math.pow(2,i)==dec) {
			return true;
			}
			i++;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int dec=sc.nextInt();
		System.out.print ("The binary equivalent of "+dec+" is ");
		int[] arr=toBinary(dec);
		Util.dispArray(arr);
		swapNibble(arr);
		System.out.print("\n The array with swaped nibbles is ");
		Util.dispArray(arr);
		int n=binToDec(arr);
		System.out.println("\n Decimal equivalent of the above binary is "+n);
		if(isPowerOf2(n))
			System.out.println("The number "+n+" is a power of 2");
		else
			System.out.println("The number "+n+" is not a power of 2");
		
			
		
	}

}
