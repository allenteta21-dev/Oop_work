package ID_27409.Q3;

class TaxAssessment extends TaxDeclaration {
    private String assessmentDate;
    private double assessedTax;
    public TaxAssessment(int id, String cd, String ud, String authorityName, String region, String email, String categoryName, String code, double rate, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact, String employeeName, double salary, String employeeTIN, String declarationMonth, double totalIncome, String assessmentDate, double assessedTax) {
        super(id, cd, ud, authorityName, region, email, categoryName, code, rate, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN, declarationMonth, totalIncome);
        this.assessmentDate = (assessmentDate == null || assessmentDate.isBlank()) ? "1970-01-01" : assessmentDate;
        this.assessedTax = assessedTax >= 0 ? assessedTax : 0.0;
    }
    public void display() { System.out.println("TaxAssessment: date=" + assessmentDate + " assessedTax=" + assessedTax); }
}
