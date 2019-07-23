package com.bridgelabz.regex.regexserviceimpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.regex.regexmodel.UserDetails;
import com.bridgelabz.regex.regexservice.Service;

public class ServiceImplementation implements Service {

	@Override
	public String getFormattedDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		return sdf.format(date);
	}

	@Override
	public String replace(UserDetails user, String message) {
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
