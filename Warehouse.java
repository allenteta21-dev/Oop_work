package ID_27409.Q1;

class Warehouse extends Entity {
    private String warehouseName;
    private String location;
    private String phone;

    public Warehouse(int id, String createdDate, String updatedDate, String warehouseName, String location, String phone) {
        super(id, createdDate, updatedDate);
        if (warehouseName == null || warehouseName.trim().isEmpty()) {
            warehouseName = "Default Warehouse";
        }
        if (location == null || location.trim().isEmpty()) {
            location = "Unknown";
        }
        if (phone == null || !phone.matches("\\d{10}")) {
            phone = "0000000000";
        }
        this.warehouseName = warehouseName;
        this.location = location;
        this.phone = phone;
    }
    public String getWarehouseName() {
        return warehouseName;
    }
    public String getLocation() {
        return location;
    }
    public String getPhone() {
        return phone;
    }

    public void display() {
        System.out.println("Warehouse: name=" + warehouseName + ", location=" + location + ", phone=" + phone);
    }
}