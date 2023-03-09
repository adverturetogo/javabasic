package exercise3.flight.booking.system;

import java.time.LocalDate;

public class FlightBooking {
   

   private String PassengerFullName;
   private String TicketNumber;
   private String FlightCompany;
   private LocalDate DepartureDate;
   private LocalDate ReturnDate;
   private String TripSource;
   private String TripDestination;
   private int TotalPassengers;
   private int TotalTicketPrice;
   private int ChildPassengers;
   private int AdultPassengers;
   public FlightBooking(String PassengerFullName,LocalDate DepartureDate,LocalDate ReturnDate,int TotalPassengers,int TotalTicketPrice ){

   }
    public String getPassengerFullName()
    {
        return PassengerFullName;
    }
    public String getTicketNumber()
        {
            return TicketNumber;
        }
    public String getFlightCompany()
    {
        return FlightCompany;
    }
    public LocalDate getDepartureDate()
    {
        return DepartureDate;
    }
    public LocalDate getReturnDate()
    {
        return ReturnDate;
    }
    public String getTripSource()
    {
        return TripSource;
    }
    public String getTripDestination()
    {
        return TripDestination;
    }

    public int setTotalPassengers(int ChildPassengers,int AdultPassengers){
       int  TotalPassengers=ChildPassengers+AdultPassengers;
       return TotalPassengers;
    }


    public int getTotalPassengers()
    {
        return TotalPassengers;
    }
    public int getTotalTicketPrice()
    {
        return TotalTicketPrice;
    }
    public int getChildPassengers()
    {
        return ChildPassengers;
    }
    public int getAdultPassengers()
    {
        return AdultPassengers;
    }
    
   
    




}
