package com.bridgelabz.cliniquemodel;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Doctor {
	private int id;
	private String name;
	private String availability;
	private String specialization;
}
