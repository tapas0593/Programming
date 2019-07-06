import java.util.Scanner;
public class VendingMachine {
	int i;
	int total=0;
	int countNotes(int[] notes,int change) {
			if(change==0)
				return total;
		else {
			if(change>=notes[i]) {
				int count=change/notes[i];
				int rem=change%notes[i];
				change=rem;
				total+=count;
				System.out.println(notes[i]+" Notes>>"+count);
			}
			i++;
			return countNotes(notes, change);

		}
	}
	
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int[] notes= {1000,500,100,50,20,10,5,2,1};
		 System.out.println("Enter the change ");
		 int change=sc.nextInt();
		 VendingMachine vm=new VendingMachine();
		 int total= vm.countNotes(notes,change);
		 System.out.println("Minimum notes required is "+total);
		 sc.close();
		}
	
}
