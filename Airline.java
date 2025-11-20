package ID_27409.Q2;

class Airline extends Airport {
    private String airlineName;
    private String airlineCode;
    private String contactEmail;

    public Airline(int id, String cd, String ud, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail) {
        super(id, cd, ud, airportName, code, location);
        this.airlineName = (airlineName == null || airlineName.isBlank()) ? "UnknownAir" : airlineName;
        this.airlineCode = (airlineCode != null && airlineCode.matches("[A-Za-z]{2,4}")) ? airlineCode : "AA";
        this.contactEmail = (contactEmail != null && contactEmail.contains("@")) ? contactEmail : "contact@airline.com";
    }
    public String getAirlineName() { return airlineName; }
    public String getAirlineCode() { return airlineCode; }
    public String getContactEmail() { return contactEmail; }
    public void display() { System.out.println("Airline: " + airlineName + " (" + airlineCode + ") email=" + contactEmail); }
}

