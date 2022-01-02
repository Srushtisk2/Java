package com.xworkz.christmas;

public class Christmas {
	
	  private static final Christmas obj = null;
	float date;
	    int noOfDays;
	    
	   public Christmas (float date, int noOfDays) {
		   this.date=date;
		   this.noOfDays=noOfDays;
	   }
		   public String toString() {
			   return date+ " "+noOfDays;
		   }
		   
		   public int hashCode() {
			   return noOfDays;
		   }
		   
		   
		   public boolean equals(Object obj) {
			   if(obj!=null) {
				   return true;
			   }
				   if(obj instanceof Christmas) {
					   Christmas ch = (Christmas) obj;
					    return this.date==ch.date && this.noOfDays==ch.noOfDays;
				   }
				   else {
					   return false;
				   }
					   
				   }
		   
		   }

		   

		
		 


	 