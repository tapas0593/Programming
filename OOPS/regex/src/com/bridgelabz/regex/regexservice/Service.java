package com.bridgelabz.regex.regexservice;

import com.bridgelabz.regex.regexmodel.UserDetails;

public interface Service {
	public String getFormattedDate();
	public String replace(UserDetails user,String message);
	public String readFile();
}
