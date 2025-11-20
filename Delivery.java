package ID_27409.Q4;

class Delivery extends PurchaseOrder {
    private String deliveryDate;
    private String deliveredBy;
    public Delivery(int id, String cd, String ud, String orgName, String orgCode, String address, String contactEmail, String deptName, String deptCode, String supplierName, String supplierTIN, String contact, String productName, double unitPrice, int quantity, String poNumber, String orderDate, double totalAmount, String deliveryDate, String deliveredBy) {
        super(id, cd, ud, orgName, orgCode, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount);
        this.deliveryDate = (deliveryDate == null || deliveryDate.isBlank()) ? "1970-01-01" : deliveryDate;
        this.deliveredBy = (deliveredBy == null || deliveredBy.isBlank()) ? "Courier" : deliveredBy;
    }
    public void display() { System.out.println("Delivery: date=" + deliveryDate + " deliveredBy=" + deliveredBy); }
}