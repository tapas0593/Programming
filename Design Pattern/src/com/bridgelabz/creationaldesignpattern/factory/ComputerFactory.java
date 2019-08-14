package com.bridgelabz.creationaldesignpattern.factory;

import com.bridgelabz.creationaldesignpattern.model.Computer;
import com.bridgelabz.creationaldesignpattern.model.PC;
import com.bridgelabz.creationaldesignpattern.model.Server;

public class ComputerFactory {
	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		if (type.equalsIgnoreCase("PC"))
			return new PC(ram, hdd, cpu);
		else if (type.equalsIgnoreCase("Server"))
			return new Server(ram, hdd, cpu);
		else	
			return null;
	}
}
