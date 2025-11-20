package ID_27409.Q5;

class Institution extends Entity {
    private String institutionName;
    private String code;
    private String address;

    public Institution(int id, String cd, String ud, String institutionName, String code, String address) {
        super(id, cd, ud);
        this.institutionName = (institutionName == null || institutionName.isBlank()) ? "Institution" : institutionName;
        this.code = (code != null && code.length() >= 3) ? code : "INST";
        this.address = (address == null) ? "" : address;
    }

    public void display() { System.out.println("Institution: " + institutionName + " code=" + code + " address=" + address); }
}
