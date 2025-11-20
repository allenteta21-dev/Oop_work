package ID_27409.Q1;

class Supplier extends Category {
    private String supplierName;
    private String supplierEmail;
    private String supplierPhone;

    public Supplier(int id, String createdDate, String updatedDate, String warehouseName, String location, String phone, String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone) {
        super(id, createdDate, updatedDate, warehouseName, location, phone, categoryName, categoryCode);
        if (supplierName == null || supplierName.trim().isEmpty()) {
            supplierName = "Unknown Supplier";
        }
        if (supplierEmail == null || !supplierEmail.contains("@")) {
            supplierEmail = "unknown@supplier.com";
        }
        if (supplierPhone == null || !supplierPhone.matches("\\d{10}")) {
            supplierPhone = "0000000000";
        }
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.supplierPhone = supplierPhone;
    }

    public String getSupplierName() {
        return supplierName;
    }
    public String getSupplierEmail() {
        return supplierEmail;
    }
    public String getSupplierPhone() {
        return supplierPhone;
    }

    public void display() {
        System.out.println("Supplier: name=" + supplierName + ", email=" + supplierEmail + ", phone=" + supplierPhone);
    }
}

