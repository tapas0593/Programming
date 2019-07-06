import java.util.Scanner;
public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature");
		double temp=sc.nextDouble();
		
		char ch=sc.next().charAt(0);
		Util.temperatureConversion(temp,ch);
		sc.close();
	}

}
