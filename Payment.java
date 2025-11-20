package ID_27409.Q2;

class Payment extends Booking {
    private String paymentDate;
    private String paymentMethod;
    private double amountPaid;

    public Payment(int id, String cd, String ud, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail, String flightNumber, String departure, String destination, double baseFare, String pilotName, String licenseNumber, int experienceYears, String crewName, String role, String shift, String passengerName, int age, String gender, String contact, String bookingDate, String seatNumber, String travelClass, String paymentDate, String paymentMethod, double amountPaid) {
        super(id, cd, ud, airportName, code, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName, role, shift, passengerName, age, gender, contact, bookingDate, seatNumber, travelClass);
        this.paymentDate = (paymentDate == null || paymentDate.isBlank()) ? "1970-01-01" : paymentDate;
        this.paymentMethod = (paymentMethod == null || paymentMethod.isBlank()) ? "Unknown" : paymentMethod;
        this.amountPaid = amountPaid > 0 ? amountPaid : 0.0;
    }
    public void display() { System.out.println("Payment: date=" + paymentDate + " method=" + paymentMethod + " amount=" + amountPaid); }
}

