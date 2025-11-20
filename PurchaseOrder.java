package ID_27409.Q4;

class PurchaseOrder extends Product {
    private String poNumber;
    private String orderDate;
    private double totalAmount;
    public PurchaseOrder(int id, String cd, String ud, String orgName, String orgCode, String address, String contactEmail, String deptName, String deptCode, String supplierName, String supplierTIN, String contact, String productName, double unitPrice, int quantity, String poNumber, String orderDate, double totalAmount) {
        super(id, cd, ud, orgName, orgCode, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact, productName, unitPrice, quantity);
        this.poNumber = (poNumber == null || poNumber.isBlank()) ? "PO000" : poNumber;
        this.orderDate = (orderDate == null || orderDate.isBlank()) ? "1970-01-01" : orderDate;
        this.totalAmount = totalAmount > 0 ? totalAmount : lineTotal();
    }
    public void display() { System.out.println("PurchaseOrder: " + poNumber + " date=" + orderDate + " total=" + totalAmount); }
}