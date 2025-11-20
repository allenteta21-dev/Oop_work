package ID_27409.Q1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("STOCK MANAGEMENT SYSTEM");
        System.out.println("ENTITY");
        System.out.print("Please enter id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        if (id <= 0) {
            System.out.println("Invalid id! Must be above zero");
        }
        System.out.print("Enter createdDate egs: 2025-11-19): ");
        String createdDate = scanner.nextLine();
        if (createdDate == null || createdDate.trim().isEmpty()) {
            System.out.println("Invalid createdDate, set to 1970-01-01");
            createdDate = "1970-01-01";
        }
        System.out.print("Enter updatedDate: ");
        String updatedDate = scanner.nextLine();
        if (updatedDate == null || updatedDate.trim().isEmpty()) {
            System.out.println("Invalid updatedDate, set to 1970-01-01");
            updatedDate = "1970-01-01";
        }
        Entity e = new Entity(id, createdDate, updatedDate);

        System.out.println("\nWAREHOUSE");
        System.out.print("warehouseName: ");
        String warehouseName = scanner.nextLine();
        if (warehouseName.trim().isEmpty()) {
            System.out.println("Invalid warehouseName, set to Default Warehouse");
            warehouseName = "Default Warehouse";
        }
        System.out.print("location: ");
        String location = scanner.nextLine();
        if (location.trim().isEmpty()) {
            location = "Unknown";
        }
        System.out.print("phone (10 digits): ");
        String phone = scanner.nextLine();
        if (!phone.matches("\\d{10}")) {
            System.out.println("Invalid phone, set to 0000000000");
            phone = "0000000000";
        }
        Warehouse w = new Warehouse(id, createdDate, updatedDate, warehouseName, location, phone);

        System.out.println("\n=== CATEGORY ===");
        System.out.print("categoryName: ");
        String categoryName = scanner.nextLine();
        if (categoryName.trim().isEmpty()) {
            categoryName = "General";
        }
        System.out.print("categoryCode (>=3 alphanumeric): ");
        String categoryCode = scanner.nextLine();
        if (!categoryCode.matches("[A-Za-z0-9]{3,}")) {
            System.out.println("Invalid code, set to CAT001");
            categoryCode = "CAT001";
        }
        Category c = new Category(id, createdDate, updatedDate, warehouseName, location, phone, categoryName, categoryCode);

        System.out.println("\n=== SUPPLIER ===");
        System.out.print("supplierName: ");
        String supplierName = scanner.nextLine();
        if (supplierName.trim().isEmpty()) {
            supplierName = "Unknown Supplier";
        }
        System.out.print("supplierEmail: ");
        String supplierEmail = scanner.nextLine();
        if (!supplierEmail.contains("@")) {
            System.out.println("Invalid email, set to unknown@supplier.com");
            supplierEmail = "unknown@supplier.com";
        }
        System.out.print("supplierPhone (10 digits): ");
        String supplierPhone = scanner.nextLine();
        if (!supplierPhone.matches("\\d{10}")) {
            System.out.println("Invalid supplier phone, set to 0000000000");
            supplierPhone = "0000000000";
        }
        Supplier s = new Supplier(id, createdDate, updatedDate, warehouseName, location, phone, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone);

        System.out.println("\n=== PRODUCT ===");
        System.out.print("productName: ");
        String productName = scanner.nextLine();
        if (productName.trim().isEmpty()) {
            productName = "Unnamed Product";
        }
        System.out.print("unitPrice (>0): ");
        double unitPrice = readDouble(scanner);
        if (unitPrice <= 0) {
            System.out.println("Invalid price, set to 1.0");
            unitPrice = 1.0;
        }
        System.out.print("stockLimit (>=0): ");
        int stockLimit = readInt(scanner);
        if (stockLimit < 0) {
            System.out.println("Invalid stockLimit, set to 0");
            stockLimit = 0;
        }
        Product p = new Product(id, createdDate, updatedDate, warehouseName, location, phone, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit);

        System.out.println("\n=== STOCK ITEM ===");
        System.out.print("quantityAvailable (>=0): ");
        int quantityAvailable = readInt(scanner);
        if (quantityAvailable < 0) {
            System.out.println("Invalid quantity, set to 0");
            quantityAvailable = 0;
        }
        System.out.print("reorderLevel (>=0): ");
        int reorderLevel = readInt(scanner);
        if (reorderLevel < 0) {
            reorderLevel = 0;
        }
        StockItem si = new StockItem(id, createdDate, updatedDate, warehouseName, location, phone, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable, reorderLevel);

        System.out.println("\n=== PURCHASE ===");
        System.out.print("purchaseDate: ");
        String purchaseDate = scanner.nextLine();
        if (purchaseDate.trim().isEmpty()) {
            purchaseDate = "1970-01-01";
        }
        System.out.print("purchasedQuantity (>0): ");
        int purchasedQuantity = readInt(scanner);
        if (purchasedQuantity <= 0) {
            System.out.println("Invalid purchased quantity, set to 1");
            purchasedQuantity = 1;
        }
        Purchase pur = new Purchase(id, createdDate, updatedDate, warehouseName, location, phone, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable, reorderLevel, purchaseDate, purchasedQuantity, supplierName);

        System.out.println("\n=== SALE ===");
        System.out.print("saleDate: ");
        String saleDate = scanner.nextLine();
        if (saleDate.trim().isEmpty()) {
            saleDate = "1970-01-01";
        }
        System.out.print("soldQuantity (>0): ");
        int soldQuantity = readInt(scanner);
        if (soldQuantity <= 0) {
            System.out.println("Invalid sold quantity, set to 0");
            soldQuantity = 0;
        }
        System.out.print("customerName: ");
        String customerName = scanner.nextLine();
        if (customerName.trim().isEmpty()) {
            customerName = "Anonymous";
        }
        Sale sale = new Sale(id, createdDate, updatedDate, warehouseName, location, phone, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable + purchasedQuantity, reorderLevel, purchaseDate, purchasedQuantity, supplierName, saleDate, soldQuantity, customerName);

        // update stock
        int finalQty = si.getQuantityAvailable() + purchasedQuantity - soldQuantity;
        if (finalQty < 0) {
            finalQty = 0;
        }

        System.out.println("\n=== INVENTORY ===");
        int totalItems = finalQty;
        double stockValue = totalItems * unitPrice;
        Inventory inv = new Inventory(id, createdDate, updatedDate, warehouseName, location, phone, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, finalQty, reorderLevel, totalItems, stockValue);

        System.out.println("\n=== STOCK REPORT ===");
        System.out.print("reportDate: ");
        String reportDate = scanner.nextLine();
        if (reportDate.trim().isEmpty()) {
            reportDate = "1970-01-01";
        }
        System.out.print("remarks: ");
        String remarks = scanner.nextLine();
        StockReport report = new StockReport(id, createdDate, updatedDate, warehouseName, location, phone, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, finalQty, reorderLevel, totalItems, stockValue, reportDate, remarks);

        // display all
        System.out.println("\n--- DISPLAY ALL DATA (QUESTION 1) ---");
        e.display();
        w.display();
        c.display();
        s.display();
        p.display();
        si.setQuantityAvailable(finalQty);
        si.display();
        pur.display();
        sale.display();
        inv.display();
        report.generateReport();

        scanner.close();
    }

    public static int readInt(Scanner scanner) {
        int v = 0;
        boolean ok = false;
        while (!ok) {
            String line = scanner.nextLine();
            try {
                v = Integer.parseInt(line);
                ok = true;
            } catch (Exception ex) {
                System.out.print("Invalid number, enter again: ");
            }
        }
        return v;
    }

    public static double readDouble(Scanner scanner) {
        double v = 0;
        boolean ok = false;
        while (!ok) {
            String line = scanner.nextLine();
            try {
                v = Double.parseDouble(line);
                ok = true;
            } catch (Exception ex) {
                System.out.print("Invalid number, enter again: ");
            }
        }
        return v;
    }
}