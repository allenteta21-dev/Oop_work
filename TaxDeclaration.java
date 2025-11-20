package ID_27409.Q3;

class TaxDeclaration extends Employee {
    private String declarationMonth;
    private double totalIncome;
    public TaxDeclaration(int id, String cd, String ud, String authorityName, String region, String email, String categoryName, String code, double rate, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact, String employeeName, double salary, String employeeTIN, String declarationMonth, double totalIncome) {
        super(id, cd, ud, authorityName, region, email, categoryName, code, rate, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN);
        this.declarationMonth = (declarationMonth == null || declarationMonth.isBlank()) ? "" : declarationMonth;
        this.totalIncome = totalIncome >= 0 ? totalIncome : 0.0;
    }
    public void display() { System.out.println("TaxDeclaration: month=" + declarationMonth + " totalIncome=" + totalIncome); }
}