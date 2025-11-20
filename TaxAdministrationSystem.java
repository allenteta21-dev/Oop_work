package ID_27409.Q3;

import java.util.Scanner;

class TaxAdministrationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== TAX ADMINISTRATION (Q3) ===");

        System.out.print("id (int > 0): ");
        int id = readInt(sc, 1);
        System.out.print("createdDate (yyyy-mm-dd): ");
        String createdDate = readNonEmpty(sc, "1970-01-01");
        System.out.print("updatedDate (yyyy-mm-dd): ");
        String updatedDate = readNonEmpty(sc, "1970-01-01");

        System.out.println("\n--- TAX AUTHORITY ---");
        System.out.print("authorityName: ");
        String authorityName = readNonEmpty(sc, "TaxAuthority");
        System.out.print("region: ");
        String region = readNonEmpty(sc, "Unknown");
        System.out.print("email: ");
        String email = sc.nextLine().trim();
        if (!isValidEmail(email)) { System.out.println("Invalid email, using contact@ta.gov"); email = "contact@ta.gov"; }

        TaxAuthority ta = new TaxAuthority(id, createdDate, updatedDate, authorityName, region, email);

        System.out.println("\n--- TAX CATEGORY ---");
        System.out.print("categoryName: ");
        String categoryName = readNonEmpty(sc, "General");
        System.out.print("code (>=3 chars): ");
        String code = sc.nextLine().trim();
        if (code.length() < 3) { System.out.println("Invalid code, using CAT"); code = "CAT"; }
        System.out.print("rate (e.g., 0.18 for 18%): ");
        double rate = readDouble(sc, 0.0);
        if (rate <= 0) { System.out.println("Invalid rate, set to 0.18"); rate = 0.18; }

        TaxCategory tc = new TaxCategory(id, createdDate, updatedDate, authorityName, region, email, categoryName, code, rate);

        System.out.println("\n--- TAXPAYER ---");
        String tin;
        while (true) {
            System.out.print("TIN (9 digits): ");
            tin = sc.nextLine().trim();
            try { validateTIN(tin); break; } catch (TaxDataException ex) { System.out.println(ex.getMessage()); }
        }
        System.out.print("taxpayerName: ");
        String taxpayerName = readNonEmpty(sc, "Unknown Taxpayer");
        System.out.print("address: ");
        String address = readNonEmpty(sc, "Unknown Address");

        Taxpayer tp = new Taxpayer(id, createdDate, updatedDate, authorityName, region, email, categoryName, code, rate, tin, taxpayerName, address);

        System.out.println("\n--- EMPLOYER ---");
        System.out.print("employerName: ");
        String employerName = readNonEmpty(sc, "EmployerCo");
        String employerTIN;
        while (true) {
            System.out.print("employerTIN (9 digits): ");
            employerTIN = sc.nextLine().trim();
            try { validateTIN(employerTIN); break; } catch (TaxDataException ex) { System.out.println(ex.getMessage()); }
        }
        System.out.print("contact (10-digit phone): ");
        String contact = sc.nextLine().trim();
        if (!contact.matches("\\d{10}")) { System.out.println("Invalid phone, using 0000000000"); contact = "0000000000"; }

        Employer emp = new Employer(id, createdDate, updatedDate, authorityName, region, email, categoryName, code, rate, tin, taxpayerName, address, employerName, employerTIN, contact);

        System.out.println("\n--- EMPLOYEE ---");
        System.out.print("employeeName: ");
        String employeeName = readNonEmpty(sc, "Employee");
        System.out.print("salary (>0): ");
        double salary = readDouble(sc, 0.0);
        if (salary <= 0) { System.out.println("Invalid salary, set to 1000.0"); salary = 1000.0; }
        String employeeTIN;
        while (true) {
            System.out.print("employeeTIN (9 digits): ");
            employeeTIN = sc.nextLine().trim();
            try { validateTIN(employeeTIN); break; } catch (TaxDataException ex) { System.out.println(ex.getMessage()); }
        }

        Employee employee = new Employee(id, createdDate, updatedDate, authorityName, region, email, categoryName, code, rate, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN);

        System.out.println("\n--- TAX DECLARATION ---");
        System.out.print("declarationMonth (e.g., 2025-11): ");
        String declarationMonth = readNonEmpty(sc, "1970-01");
        System.out.print("totalIncome (>=0): ");
        double totalIncome = readDouble(sc, 0.0);
        if (totalIncome < 0) { System.out.println("Invalid income, set to 0"); totalIncome = 0.0; }

        TaxDeclaration decl = new TaxDeclaration(id, createdDate, updatedDate, authorityName, region, email, categoryName, code, rate, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN, declarationMonth, totalIncome);

        System.out.println("\n--- TAX ASSESSMENT ---");
        System.out.print("assessmentDate: ");
        String assessmentDate = readNonEmpty(sc, "1970-01-01");
        System.out.print("assessedTax (>=0): ");
        double assessedTax = readDouble(sc, 0.0);
        if (assessedTax < 0) { System.out.println("Invalid tax, set to 0"); assessedTax = 0.0; }

        TaxAssessment assess = new TaxAssessment(id, createdDate, updatedDate, authorityName, region, email, categoryName, code, rate, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN, declarationMonth, totalIncome, assessmentDate, assessedTax);

        System.out.println("\n--- PAYMENT ---");
        System.out.print("paymentDate: ");
        String paymentDate = readNonEmpty(sc, "1970-01-01");
        System.out.print("paymentAmount (>0): ");
        double paymentAmount = readDouble(sc, 0.0);
        if (paymentAmount <= 0) { System.out.println("Invalid payment, set to 0"); paymentAmount = 0.0; }

        Payment payment = new Payment(id, createdDate, updatedDate, authorityName, region, email, categoryName, code, rate, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN, declarationMonth, totalIncome, assessmentDate, assessedTax, paymentDate, paymentAmount);

        System.out.println("\n--- TAX RECORD ---");
        System.out.print("receiptNo: ");
        String receiptNo = readNonEmpty(sc, "RCPT000");
        System.out.print("credits (>=0) to subtract from tax: ");
        double credits = readDouble(sc, 0.0);
        if (credits < 0) { System.out.println("Invalid credits, set to 0"); credits = 0.0; }

        TaxRecord record = new TaxRecord(id, createdDate, updatedDate, authorityName, region, email, categoryName, code, rate, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN, declarationMonth, totalIncome, assessmentDate, assessedTax, paymentDate, paymentAmount, receiptNo, 0.0);

        double payable = record.computeTax(salary, rate, credits);
        record.setTotalTax(payable);

        System.out.println("\n--- DISPLAY ALL DATA (Q3) ---");
        ta.display();
        tc.display();
        tp.display();
        emp.display();
        employee.display();
        decl.display();
        assess.display();
        payment.display();
        record.display();

        System.out.printf("Computed Payable Tax: %.2f%n", payable);

        sc.close();
    }

    private static int readInt(Scanner sc, int def) {
        while (true) {
            String s = sc.nextLine().trim();
            try { return Integer.parseInt(s); } catch (Exception e) { System.out.print("Enter a valid integer: "); }
        }
    }
    private static double readDouble(Scanner sc, double def) {
        while (true) {
            String s = sc.nextLine().trim();
            try { return Double.parseDouble(s); } catch (Exception e) { System.out.print("Enter a valid number: "); }
        }
    }
    private static String readNonEmpty(Scanner sc, String def) {
        String s = sc.nextLine().trim();
        return s.isEmpty() ? def : s;
    }
    private static void validateTIN(String tin) throws TaxDataException {
        if (tin == null || !tin.matches("\\d{9}")) throw new TaxDataException("TIN must be 9 digits.");
    }
    private static boolean isValidEmail(String e) { return e != null && e.contains("@") && e.indexOf('@')>0 && e.indexOf('@')<e.length()-1; }
}
