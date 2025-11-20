package ID_27409.Q6;

class Payslip extends Payroll {
    private String payslipNumber;
    private String issueDate;

    public Payslip(int id, String cd, String ud, String orgName, String orgCode, String rssbNumber, String contactEmail, String deptName, String deptCode, String managerName, int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered, int month, int year, String startDate, String endDate, double basicPay, double transportAllowance, double housingAllowance, double rssbContribution, double payeTax, double loanDeduction, double overtimeHours, double overtimeRate, double bonus, String payslipNumber, String issueDate) {
        super(id, cd, ud, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance, rssbContribution, payeTax, loanDeduction, overtimeHours, overtimeRate, bonus);
        this.payslipNumber = (payslipNumber == null || payslipNumber.isBlank()) ? "PS000" : payslipNumber;
        this.issueDate = (issueDate == null || issueDate.isBlank()) ? "1970-01-01" : issueDate;
    }

    // generatePayslip: prints RSSB, PAYE, Gross, Net
    public void generatePayslip() {
        double basic = getBasicPay();
        double rssb = basic * 0.05;
        double net = getNetSalary();
        System.out.println("\n--- GENERATED PAYSLIP ---");
        System.out.println("Payslip#: " + payslipNumber + " IssueDate: " + issueDate);
        System.out.printf("Basic: %.2f RSSB(5%%): %.2f Net Pay: %.2f%n", basic, rssb, net);
    }
}