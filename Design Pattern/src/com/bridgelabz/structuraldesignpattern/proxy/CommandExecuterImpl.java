package com.bridgelabz.structuraldesignpattern.proxy;

import java.io.IOException;

public class CommandExecuterImpl implements CommandExecuter {

	@Override
	public void executeCommand(String command) throws IOException {
		Runtime.getRuntime().exec(command);
		System.out.println("'" + command + "' command executed.");
	}

}
