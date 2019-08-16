package com.bridgelabz.structuraldesignpattern.proxy;

public class CommandExecutorProxy implements CommandExecuter {

	boolean isAdmin;
	private CommandExecuter executer;

	public CommandExecutorProxy(String userName, String password) {
		if (userName.equals("tapas0593") && password.equals("secret"))
			isAdmin = true;
		executer = new CommandExecuterImpl();
	}

	@Override
	public void executeCommand(String command) throws Exception {
		if (isAdmin) {
			executer.executeCommand(command);
		} else {
			if (command.startsWith("rm")) {
				throw new Exception("rm commands are not allowed by non-admin users.");
			} else {
				executer.executeCommand(command);
			}
		}
	}

}
