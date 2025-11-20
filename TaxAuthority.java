package ID_27409.Q3;

class TaxAuthority extends Entity {
    private String authorityName;
    private String region;
    private String email;
    public TaxAuthority(int id, String cd, String ud, String authorityName, String region, String email) {
        super(id, cd, ud);
        this.authorityName = (authorityName == null || authorityName.isBlank()) ? "TaxAuthority" : authorityName;
        this.region = (region == null) ? "" : region;
        this.email = (email != null && email.contains("@")) ? email : "contact@ta.gov";
    }
    public void display() { System.out.println("TaxAuthority: " + authorityName + " region=" + region + " email=" + email); }
}

