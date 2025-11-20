package ID_27409.Q2;

class Booking extends Passenger {
    private String bookingDate;
    private String seatNumber;
    private String travelClass;

    public Booking(int id, String cd, String ud, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail, String flightNumber, String departure, String destination, double baseFare, String pilotName, String licenseNumber, int experienceYears, String crewName, String role, String shift, String passengerName, int age, String gender, String contact, String bookingDate, String seatNumber, String travelClass) {
        super(id, cd, ud, airportName, code, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName, role, shift, passengerName, age, gender, contact);
        this.bookingDate = (bookingDate == null || bookingDate.isBlank()) ? "1970-01-01" : bookingDate;
        this.seatNumber = (seatNumber == null || seatNumber.isBlank()) ? "0A" : seatNumber;
        this.travelClass = (travelClass == null) ? "Economy" : travelClass;
        if (!(travelClass.equalsIgnoreCase("Economy") || travelClass.equalsIgnoreCase("Business") || travelClass.equalsIgnoreCase("First"))) this.travelClass = "Economy";
    }
    public void display() { System.out.println("Booking: date=" + bookingDate + " seat=" + seatNumber + " class=" + travelClass); }
}

