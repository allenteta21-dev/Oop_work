package ID_27409.Q3;

class Employee extends Employer {
    private String employeeName;
    private double salary;
    private String employeeTIN;
    public Employee(int id, String cd, String ud, String authorityName, String region, String email, String categoryName, String code, double rate, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact, String employeeName, double salary, String employeeTIN) {
        super(id, cd, ud, authorityName, region, email, categoryName, code, rate, tin, taxpayerName, address, employerName, employerTIN, contact);
        this.employeeName = (employeeName == null || employeeName.isBlank()) ? "Employee" : employeeName;
        this.salary = salary > 0 ? salary : 0.0;
        this.employeeTIN = (employeeTIN != null && employeeTIN.matches("\\d{9}")) ? employeeTIN : "000000000";
    }
    public double getSalary() { return salary; }
    public void display() { System.out.println("Employee: name=" + employeeName + " salary=" + salary + " TIN=" + employeeTIN); }
}