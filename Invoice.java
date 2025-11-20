package ID_27409.Q4;

class Invoice extends Inspection {
    private String invoiceNo;
    private double invoiceAmount;
    public Invoice(int id, String cd, String ud, String orgName, String orgCode, String address, String contactEmail, String deptName, String deptCode, String supplierName, String supplierTIN, String contact, String productName, double unitPrice, int quantity, String poNumber, String orderDate, double totalAmount, String deliveryDate, String deliveredBy, String inspectorName, String status, String remarks, String invoiceNo, double invoiceAmount) {
        super(id, cd, ud, orgName, orgCode, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy, inspectorName, status, remarks);
        this.invoiceNo = (invoiceNo == null || invoiceNo.isBlank()) ? "INV000" : invoiceNo;
        this.invoiceAmount = invoiceAmount > 0 ? invoiceAmount : totalAmount;
    }
    public double getInvoiceAmount() { return invoiceAmount; }
    public void display() { System.out.println("Invoice: no=" + invoiceNo + " amount=" + invoiceAmount); }
}
