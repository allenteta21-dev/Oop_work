package ID_27409.Q6;

class PayrollPeriod extends Employee {
    private int month;
    private int year;
    private String startDate;
    private String endDate;

    public PayrollPeriod(int id, String cd, String ud, String orgName, String orgCode, String rssbNumber, String contactEmail, String deptName, String deptCode, String managerName, int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered, int month, int year, String startDate, String endDate) {
        super(id, cd, ud, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered);
        this.month = (month >= 1 && month <= 12) ? month : 1;
        this.year = (year >= 2000) ? year : 2000;
        this.startDate = (startDate == null || startDate.isBlank()) ? "1970-01-01" : startDate;
        this.endDate = (endDate == null || endDate.isBlank()) ? "1970-01-01" : endDate;
    }

    public void display() { System.out.println("PayrollPeriod: " + month + "/" + year + " from=" + startDate + " to=" + endDate); }
}