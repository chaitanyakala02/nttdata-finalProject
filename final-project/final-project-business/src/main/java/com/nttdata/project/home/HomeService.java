package com.nttdata.project.home;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HomeService {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeService.class);
	
	public String homeService(Locale locale) {
		
		logger.info("Welcome home! This is the Data/Business Layer", locale);
		
		Date date = new Date();
		
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		return formattedDate;
		
	}

}
