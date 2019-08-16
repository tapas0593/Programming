package com.bridgelabz.structuraldesignpattern.proxy;

public class ProxyPatternTest {

	public static void main(String[] args) {
		CommandExecuter executer = new CommandExecutorProxy("tapas0593", "secret");
		try {
			executer.executeCommand("ls -ltr");
			executer.executeCommand("rm -r test.txt");
		} catch (Exception e) {
			System.out.println("Exception message: " + e.getMessage());
		}
	}
}