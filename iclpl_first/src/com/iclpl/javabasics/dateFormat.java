package com.iclpl.javabasics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateFormat {

	public static void main(String[] args) {
	
        SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");
        
      //procedure 1:@Tapas
        
      Date d = new Date();
      String date = sdf.format(d);
      System.out.println(date);
      
      //split function
      
      System.out.println("We want the date part which is : ");
      String[] date1 = date.split(":");
      System.out.println(date1[0]);
       
      //procedure 2:@Tapas
      
      Calendar cal = Calendar.getInstance();
      String date2 = sdf.format(cal.getTime());
      System.out.println(date2);
	}

}
