package ID_27409.Q2;

class Airport extends Entity {
    private String airportName;
    private String code;
    private String location;

    public Airport(int id, String cd, String ud, String airportName, String code, String location) {
        super(id, cd, ud);
        this.airportName = (airportName == null || airportName.isBlank()) ? "Unknown Airport" : airportName;
        this.code = (code != null && code.matches("[A-Z]{3}")) ? code : "XXX";
        this.location = (location == null || location.isBlank()) ? "Unknown" : location;
    }
    public String getAirportName() { return airportName; }
    public String getCode() { return code; }
    public String getLocation() { return location; }
    public void display() { System.out.println("Airport: " + airportName + " (" + code + ") location=" + location); }
}

