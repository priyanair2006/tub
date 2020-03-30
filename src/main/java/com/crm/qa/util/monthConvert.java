package com.crm.qa.util;

public class monthConvert {
	
	public static String mmtoMonth(String mm) {
		
		String mon = null;
		if(mm.equals("01"))
		{
			 mon= "January";
		}
		else if(mm.equals("02")){
			 mon= "February";
		}
		else if(mm.equals("03")){
			 mon= "March";
		}
		
		else if(mm.equals("04")){
			 mon= "April";
		}
		
		else if(mm.equals("05")){
			 mon= "May";
		}
		
		else if(mm.equals("06")){
			 mon= "June";
		}
		
		else if(mm.equals("07")){
			 mon= "July";
		}
		
		else if(mm.equals("08")){
			 mon= "August";
		}
		
		else if(mm.equals("09")){
			 mon= "September";
		}
		
		else if(mm.equals("10")){
			 mon= "October";
		}
		
		else if(mm.equals("11")){
			 mon= "November";
		}
		
		else if(mm.equals("12")){
			 mon= "December";
		}
		

		return mon;
	}

}
