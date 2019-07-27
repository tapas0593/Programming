package com.bridgelabz.cliniqueserviceserviceimpl;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.cliniquemodel.Doctor;
import com.bridgelabz.cliniquemodel.Patient;
import com.bridgelabz.cliniqueservice.Clinique;

public class CliniqueService implements Clinique {
	Scanner sc = new Scanner(System.in);
	ArrayList<Doctor> listDoctor = new ArrayList<>();
	ArrayList<Patient> listPatient = new ArrayList<>();
	JSONParser parser = new JSONParser();
	Doctor doctor;
	Patient patient;

	public CliniqueService() {
		readDoctor();
		readPatient();
	}

	public void readDoctor() {
		doctor = new Doctor();
		try {
			FileReader fr = new FileReader("");
			JSONArray array = (JSONArray) parser.parse(fr);

			for (Object obj : array) {
				JSONObject details = (JSONObject) obj;
				doctor.setName((String) details.get("name"));
				doctor.setId(((Number) details.get("id")).intValue());
				doctor.setSpecialization((String) details.get("specialization"));
				doctor.setAvailability((String) details.get("availibility"));
				listDoctor.add(doctor);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void readPatient() {
		patient = new Patient();
		try {
			FileReader fr = new FileReader("");
			JSONArray array = (JSONArray) parser.parse(fr);

			for (Object obj : array) {
				JSONObject details = (JSONObject) obj;
				patient.setName((String) details.get("name"));
				patient.setId(((Number) details.get("id")).intValue());
				patient.setMobNum((long) details.get("specialization"));
				patient.setAvailability((String) details.get("availibility"));
				listDoctor.add(doctor);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void registerNewUser() {

	}

	@Override
	public void searchDoctor() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchPatient() {
		// TODO Auto-generated method stub

	}

	@Override
	public void takeAppointment() {
		System.out.println("Do you have the ID? Y/n");
		char ch = sc.next().charAt(0);
		if (ch == 'Y' || ch == 'y') {
			System.out.println("Please enter your Patient ID");
			int id = sc.nextInt();

		}
		registerNewUser();
	}

	@Override
	public void showPopularSpecialization() {
		// TODO Auto-generated method stub

	}

	@Override
	public void showPopularDoctor() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printDoctorPatientReport() {
		// TODO Auto-generated method stub

	}

}
