package ID_27409.Q4;

import java.util.Scanner;

public class ProcurementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PROCUREMENT SYSTEM (Q4) ===");

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
        if (orgCode.length() < 3) { System.out.println("Invalid orgCode, using ORG"); orgCode = "ORG"; }
        System.out.print("contactEmail: ");
        String contactEmail = sc.nextLine().trim();
        if (!isValidEmail(contactEmail)) { System.out.println("Invalid email, using contact@org.com"); contactEmail = "contact@org.com"; }
        System.out.print("address: ");
        String address = readNonEmpty(sc, "Unknown Address");

        System.out.println("\n--- DEPARTMENT ---");
        System.out.print("deptName: ");
        String deptName = readNonEmpty(sc, "Dept");
        System.out.print("deptCode (>=3 alphanumeric): ");
        String deptCode = sc.nextLine().trim();
        if (!deptCode.matches("[A-Za-z0-9]{3,}")) { System.out.println("Invalid deptCode, using D01"); deptCode = "D01"; }

        System.out.println("\n--- SUPPLIER ---");
        System.out.print("supplierName: ");
        String supplierName = readNonEmpty(sc, "SupplierCo");
        System.out.print("supplierTIN (9 digits): ");
        String supplierTIN = sc.nextLine().trim();
        if (!supplierTIN.matches("\\d{9}")) { System.out.println("Invalid TIN, using 000000000"); supplierTIN = "000000000"; }
        System.out.print("supplierContact (10 digits): ");
        String supplierContact = sc.nextLine().trim();
        if (!supplierContact.matches("\\d{10}")) { System.out.println("Invalid contact, using 0000000000"); supplierContact = "0000000000"; }

        System.out.println("\n--- PRODUCT ---");
        System.out.print("productName: ");
        String productName = readNonEmpty(sc, "Product");
        System.out.print("unitPrice (>0): ");
        double unitPrice = readDouble(sc);
        if (unitPrice <= 0) { System.out.println("Invalid price, set to 1.0"); unitPrice = 1.0; }
        System.out.print("quantity (>=0): ");
        int quantity = readInt(sc);
        if (quantity < 0) { System.out.println("Invalid qty, set to 0"); quantity = 0; }

        System.out.println("\n--- PURCHASE ORDER ---");
        System.out.print("poNumber: ");
        String poNumber = readNonEmpty(sc, "PO000");
        System.out.print("orderDate: ");
        String orderDate = readNonEmpty(sc, "1970-01-01");
        double totalAmount = unitPrice * quantity;

        System.out.println("\n--- DELIVERY ---");
        System.out.print("deliveryDate: ");
        String deliveryDate = readNonEmpty(sc, "1970-01-01");
        System.out.print("deliveredBy: ");
        String deliveredBy = readNonEmpty(sc, "Courier");

        System.out.println("\n--- INSPECTION ---");
        System.out.print("inspectorName: ");
        String inspectorName = readNonEmpty(sc, "Inspector");
        System.out.print("status (Passed/Failed): ");
        String status = sc.nextLine().trim();
        if (!("Passed".equalsIgnoreCase(status) || "Failed".equalsIgnoreCase(status))) { System.out.println("Invalid status, using Passed"); status = "Passed"; }
        System.out.print("remarks: ");
        String remarks = sc.nextLine().trim();

        System.out.println("\n--- INVOICE ---");
        System.out.print("invoiceNo: ");
        String invoiceNo = readNonEmpty(sc, "INV000");
        System.out.print("invoiceAmount (>0): ");
        double invoiceAmount = readDouble(sc);
        if (invoiceAmount <= 0) { System.out.println("Invalid amount, using PO total"); invoiceAmount = totalAmount; }

        // instantiate chain
        Organization org = new Organization(id, createdDate, updatedDate, orgName, orgCode, address, contactEmail);
        Department dept = new Department(id, createdDate, updatedDate, orgName, orgCode, address, contactEmail, deptName, deptCode);
        Supplier supplier = new Supplier(id, createdDate, updatedDate, orgName, orgCode, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, supplierContact);
        Product product = new Product(id, createdDate, updatedDate, orgName, orgCode, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, supplierContact, productName, unitPrice, quantity);
        PurchaseOrder po = new PurchaseOrder(id, createdDate, updatedDate, orgName, orgCode, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, supplierContact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount);
        Delivery delivery = new Delivery(id, createdDate, updatedDate, orgName, orgCode, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, supplierContact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy);
        Inspection inspection = new Inspection(id, createdDate, updatedDate, orgName, orgCode, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, supplierContact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy, inspectorName, status, remarks);
        Invoice invoice = new Invoice(id, createdDate, updatedDate, orgName, orgCode, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, supplierContact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy, inspectorName, status, remarks, invoiceNo, invoiceAmount);
        ProcurementReport report = new ProcurementReport(id, createdDate, updatedDate, orgName, orgCode, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, supplierContact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy, inspectorName, status, remarks, invoiceNo, invoiceAmount, readNonEmpty(sc, "1970-01-01"), "Summary not provided");

        System.out.println("\n--- DISPLAY (Q4) ---");
        org.display();
        dept.display();
        supplier.display();
        product.display();
        po.display();
        delivery.display();
        inspection.display();
        invoice.display();
        report.display();

        System.out.printf("Procurement report total (single invoice): %.2f%n", report.calculateTotal());

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
    private static boolean isValidEmail(String e) { return e != null && e.contains("@") && e.indexOf('@')>0 && e.indexOf('@')<e.length()-1; }
}
