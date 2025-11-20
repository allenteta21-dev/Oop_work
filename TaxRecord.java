package ID_27409.Q3;

final class TaxRecord extends Payment {
    private String receiptNo;
    private double totalTax;
    public TaxRecord(int id, String cd, String ud, String authorityName, String region, String email, String categoryName, String code, double rate, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact, String employeeName, double salary, String employeeTIN, String declarationMonth, double totalIncome, String assessmentDate, double assessedTax, String paymentDate, double paymentAmount, String receiptNo, double totalTax) {
        super(id, cd, ud, authorityName, region, email, categoryName, code, rate, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN, declarationMonth, totalIncome, assessmentDate, assessedTax, paymentDate, paymentAmount);
        this.receiptNo = (receiptNo == null || receiptNo.isBlank()) ? "RCPT000" : receiptNo;
        this.totalTax = totalTax >= 0 ? totalTax : 0.0;
    }
    public double computeTax(double salary, double rate, double credits) {
        double tax = salary * rate;
        double payable = tax - credits;
        return payable < 0 ? 0.0 : payable;
    }
    public void setTotalTax(double t) { this.totalTax = t >= 0 ? t : 0.0; }
    public void display() { System.out.println("TaxRecord: receipt=" + receiptNo + " totalTax=" + totalTax); }
}