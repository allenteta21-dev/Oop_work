package ID_27409.Q5;

class Department extends Institution {
    private String deptName;
    private String deptCode;

    public Department(int id, String cd, String ud, String institutionName, String code, String address, String deptName, String deptCode) {
        super(id, cd, ud, institutionName, code, address);
        this.deptName = (deptName == null || deptName.isBlank()) ? "Dept" : deptName;
        this.deptCode = (deptCode != null && deptCode.matches("[A-Za-z0-9]{3,}")) ? deptCode : "D01";
    }

    public void display() { System.out.println("Department: " + deptName + " code=" + deptCode); }
}