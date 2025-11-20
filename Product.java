package ID_27409.Q4;

class Product extends Supplier {
    private String productName;
    private double unitPrice;
    private int quantity;
    public Product(int id, String cd, String ud, String orgName, String orgCode, String address, String contactEmail, String deptName, String deptCode, String supplierName, String supplierTIN, String contact, String productName, double unitPrice, int quantity) {
        super(id, cd, ud, orgName, orgCode, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact);
        this.productName = (productName == null || productName.isBlank()) ? "Product" : productName;
        this.unitPrice = unitPrice > 0 ? unitPrice : 0.0;
        this.quantity = quantity >= 0 ? quantity : 0;
    }
    public double lineTotal() { return unitPrice * quantity; }
    public void display() { System.out.println("Product: " + productName + " unitPrice=" + unitPrice + " qty=" + quantity + " lineTotal=" + lineTotal()); }
}