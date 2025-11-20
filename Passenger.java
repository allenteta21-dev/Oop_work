package ID_27409.Q2;

class Passenger extends CabinCrew {
    private String passengerName;
    private int age;
    private String gender;
    private String contact;

    public Passenger(int id, String cd, String ud, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail, String flightNumber, String departure, String destination, double baseFare, String pilotName, String licenseNumber, int experienceYears, String crewName, String role, String shift, String passengerName, int age, String gender, String contact) {
        super(id, cd, ud, airportName, code, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName, role, shift);
        this.passengerName = (passengerName == null || passengerName.isBlank()) ? "Passenger" : passengerName;
        this.age = age > 0 ? age : 1;
        this.gender = (gender == null || gender.isBlank()) ? "Other" : gender;
        this.contact = (contact == null) ? "" : contact;
    }
    public void display() { System.out.println("Passenger: " + passengerName + " age=" + age + " gender=" + gender + " contact=" + contact); }
}

