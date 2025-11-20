package ID_27409.Q4;

class Inspection extends Delivery {
    private String inspectorName;
    private String status;
    private String remarks;
    public Inspection(int id, String cd, String ud, String orgName, String orgCode, String address, String contactEmail, String deptName, String deptCode, String supplierName, String supplierTIN, String contact, String productName, double unitPrice, int quantity, String poNumber, String orderDate, double totalAmount, String deliveryDate, String deliveredBy, String inspectorName, String status, String remarks) {
        super(id, cd, ud, orgName, orgCode, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy);
        this.inspectorName = (inspectorName == null || inspectorName.isBlank()) ? "Inspector" : inspectorName;
        this.status = ("Passed".equalsIgnoreCase(status) || "Failed".equalsIgnoreCase(status)) ? status : "Passed";
        this.remarks = (remarks == null) ? "" : remarks;
    }
    public void display() { System.out.println("Inspection: inspector=" + inspectorName + " status=" + status + " remarks=" + remarks); }
}