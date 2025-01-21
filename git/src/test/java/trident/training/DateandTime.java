package trident.training;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import io.opentelemetry.sdk.common.Clock;

public class DateandTime {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now(); 
        System.out.println("Current date: " + currentDate); 
  
        
        LocalTime currentTime = LocalTime.now(); 
        System.out.println("Current time: " + currentTime); 
  
        
        LocalDateTime currentDateTime = LocalDateTime.now(); 
        System.out.println("Current date and time: "+ currentDateTime); 
        
        LocalDate fiveDaysBefore = currentDate.minusDays(5);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd / MMMM /yyyy HH:mm:ss");
        String formattedDate = fiveDaysBefore.format(formatter);
        System.out.println("Date 5 days before today: " + formattedDate);
        
        
        
	}

}
