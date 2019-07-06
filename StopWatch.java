import java.util.Scanner;
public class StopWatch {
	long start;
	long stop;
	boolean running;
	void start() {
		this.start=System.currentTimeMillis();
	}
	void stop() {
		this.stop=System.currentTimeMillis();
	}
	double elapsedTime() {
		double el=(this.stop-this.start)/1000.0;
		return el;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StopWatch s=new StopWatch();
		System.out.println("Press any number to start the clock");
		int start=sc.nextInt();
		s.start();
		System.out.println("Press any number to stop the clock");
		int stop=sc.nextInt();
		s.stop();
		System.out.println("The elapsed time is "+ s.elapsedTime()+"sec");
		sc.close();
	}
	

}
