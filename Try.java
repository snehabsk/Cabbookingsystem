package org.demoProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import org.demoProject.service.CabService;
import org.demoProject.service.CabServiceImpl;

public class Try {
	
	public static void main(String args[]) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm");
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		
	}

}
