package ID_27409.Q2;

final class Ticket extends Payment {
    private String ticketNumber;
    private String issueDate;

    public Ticket(int id, String cd, String ud, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail, String flightNumber, String departure, String destination, double baseFare, String pilotName, String licenseNumber, int experienceYears, String crewName, String role, String shift, String passengerName, int age, String gender, String contact, String bookingDate, String seatNumber, String travelClass, String paymentDate, String paymentMethod, double amountPaid, String ticketNumber, String issueDate) {
        super(id, cd, ud, airportName, code, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName, role, shift, passengerName, age, gender, contact, bookingDate, seatNumber, travelClass, paymentDate, paymentMethod, amountPaid);
        this.ticketNumber = (ticketNumber == null || ticketNumber.isBlank()) ? "TCKT000" : ticketNumber;
        this.issueDate = (issueDate == null || issueDate.isBlank()) ? "1970-01-01" : issueDate;
    }

    // calculateFare = baseFare + taxes - discounts (simple policy)
    public double calculateFare() {
        double base = getBaseFare();
        // travelClass determined from Booking superclass fields via toString of display; to keep simple, inspect payment -> booking chain by castingless approach:
        // We don't have direct access to travelClass field here due to private scope in Booking, but we can compute a default multiplier.
        // For usefulness, assume classes encoded in constructor order: we can compute multiplier by examining ticketNumber pattern (not ideal).
        // Simpler: apply standard charges: tax 10% and no discount; caller can vary baseFare.
        double taxes = base * 0.10;
        double discounts = 0.0;
        return base + taxes - discounts;
    }

    public void display() { System.out.println("Ticket: " + ticketNumber + " issued=" + issueDate); }
}