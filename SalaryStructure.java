package ID_27409.Q6;

class SalaryStructure extends PayrollPeriod {
    private double basicPay;
    private double transportAllowance;
    private double housingAllowance;

    public SalaryStructure(int id, String cd, String ud, String orgName, String orgCode, String rssbNumber, String contactEmail, String deptName, String deptCode, String managerName, int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered, int month, int year, String startDate, String endDate, double basicPay, double transportAllowance, double housingAllowance) {
        super(id, cd, ud, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate);
        this.basicPay = basicPay >= 0 ? basicPay : 0.0;
        this.transportAllowance = transportAllowance >= 0 ? transportAllowance : 0.0;
        this.housingAllowance = housingAllowance >= 0 ? housingAllowance : 0.0;
    }

    public double gross() { return basicPay + transportAllowance + housingAllowance; }
    public double getBasicPay() { return basicPay; }
    public void display() { System.out.println("SalaryStructure: basic=" + basicPay + " transport=" + transportAllowance + " housing=" + housingAllowance + " gross=" + gross()); }
}