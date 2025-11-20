package ID_27409.Q4;

class Organization extends Entity {
    private String orgName;
    private String orgCode;
    private String address;
    private String contactEmail;
    public Organization(int id, String cd, String ud, String orgName, String orgCode, String address, String contactEmail) {
        super(id, cd, ud);
        this.orgName = (orgName == null || orgName.isBlank()) ? "Org" : orgName;
        this.orgCode = (orgCode != null && orgCode.length() >=3) ? orgCode : "ORG";
        this.address = (address == null) ? "" : address;
        this.contactEmail = (contactEmail != null && contactEmail.contains("@")) ? contactEmail : "contact@org.com";
    }
    public void display() { System.out.println("Organization: " + orgName + " code=" + orgCode + " email=" + contactEmail + " addr=" + address); }
}