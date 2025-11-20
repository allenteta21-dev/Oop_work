package ID_27409.Q6;

class Payroll extends Allowance {
    private double grossSalary;
    private double totalDeductions;
    private double netSalary;

    public Payroll(int id, String cd, String ud, String orgName, String orgCode, String rssbNumber, String contactEmail, String deptName, String deptCode, String managerName, int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered, int month, int year, String startDate, String endDate, double basicPay, double transportAllowance, double housingAllowance, double rssbContribution, double payeTax, double loanDeduction, double overtimeHours, double overtimeRate, double bonus) {
        super(id, cd, ud, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance, rssbContribution, payeTax, loanDeduction, overtimeHours, overtimeRate, bonus);
        this.grossSalary = gross();
        this.totalDeductions = totalDeductions();
        this.netSalary = grossSalary + totalAllowances() - totalDeductions;
    }

    public double getNetSalary() { return netSalary; }
    public void display() { System.out.println("Payroll: gross=" + grossSalary + " deductions=" + totalDeductions + " net=" + netSalary); }
}
