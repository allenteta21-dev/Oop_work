package ID_27409.Q6;

class Employee extends Department {
    private int employeeID;
    private String fullName;
    private String position;
    private double baseSalary;
    private boolean rssbRegistered;

    public Employee(int id, String cd, String ud, String orgName, String orgCode, String rssbNumber, String contactEmail, String deptName, String deptCode, String managerName, int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered) {
        super(id, cd, ud, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName);
        this.employeeID = employeeID >= 1000 ? employeeID : 1000;
        this.fullName = (fullName == null || fullName.isBlank()) ? "Employee" : fullName;
        this.position = (position == null) ? "" : position;
        this.baseSalary = baseSalary > 0 ? baseSalary : 0.0;
        this.rssbRegistered = rssbRegistered;
    }

    public double getBaseSalary() { return baseSalary; }
    public void display() { System.out.println("Employee: ID=" + employeeID + " name=" + fullName + " pos=" + position + " baseSalary=" + baseSalary + " RSSBreg=" + rssbRegistered); }
}