package ID_27409.Q1;

class Product extends Supplier {
    private String productName;
    private double unitPrice;
    private int stockLimit;

    public Product(int id, String createdDate, String updatedDate, String warehouseName, String location, String phone, String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone, String productName, double unitPrice, int stockLimit) {
        super(id, createdDate, updatedDate, warehouseName, location, phone, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone);
        if (productName == null || productName.trim().isEmpty()) {
            productName = "Unnamed Product";
        }
        if (unitPrice <= 0) {
            unitPrice = 1.0;
        }
        if (stockLimit < 0) {
            stockLimit = 0;
        }
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.stockLimit = stockLimit;
    }

    public String getProductName() {
        return productName;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public int getStockLimit() {
        return stockLimit;
    }

    public void display() {
        System.out.println("Product: name=" + productName + ", unitPrice=" + unitPrice + ", stockLimit=" + stockLimit);
    }
}

