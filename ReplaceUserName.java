import java.util.Scanner;
public class ReplaceUserName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="Hello <<UserName>>, How are you?";
		System.out.println(str);
		System.out.println("Enter the User Name to replace");
		String userName=sc.next();
		String newSt=str.replace("<<UserName>>", userName);
		System.out.println(newSt);
	}

}
