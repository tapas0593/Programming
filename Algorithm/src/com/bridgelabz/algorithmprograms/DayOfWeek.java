package com.bridgelabz.algorithmprograms;

public class DayOfWeek {

	public static void main(String[] args) {
		String s[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Satarday" };
		int d = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		int day = Util.dayOfWeek(d, m, y);
		System.out.println(s[day]);

	}

}
