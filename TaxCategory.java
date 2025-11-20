package ID_27409.Q3;

class TaxCategory extends TaxAuthority {
    private String categoryName;
    private String code;
    private double rate;
    public TaxCategory(int id, String cd, String ud, String authorityName, String region, String email, String categoryName, String code, double rate) {
        super(id, cd, ud, authorityName, region, email);
        this.categoryName = (categoryName == null || categoryName.isBlank()) ? "General" : categoryName;
        this.code = (code != null && code.length() >= 3) ? code : "CAT";
        this.rate = rate > 0 ? rate : 0.0;
    }
    public double getRate() { return rate; }
    public void display() { System.out.println("TaxCategory: " + categoryName + " code=" + code + " rate=" + rate); }
}


