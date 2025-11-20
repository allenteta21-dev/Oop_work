package ID_27409.Q3;

class Payment extends TaxAssessment {
    private String paymentDate;
    private double paymentAmount;
    public Payment(int id, String cd, String ud, String authorityName, String region, String email, String categoryName, String code, double rate, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact, String employeeName, double salary, String employeeTIN, String declarationMonth, double totalIncome, String assessmentDate, double assessedTax, String paymentDate, double paymentAmount) {
        super(id, cd, ud, authorityName, region, email, categoryName, code, rate, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN, declarationMonth, totalIncome, assessmentDate, assessedTax);
        this.paymentDate = (paymentDate == null || paymentDate.isBlank()) ? "1970-01-01" : paymentDate;
        this.paymentAmount = paymentAmount > 0 ? paymentAmount : 0.0;
    }
    public void display() { System.out.println("Payment: date=" + paymentDate + " amount=" + paymentAmount); }
}