package ID_27409.Q3;

class Employer extends Taxpayer {
    private String employerName;
    private String employerTIN;
    private String contact;
    public Employer(int id, String cd, String ud, String authorityName, String region, String email, String categoryName, String code, double rate, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact) {
        super(id, cd, ud, authorityName, region, email, categoryName, code, rate, tin, taxpayerName, address);
        this.employerName = (employerName == null || employerName.isBlank()) ? "Employer" : employerName;
        this.employerTIN = (employerTIN != null && employerTIN.matches("\\d{9}")) ? employerTIN : "000000000";
        this.contact = (contact != null && contact.matches("\\d{10}")) ? contact : "0000000000";
    }
    public void display() { System.out.println("Employer: name=" + employerName + " TIN=" + employerTIN + " contact=" + contact); }
}
