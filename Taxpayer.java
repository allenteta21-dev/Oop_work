package ID_27409.Q3;

class Taxpayer extends TaxCategory {
    private String tin;
    private String taxpayerName;
    private String address;
    public Taxpayer(int id, String cd, String ud, String authorityName, String region, String email, String categoryName, String code, double rate, String tin, String taxpayerName, String address) {
        super(id, cd, ud, authorityName, region, email, categoryName, code, rate);
        this.tin = (tin != null && tin.matches("\\d{9}")) ? tin : "000000000";
        this.taxpayerName = (taxpayerName == null || taxpayerName.isBlank()) ? "Unknown" : taxpayerName;
        this.address = (address == null) ? "" : address;
    }
    public void display() { System.out.println("Taxpayer: TIN=" + tin + " name=" + taxpayerName + " addr=" + address); }
}
