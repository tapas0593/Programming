package com.bridgelabz.regex.regexservice;

import java.util.Date;

import com.bridgelabz.regex.regexmodel.UserDetails;

public interface ServiceUtil {
	public void printDate(String date);
	public String getFormattedDate();
	public String replace(UserDetails user,String message);
	public String readFile();
}
