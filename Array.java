import java.io.PrintWriter;
import java.util.Scanner;
public class Array {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number of rows");
		int row=sc.nextInt();
		System.out.println("Enter the number of columns");
		int col=sc.nextInt();
		System.out.println("The Integer Matrix");
		int[][] intArray=read2DIntArray(row,col);
		disp2DArray(intArray);
		System.out.println("The Double Matrix");
		double[][] doubleArray=read2DDoubleArray(row,col);
		disp2DArray(doubleArray);
		System.out.println("The Boolean Matrix");
		boolean[][] booleanArray=read2DBooleanArray(row,col);
		disp2DArray(booleanArray);
	
		
	}
	
	public static int[][] read2DIntArray(int row, int col) { 
		int arr[][]=new int[row][col];
		System.out.println("Enter the "+row*col+" elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
				arr[i][j]=sc.nextInt();
			}
		return arr;
	}
	public static double[][] read2DDoubleArray(int row, int col) { 
		double arr[][]=new double[row][col];
		System.out.println("Enter the "+row*col+" elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
				arr[i][j]=sc.nextDouble();
			}
		return arr;
	}
	public static boolean[][] read2DBooleanArray(int row, int col) { 
		boolean arr[][]=new boolean[row][col];
		System.out.println("Enter the "+row*col+" elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
				arr[i][j]=sc.nextBoolean();
			}
		return arr;
	}
	public static void disp2DArray(int[][] intArray) {
		PrintWriter pw=new PrintWriter(System.out, true);
		System.out.println("The elements are:");
		for(int i=0;i<intArray.length;i++) {
			for(int j=0;j<intArray[i].length;j++) {
				pw.print(intArray[i][j]+" ");
			}
		pw.println();
		}
	}
		public static void disp2DArray(double[][] doubleArray) {
			PrintWriter pw=new PrintWriter(System.out, true);
			System.out.println("The elements are:");
			for(int i=0;i<doubleArray.length;i++) {
				for(int j=0;j<doubleArray[i].length;j++) {
					pw.print(doubleArray[i][j]+" ");
				}
			pw.println();
			}
	}
		public static void disp2DArray(boolean[][] boolArray) {
			PrintWriter pw=new PrintWriter(System.out, true);
			System.out.println("The elements are:");
			for(int i=0;i<boolArray.length;i++) {
				for(int j=0;j<boolArray[i].length;j++) {
					pw.print(boolArray[i][j]+" ");
				}
			pw.println();
			}
	}
				
	
	

}
