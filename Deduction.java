package ID_27409.Q6;

class Deduction extends SalaryStructure {
    private double rssbContribution;
    private double payeTax;
    private double loanDeduction;

    public Deduction(int id, String cd, String ud, String orgName, String orgCode, String rssbNumber, String contactEmail, String deptName, String deptCode, String managerName, int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered, int month, int year, String startDate, String endDate, double basicPay, double transportAllowance, double housingAllowance, double rssbContribution, double payeTax, double loanDeduction) {
        super(id, cd, ud, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance);
        this.rssbContribution = rssbContribution >= 0 ? rssbContribution : getBasicPay() * 0.05;
        this.payeTax = payeTax >= 0 ? payeTax : 0.0;
        this.loanDeduction = loanDeduction >= 0 ? loanDeduction : 0.0;
    }

    public double totalDeductions() { return rssbContribution + payeTax + loanDeduction; }
    public void display() { System.out.println("Deduction: RSSB=" + rssbContribution + " PAYE=" + payeTax + " Loan=" + loanDeduction + " totalDed=" + totalDeductions()); }
}