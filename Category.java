package ID_27409.Q1;

class Category extends Warehouse {
    private String categoryName;
    private String categoryCode;

    public Category(int id, String createdDate, String updatedDate, String warehouseName, String location, String phone, String categoryName, String categoryCode) {
        super(id, createdDate, updatedDate, warehouseName, location, phone);
        if (categoryName == null || categoryName.trim().isEmpty()) {
            categoryName = "General";
        }
        if (categoryCode == null || !categoryCode.matches("[A-Za-z0-9]{3,}")) {
            categoryCode = "CAT001";
        }
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }
    public String getCategoryCode() {
        return categoryCode;
    }

    public void display() {
        System.out.println("Category: name=" + categoryName + ", code=" + categoryCode);
    }
}
