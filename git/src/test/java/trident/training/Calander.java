package trident.training;

import java.util.Calendar;

public class Calander {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		System.out.println("Day of week : "+ c.get(Calendar.DAY_OF_WEEK)); 


		System.out.println("Day of year : "+ c.get(Calendar.DAY_OF_YEAR)); 


		System.out.println("Week in Month : "+ c.get(Calendar.WEEK_OF_MONTH));
		

		System.out.println("Week in Year : "+ c.get(Calendar.WEEK_OF_YEAR)); 


		System.out.println("Hour : " + c.get(Calendar.HOUR)); 


		System.out.println("Minute : "+ c.get(Calendar.MINUTE)); 


		System.out.println("AM or PM : "+ c.get(Calendar.AM_PM));
		





	}

}
