package ID_27409.Q2;

class CabinCrew extends Pilot {
    private String crewName;
    private String role;
    private String shift;

    public CabinCrew(int id, String cd, String ud, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail, String flightNumber, String departure, String destination, double baseFare, String pilotName, String licenseNumber, int experienceYears, String crewName, String role, String shift) {
        super(id, cd, ud, airportName, code, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears);
        this.crewName = (crewName == null || crewName.isBlank()) ? "Crew" : crewName;
        this.role = (role == null || role.isBlank()) ? "Attendant" : role;
        this.shift = ("Night".equalsIgnoreCase(shift) || "Day".equalsIgnoreCase(shift)) ? shift : "Day";
    }
    public void display() { System.out.println("CabinCrew: " + crewName + " role=" + role + " shift=" + shift); }
}

