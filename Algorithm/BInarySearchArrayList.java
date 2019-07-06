import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class BInarySearchArrayList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> str=Util.readStringArrayList();
		Collections.sort(str);
		System.out.println("The entered list in sorted manner is--> "+str);
		System.out.println("Enter the word you need to find");
		String s1=sc.next();
		int index=Util.binarySearch(str, s1);
		if(index==-1)
			System.out.println("The word was not found");
		else
		System.out.println(s1+" is present in the index position "+index);
	}

}
