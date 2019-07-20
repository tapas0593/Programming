package com.bridgelabz.regex.regexserviceimpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.regex.regexmodel.UserDetails;
import com.bridgelabz.regex.regexservice.ServiceUtil;

public class ServiceImplementation implements ServiceUtil {

	BufferedReader br;

	@Override
	public void printDate(String date) {

	}

	@Override
	public String getFormattedDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		return sdf.format(date);
	}

	@Override
	public String replace(UserDetails user, String message) {
		/*
		 * message = message.replace("<<name>>", user.getFirstName()); message =
		 * message.replace("<<full name>>", user.getFirstName()+" "+user.getLastName());
		 * message = message.replace("xxxxxxxxxx", user.getMobileNum()); message =
		 * message.replace("01/01/2016", user.getDate());
		 */
		Pattern p = Pattern.compile("<<name>>");
		Matcher m = p.matcher(message);
		message = m.replaceAll(user.getFirstName());

		p = Pattern.compile("<<full name>>");
		m = p.matcher(message);
		message = m.replaceAll(user.getFirstName() + " " + user.getLastName());

		p = Pattern.compile("xxxxxxxxxx");
		m = p.matcher(message);
		message = m.replaceAll(user.getMobileNum());

		p = Pattern.compile("01/01/2016");
		m = p.matcher(message);
		message = m.replaceAll(user.getDate());

		return message;
	}

	@Override
	public String readFile() {
		StringBuilder string = new StringBuilder();
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("/home/admin237/Desktop/MY_WS/regex/src/Message.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				string.append(line);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return string.toString();
	}

}
