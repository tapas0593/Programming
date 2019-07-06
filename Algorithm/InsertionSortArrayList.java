import java.util.ArrayList;

public class InsertionSortArrayList {
	public static void main(String[] args) {
	ArrayList<String> str=Util.readStringArrayList();
	System.out.println("The sorted List is ");
	Util.insertionSort(str);
}
}
