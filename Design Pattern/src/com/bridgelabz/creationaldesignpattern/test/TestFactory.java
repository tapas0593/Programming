package com.bridgelabz.creationaldesignpattern.test;

import com.bridgelabz.creationaldesignpattern.factory.ComputerFactory;
import com.bridgelabz.creationaldesignpattern.model.Computer;

public class TestFactory {
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc", "4 GB", "500 GB", "2.4 GHz");
		Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.6 GHz");
		System.out.println("PC Configuration: " + pc);
		System.out.println("Server Configuration: " + server);
	}

}
