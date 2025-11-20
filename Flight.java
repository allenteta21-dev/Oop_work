package ID_27409.Q2;

class Flight extends Airline {
    private String flightNumber;
    private String departure;
    private String destination;
    private double baseFare;

    public Flight(int id, String cd, String ud, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail, String flightNumber, String departure, String destination, double baseFare) {
        super(id, cd, ud, airportName, code, location, airlineName, airlineCode, contactEmail);
        this.flightNumber = (flightNumber == null || flightNumber.isBlank()) ? "FN000" : flightNumber;
        this.departure = (departure == null || departure.isBlank()) ? "Unknown" : departure;
        this.destination = (destination == null || destination.isBlank()) ? "Unknown" : destination;
        this.baseFare = baseFare > 0 ? baseFare : 0.0;
    }
    public String getFlightNumber() { return flightNumber; }
    public String getDeparture() { return departure; }
    public String getDestination() { return destination; }
    public double getBaseFare() { return baseFare; }
    public void display() { System.out.println("Flight: " + flightNumber + " " + departure + "->" + destination + " baseFare=" + baseFare); }
}

