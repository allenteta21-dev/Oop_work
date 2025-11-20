package ID_27409.Q6;

class Department extends Organization {
    private String deptName;
    private String deptCode;
    private String managerName;

    public Department(int id, String cd, String ud, String orgName, String orgCode, String rssbNumber, String contactEmail, String deptName, String deptCode, String managerName) {
        super(id, cd, ud, orgName, orgCode, rssbNumber, contactEmail);
        this.deptName = (deptName == null || deptName.isBlank()) ? "Dept" : deptName;
        this.deptCode = (deptCode != null && deptCode.matches("[A-Za-z0-9]{3,}")) ? deptCode : "D01";
        this.managerName = (managerName == null || managerName.isBlank()) ? "Manager" : managerName;
    }

    public void display() { System.out.println("Department: " + deptName + " code=" + deptCode + " manager=" + managerName); }
}
