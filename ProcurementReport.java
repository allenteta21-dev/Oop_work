package ID_27409.Q4;

class ProcurementReport extends Invoice {
    private String reportDate;
    private String summary;
    public ProcurementReport(int id, String cd, String ud, String orgName, String orgCode, String address, String contactEmail, String deptName, String deptCode, String supplierName, String supplierTIN, String contact, String productName, double unitPrice, int quantity, String poNumber, String orderDate, double totalAmount, String deliveryDate, String deliveredBy, String inspectorName, String status, String remarks, String invoiceNo, double invoiceAmount, String reportDate, String summary) {
        super(id, cd, ud, orgName, orgCode, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy, inspectorName, status, remarks, invoiceNo, invoiceAmount);
        this.reportDate = (reportDate == null || reportDate.isBlank()) ? "1970-01-01" : reportDate;
        this.summary = (summary == null) ? "" : summary;
    }
    // calculateTotal: for this scaffold returns the invoice amount (single invoice).
    public double calculateTotal() {
        return getInvoiceAmount();
    }
    public void display() { System.out.println("ProcurementReport: date=" + reportDate + " summary=" + summary + " total=" + calculateTotal()); }
}