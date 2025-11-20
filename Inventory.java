package ID_27409.Q1;

class Inventory extends Sale {
    private int totalItems;
    private double stockValue;

    public Inventory(int id, String createdDate, String updatedDate, String warehouseName, String location, String phone, String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone, String productName, double unitPrice, int stockLimit, int quantityAvailable, int reorderLevel, int totalItems, double stockValue) {
        super(id, createdDate, updatedDate, warehouseName, location, phone, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable, reorderLevel, "1970-01-01", 1, supplierName, "1970-01-01", 0, "cust");
        if (totalItems < 0) {
            totalItems = 0;
        }
        if (stockValue < 0) {
            stockValue = 0.0;
        }
        this.totalItems = totalItems;
        this.stockValue = stockValue;
    }

    public int getTotalItems() {
        return totalItems;
    }
    public double getStockValue() {
        return stockValue;
    }

    public void display() {
        System.out.println("Inventory: totalItems=" + totalItems + ", stockValue=" + stockValue);
    }
}

