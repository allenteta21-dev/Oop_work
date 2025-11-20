package ID_27409.Q6;

import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PAYROLL SYSTEM (Q6) ===");

        System.out.print("id (int > 0): ");
        int id = readInt(sc);
        System.out.print("createdDate (yyyy-mm-dd): ");
        String createdDate = readNonEmpty(sc, "1970-01-01");
        System.out.print("updatedDate (yyyy-mm-dd): ");
        String updatedDate = readNonEmpty(sc, "1970-01-01");

        System.out.println("\n--- ORGANIZATION ---");
        System.out.print("orgName: ");
        String orgName = readNonEmpty(sc, "Org");
        System.out.print("orgCode (>=3 chars): ");
        String orgCode = sc.nextLine().trim();
        if (orgCode.length() < 3) orgCode = "ORG";
        System.out.print("rssbNumber (8 digits): ");
        String rssbNumber = sc.nextLine().trim();
        if (!rssbNumber.matches("\\d{8}")) rssbNumber = "00000000";
        System.out.print("contactEmail: ");
        String contactEmail = sc.nextLine().trim();
        if (!isValidEmail(contactEmail)) contactEmail = "contact@org.com";

        System.out.println("\n--- DEPARTMENT ---");
        System.out.print("deptName: ");
        String deptName = readNonEmpty(sc, "Dept");
        System.out.print("deptCode (>=3 chars): ");
        String deptCode = sc.nextLine().trim();
        if (!deptCode.matches("[A-Za-z0-9]{3,}")) deptCode = "D01";
        System.out.print("managerName: ");
        String managerName = readNonEmpty(sc, "Manager");

        System.out.println("\n--- EMPLOYEE ---");
        System.out.print("employeeID (int >=1000): ");
        int employeeID = readInt(sc);
        if (employeeID < 1000) employeeID = 1000;
        System.out.print("fullName: ");
        String fullName = readNonEmpty(sc, "Employee");
        System.out.print("position: ");
        String position = readNonEmpty(sc, "");
        System.out.print("baseSalary (>0): ");
        double baseSalary = readDouble(sc);
        if (baseSalary <= 0) baseSalary = 1000.0;
        System.out.print("rssbRegistered (true/false): ");
        boolean rssbRegistered = Boolean.parseBoolean(sc.nextLine().trim());

        System.out.println("\n--- PAYROLL PERIOD ---");
        System.out.print("month (1-12): ");
        int month = readInt(sc);
        if (month < 1 || month > 12) month = 1;
        System.out.print("year (>=2000): ");
        int year = readInt(sc);
        if (year < 2000) year = 2000;
        System.out.print("startDate: ");
        String startDate = readNonEmpty(sc, "1970-01-01");
        System.out.print("endDate: ");
        String endDate = readNonEmpty(sc, "1970-01-01");

        System.out.println("\n--- SALARY STRUCTURE ---");
        System.out.print("basicPay (>=0): ");
        double basicPay = readDouble(sc);
        if (basicPay < 0) basicPay = baseSalary;
        System.out.print("transportAllowance (>=0): ");
        double transportAllowance = readDouble(sc);
        if (transportAllowance < 0) transportAllowance = 0.0;
        System.out.print("housingAllowance (>=0): ");
        double housingAllowance = readDouble(sc);
        if (housingAllowance < 0) housingAllowance = 0.0;

        System.out.println("\n--- DEDUCTIONS ---");
        System.out.print("rssbContribution (enter -1 to auto compute 5% of basic): ");
        double rssbContribution = readDouble(sc);
        if (rssbContribution < 0) rssbContribution = basicPay * 0.05;
        System.out.print("payeTax (>=0): ");
        double payeTax = readDouble(sc);
        if (payeTax < 0) payeTax = 0.0;
        System.out.print("loanDeduction (>=0): ");
        double loanDeduction = readDouble(sc);
        if (loanDeduction < 0) loanDeduction = 0.0;

        System.out.println("\n--- ALLOWANCES ---");
        System.out.print("overtimeHours (>=0): ");
        double overtimeHours = readDouble(sc);
        if (overtimeHours < 0) overtimeHours = 0.0;
        System.out.print("overtimeRate (>=0): ");
        double overtimeRate = readDouble(sc);
        if (overtimeRate < 0) overtimeRate = 0.0;
        System.out.print("bonus (>=0): ");
        double bonus = readDouble(sc);
        if (bonus < 0) bonus = 0.0;

        System.out.print("\nEnter payslipNumber: ");
        String payslipNumber = readNonEmpty(sc, "PS000");
        System.out.print("issueDate: ");
        String issueDate = readNonEmpty(sc, "1970-01-01");

        // instantiate chain
        Organization org = new Organization(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail);
        Department dept = new Department(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName);
        Employee emp = new Employee(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered);
        PayrollPeriod period = new PayrollPeriod(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate);
        SalaryStructure ss = new SalaryStructure(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance);
        Deduction ded = new Deduction(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance, rssbContribution, payeTax, loanDeduction);
        Allowance alw = new Allowance(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance, rssbContribution, payeTax, loanDeduction, overtimeHours, overtimeRate, bonus);
        Payroll payroll = new Payroll(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance, rssbContribution, payeTax, loanDeduction, overtimeHours, overtimeRate, bonus);
        Payslip payslip = new Payslip(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance, rssbContribution, payeTax, loanDeduction, overtimeHours, overtimeRate, bonus, payslipNumber, issueDate);

        System.out.println("\n--- DISPLAY (Q6) ---");
        org.display();
        dept.display();
        emp.display();
        period.display();
        ss.display();
        ded.display();
        alw.display();
        payroll.display();
        payslip.display();

        payslip.generatePayslip();

        sc.close();
    }

    private static int readInt(Scanner sc) {
        while (true) {
            String s = sc.nextLine().trim();
            try { return Integer.parseInt(s); } catch (Exception e) { System.out.print("Enter a valid integer: "); }
        }
    }

    private static double readDouble(Scanner sc) {
        while (true) {
            String s = sc.nextLine().trim();
            try { return Double.parseDouble(s); } catch (Exception e) { System.out.print("Enter a valid number: "); }
        }
    }

    private static String readNonEmpty(Scanner sc, String def) {
        String s = sc.nextLine().trim();
        return s.isEmpty() ? def : s;
    }

    private static boolean isValidEmail(String e) {
        return e != null && e.contains("@") && e.indexOf('@') > 0 && e.indexOf('@') < e.length() - 1;
    }
}