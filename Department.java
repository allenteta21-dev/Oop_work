package ID_27409.Q4;

class Department extends Organization {
    private String deptName;
    private String deptCode;
    public Department(int id, String cd, String ud, String orgName, String orgCode, String address, String contactEmail, String deptName, String deptCode) {
        super(id, cd, ud, orgName, orgCode, address, contactEmail);
        this.deptName = (deptName == null || deptName.isBlank()) ? "Dept" : deptName;
        this.deptCode = (deptCode != null && deptCode.matches("[A-Za-z0-9]{3,}")) ? deptCode : "D01";
    }
    public void display() { System.out.println("Department: " + deptName + " code=" + deptCode); }
}
