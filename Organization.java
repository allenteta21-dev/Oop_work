package ID_27409.Q6;

class Organization extends Entity {
    private String orgName;
    private String orgCode;
    private String rssbNumber;
    private String contactEmail;

    public Organization(int id, String cd, String ud, String orgName, String orgCode, String rssbNumber, String contactEmail) {
        super(id, cd, ud);
        this.orgName = (orgName == null || orgName.isBlank()) ? "Org" : orgName;
        this.orgCode = (orgCode != null && orgCode.length() >= 3) ? orgCode : "ORG";
        this.rssbNumber = (rssbNumber != null && rssbNumber.matches("\\d{8}")) ? rssbNumber : "00000000";
        this.contactEmail = (contactEmail != null && contactEmail.contains("@")) ? contactEmail : "contact@org.com";
    }

    public void display() { System.out.println("Organization: " + orgName + " code=" + orgCode + " RSSB=" + rssbNumber + " email=" + contactEmail); }
}