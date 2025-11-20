package ID_27409.Q6;

class Allowance extends Deduction {
    private double overtimeHours;
    private double overtimeRate;
    private double bonus;

    public Allowance(int id, String cd, String ud, String orgName, String orgCode, String rssbNumber, String contactEmail, String deptName, String deptCode, String managerName, int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered, int month, int year, String startDate, String endDate, double basicPay, double transportAllowance, double housingAllowance, double rssbContribution, double payeTax, double loanDeduction, double overtimeHours, double overtimeRate, double bonus) {
        super(id, cd, ud, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance, rssbContribution, payeTax, loanDeduction);
        this.overtimeHours = overtimeHours >= 0 ? overtimeHours : 0.0;
        this.overtimeRate = overtimeRate >= 0 ? overtimeRate : 0.0;
        this.bonus = bonus >= 0 ? bonus : 0.0;
    }

    public double totalAllowances() { return overtimeHours * overtimeRate + bonus; }
    public void display() { System.out.println("Allowance: overtimeH=" + overtimeHours + " rate=" + overtimeRate + " bonus=" + bonus + " totalAllow=" + totalAllowances()); }
}