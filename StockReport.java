package ID_27409.Q1;

final class StockReport extends Inventory {
    private String reportDate;
    private String remarks;

    public StockReport(int id, String createdDate, String updatedDate, String warehouseName, String location, String phone, String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone, String productName, double unitPrice, int stockLimit, int quantityAvailable, int reorderLevel, int totalItems, double stockValue, String reportDate, String remarks) {
        super(id, createdDate, updatedDate, warehouseName, location, phone, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable, reorderLevel, totalItems, stockValue);
        if (reportDate == null || reportDate.trim().isEmpty()) {
            reportDate = "1970-01-01";
        }
        if (remarks == null) {
            remarks = "";
        }
        this.reportDate = reportDate;
        this.remarks = remarks;
    }

    public void generateReport() {
        System.out.println("\n--- STOCK REPORT ---");
        System.out.println("Report Date: " + reportDate);
        System.out.println("Remarks: " + remarks);
        System.out.println("Total Items in Stock: " + getTotalItems());
        System.out.println("Total Stock Value: " + getStockValue());
        System.out.println("---------------------");
    }

    public void display() {
        System.out.println("StockReport: reportDate=" + reportDate + ", remarks=" + remarks + ", totalItems=" + getTotalItems() + ", stockValue=" + getStockValue());
    }
}

