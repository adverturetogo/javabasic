package exercise3.flight.booking.system;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class Main 
{
    public static Date StrToDate(String  str)
    {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try{
            date = format.parse(str);
        }
        catch(ParseException e)
        {
            e.printStackTrace();
        }    
        return date;
     }
    public static void main( String[] args )
    {
        String flightCompany =" Flights-of-Fancy";
        String tripSource ="NANJING";
        String destinationAirport="OULU AIRPORT";
        Scanner in = new Scanner (System.in);
        System.out.println("Your name");
        String passengerFullName = in.nextLine();
        System.out.println("The departureDate in the form of yyyy-MM-dd");
        String departureDate= in.nextLine();
        System.out.println("The returnDate in the form of yyyy-MM-dd");
        String returnDate = in.nextLine();
        int childPassengers = 0;
        int adultPassengers = 0;
        System.out.println("The number of childPassengers is");
         childPassengers = in.nextInt();
         System.out.println("The number of adult is");
         adultPassengers = in.nextInt();
         int totalPassengers =childPassengers+adultPassengers;
        
        int totalTicketPrice = childPassengers*200+adultPassengers*300;
        Random r = new Random();
        int ticketNumber =r.nextInt(100000000);
        
        System.out.println( "Dear " + passengerFullName + ". Thank you for booking your flight with " + 
        flightCompany + ". Following are the details of your booking and the trip:" + "\n" + 
        "Ticket Number: " + ticketNumber + "\n" + 
        "From " + tripSource + " to " + destinationAirport + "\n" +
        "Date of departure: " +StrToDate(departureDate)  + "\n" +
        "Date of return: " + StrToDate(returnDate) + "\n" +
        "Total passengers: " + totalPassengers + "\n" +
        "Total ticket price in Euros: " + totalTicketPrice);
        in.close();
    }
       
            
    }

    
