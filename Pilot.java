package ID_27409.Q2;

class Pilot extends Flight {
    private String pilotName;
    private String licenseNumber;
    private int experienceYears;

    public Pilot(int id, String cd, String ud, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail, String flightNumber, String departure, String destination, double baseFare, String pilotName, String licenseNumber, int experienceYears) {
        super(id, cd, ud, airportName, code, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare);
        this.pilotName = (pilotName == null || pilotName.isBlank()) ? "Captain" : pilotName;
        this.licenseNumber = (licenseNumber == null || licenseNumber.isBlank()) ? "LIC000" : licenseNumber;
        this.experienceYears = experienceYears >= 2 ? experienceYears : 2;
    }
    public void display() { System.out.println("Pilot: " + pilotName + " license=" + licenseNumber + " exp=" + experienceYears); }
}

