package com.bridgelabz.algorithmprograms;

public class MonthlyPayments {

	public static void main(String[] args) {
		double p = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		double r = Double.parseDouble(args[2]);
		System.out.println("The monthly paymemt required to pay off the loan " + p + " in " + y + " years" + " at rate "
				+ r + "% is" + Util.monthyPayment(p, r, y));

	}

}
