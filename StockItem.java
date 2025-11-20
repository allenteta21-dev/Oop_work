package ID_27409.Q1;

class StockItem extends Product {
    private int quantityAvailable;
    private int reorderLevel;

    public StockItem(int id, String createdDate, String updatedDate, String warehouseName, String location, String phone, String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone, String productName, double unitPrice, int stockLimit, int quantityAvailable, int reorderLevel) {
        super(id, createdDate, updatedDate, warehouseName, location, phone, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit);
        if (quantityAvailable < 0) {
            quantityAvailable = 0;
        }
        if (reorderLevel < 0) {
            reorderLevel = 0;
        }
        this.quantityAvailable = quantityAvailable;
        this.reorderLevel = reorderLevel;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }
    public void setQuantityAvailable(int q) {
        if (q < 0) {
            q = 0;
        }
        this.quantityAvailable = q;
    }
    public int getReorderLevel() {
        return reorderLevel;
    }

    public void display() {
        System.out.println("StockItem: quantityAvailable=" + quantityAvailable + ", reorderLevel=" + reorderLevel);
    }
}

