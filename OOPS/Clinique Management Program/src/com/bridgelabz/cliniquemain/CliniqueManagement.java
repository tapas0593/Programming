package com.bridgelabz.cliniquemain;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bridgelabz.cliniquemodel.Doctor;
import com.bridgelabz.cliniquemodel.Patient;
import com.bridgelabz.cliniqueserviceserviceimpl.CliniqueService;

public class CliniqueManagement {
	Scanner sc = new Scanner(System.in);
	CliniqueService cs = new CliniqueService();
	Doctor d = new Doctor();
	Patient p = new Patient();

	void patient() throws InputMismatchException {
		System.out.println("Enter your choice>>");
		System.out.println("1.Take Appointment>>");
		System.out.println("2.Search Doctor>>");
		System.out.println("3.Search Patient>>");
		System.out.println("4.Show popular Doctor>>");
		System.out.println("5.Print Doctor's report>>");
		System.out.println("6.EXIT ");

		try {
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				cs.takeAppointment();
				break;
			case 2:
				cs.searchDoctor();
				break;
			case 3:
				cs.searchPatient();
				break;
			case 4:
				cs.showPopularDoctor();
				break;
			case 5:
				cs.printDoctorPatientReport();
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Enter 1 - 6");
				patient();

			}
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}

	}

	public static void main(String args[]) {
		CliniqueManagement cm = new CliniqueManagement();
		cm.patient();
	}
}