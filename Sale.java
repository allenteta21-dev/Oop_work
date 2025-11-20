package ID_27409.Q1;

class Sale extends Purchase {
    private String saleDate;
    private int soldQuantity;
    private String customerName;

    public Sale(int id, String createdDate, String updatedDate, String warehouseName, String location, String phone, String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone, String productName, double unitPrice, int stockLimit, int quantityAvailable, int reorderLevel, String purchaseDate, int purchasedQuantity, String supplierRef, String saleDate, int soldQuantity, String customerName) {
        super(id, createdDate, updatedDate, warehouseName, location, phone, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable, reorderLevel, purchaseDate, purchasedQuantity, supplierRef);
        if (saleDate == null || saleDate.trim().isEmpty()) {
            saleDate = "1970-01-01";
        }
        if (soldQuantity < 0) {
            soldQuantity = 0;
        }
        if (customerName == null || customerName.trim().isEmpty()) {
            customerName = "Anonymous";
        }
        this.saleDate = saleDate;
        this.soldQuantity = soldQuantity;
        this.customerName = customerName;
    }

    public String getSaleDate() {
        return saleDate;
    }
    public int getSoldQuantity() {
        return soldQuantity;
    }
    public String getCustomerName() {
        return customerName;
    }

    public void display() {
        System.out.println("Sale: date=" + saleDate + ", soldQuantity=" + soldQuantity + ", customer=" + customerName);
    }
}

