package ID_27409.Q1;

class Purchase extends StockItem {
    private String purchaseDate;
    private int purchasedQuantity;
    private String supplierRef;

    public Purchase(int id, String createdDate, String updatedDate, String warehouseName, String location, String phone, String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone, String productName, double unitPrice, int stockLimit, int quantityAvailable, int reorderLevel, String purchaseDate, int purchasedQuantity, String supplierRef) {
        super(id, createdDate, updatedDate, warehouseName, location, phone, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable, reorderLevel);
        if (purchaseDate == null || purchaseDate.trim().isEmpty()) {
            purchaseDate = "1970-01-01";
        }
        if (purchasedQuantity <= 0) {
            purchasedQuantity = 1;
        }
        if (supplierRef == null || supplierRef.trim().isEmpty()) {
            supplierRef = "Unknown Supplier";
        }
        this.purchaseDate = purchaseDate;
        this.purchasedQuantity = purchasedQuantity;
        this.supplierRef = supplierRef;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }
    public int getPurchasedQuantity() {
        return purchasedQuantity;
    }
    public String getSupplierRef() {
        return supplierRef;
    }

    public void display() {
        System.out.println("Purchase: date=" + purchaseDate + ", purchasedQuantity=" + purchasedQuantity + ", supplier=" + supplierRef);
    }
}

