package ID_27409.Q4;

class Supplier extends Department {
    private String supplierName;
    private String supplierTIN;
    private String contact;
    public Supplier(int id, String cd, String ud, String orgName, String orgCode, String address, String contactEmail, String deptName, String deptCode, String supplierName, String supplierTIN, String contact) {
        super(id, cd, ud, orgName, orgCode, address, contactEmail, deptName, deptCode);
        this.supplierName = (supplierName == null || supplierName.isBlank()) ? "Supplier" : supplierName;
        this.supplierTIN = (supplierTIN != null && supplierTIN.matches("\\d{9}")) ? supplierTIN : "000000000";
        this.contact = (contact != null && contact.matches("\\d{10}")) ? contact : "0000000000";
    }
    public void display() { System.out.println("Supplier: " + supplierName + " TIN=" + supplierTIN + " contact=" + contact); }
}