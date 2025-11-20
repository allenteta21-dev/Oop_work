package ID_27409.Q5;

import java.util.Scanner;

public class AttendanceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== ATTENDANCE SYSTEM (Q5) ===");

        System.out.print("id (int > 0): ");
        int id = readInt(sc);

        System.out.print("createdDate (yyyy-mm-dd): ");
        String createdDate = readNonEmpty(sc, "1970-01-01");
        System.out.print("updatedDate (yyyy-mm-dd): ");
        String updatedDate = readNonEmpty(sc, "1970-01-01");

        System.out.println("\n--- INSTITUTION ---");
        System.out.print("institutionName: ");
        String institutionName = readNonEmpty(sc, "My Institution");
        System.out.print("institutionCode (>=3 chars): ");
        String institutionCode = sc.nextLine().trim();
        if (institutionCode.length() < 3) institutionCode = "INST";
        System.out.print("address: ");
        String address = readNonEmpty(sc, "Unknown Address");

        System.out.println("\n--- DEPARTMENT ---");
        System.out.print("deptName: ");
        String deptName = readNonEmpty(sc, "Dept");
        System.out.print("deptCode (>=3 alnum): ");
        String deptCode = sc.nextLine().trim();
        if (!deptCode.matches("[A-Za-z0-9]{3,}")) deptCode = "D01";

        System.out.println("\n--- COURSE ---");
        System.out.print("courseName: ");
        String courseName = readNonEmpty(sc, "Course");
        System.out.print("courseCode: ");
        String courseCode = readNonEmpty(sc, "C01");
        System.out.print("credits (>0): ");
        int credits = readInt(sc);
        if (credits <= 0) credits = 1;

        System.out.println("\n--- INSTRUCTOR ---");
        System.out.print("instructorName: ");
        String instructorName = readNonEmpty(sc, "Instructor");
        System.out.print("instructorEmail: ");
        String instructorEmail = sc.nextLine().trim();
        if (!isValidEmail(instructorEmail)) instructorEmail = "instructor@inst.edu";
        System.out.print("instructorPhone (10 digits): ");
        String instructorPhone = sc.nextLine().trim();
        if (!instructorPhone.matches("\\d{10}")) instructorPhone = "0000000000";

        System.out.println("\n--- STUDENT ---");
        System.out.print("studentName: ");
        String studentName = readNonEmpty(sc, "Student");
        System.out.print("studentID: ");
        String studentID = readNonEmpty(sc, "S000");
        System.out.print("age (>0): ");
        int age = readInt(sc);
        if (age <= 0) age = 18;

        System.out.println("\n--- CLASS SESSION ---");
        System.out.print("sessionDate (yyyy-mm-dd): ");
        String sessionDate = readNonEmpty(sc, "1970-01-01");
        System.out.print("topic: ");
        String topic = readNonEmpty(sc, "General");

        System.out.println("\n--- ATTENDANCE RECORD ---");
        System.out.print("status (Present/Absent): ");
        String status = sc.nextLine().trim();
        if (!("Present".equalsIgnoreCase(status) || "Absent".equalsIgnoreCase(status))) status = "Absent";

        System.out.println("\n--- LEAVE REQUEST (optional) ---");
        System.out.print("leaveRequested (yes/no): ");
        String leaveReq = sc.nextLine().trim();
        String requestDate = "1970-01-01";
        String reason = "";
        boolean approved = false;
        if ("yes".equalsIgnoreCase(leaveReq)) {
            System.out.print("requestDate: ");
            requestDate = readNonEmpty(sc, "1970-01-01");
            System.out.print("reason: ");
            reason = readNonEmpty(sc, "No reason");
            System.out.print("approved (true/false): ");
            approved = Boolean.parseBoolean(sc.nextLine().trim());
        }

        System.out.println("\n--- ATTENDANCE SUMMARY ---");
        System.out.print("reportDate: ");
        String reportDate = readNonEmpty(sc, "1970-01-01");
        System.out.print("totalPresent (int >=0): ");
        int totalPresent = readInt(sc);
        if (totalPresent < 0) totalPresent = 0;
        System.out.print("totalAbsent (int >=0): ");
        int totalAbsent = readInt(sc);
        if (totalAbsent < 0) totalAbsent = 0;

        // instantiate chain
        Institution inst = new Institution(id, createdDate, updatedDate, institutionName, institutionCode, address);
        Department dept = new Department(id, createdDate, updatedDate, institutionName, institutionCode, address, deptName, deptCode);
        Course course = new Course(id, createdDate, updatedDate, institutionName, institutionCode, address, deptName, deptCode, courseName, courseCode, credits);
        Instructor instructor = new Instructor(id, createdDate, updatedDate, institutionName, institutionCode, address, deptName, deptCode, courseName, courseCode, credits, instructorName, instructorEmail, instructorPhone);
        Student student = new Student(id, createdDate, updatedDate, institutionName, institutionCode, address, deptName, deptCode, courseName, courseCode, credits, instructorName, instructorEmail, instructorPhone, studentName, studentID, age);
        ClassSession session = new ClassSession(id, createdDate, updatedDate, institutionName, institutionCode, address, deptName, deptCode, courseName, courseCode, credits, instructorName, instructorEmail, instructorPhone, studentName, studentID, age, sessionDate, topic);
        AttendanceRecord ar = new AttendanceRecord(id, createdDate, updatedDate, institutionName, institutionCode, address, deptName, deptCode, courseName, courseCode, credits, instructorName, instructorEmail, instructorPhone, studentName, studentID, age, sessionDate, topic, studentID, "SESSION001", status);
        LeaveRequest lr = new LeaveRequest(id, createdDate, updatedDate, institutionName, institutionCode, address, deptName, deptCode, courseName, courseCode, credits, instructorName, instructorEmail, instructorPhone, studentName, studentID, age, sessionDate, topic, studentID, "SESSION001", status, requestDate, reason, approved);
        AttendanceSummary summary = new AttendanceSummary(id, createdDate, updatedDate, institutionName, institutionCode, address, deptName, deptCode, courseName, courseCode, credits, instructorName, instructorEmail, instructorPhone, studentName, studentID, age, sessionDate, topic, studentID, "SESSION001", status, requestDate, reason, approved, reportDate, totalPresent, totalAbsent);

        // display
        inst.display();
        dept.display();
        course.display();
        instructor.display();
        student.display();
        session.display();
        ar.display();
        lr.display();
        summary.display();

        System.out.printf("Attendance rate: %.2f%%\n", summary.generateSummary());

        sc.close();
    }

    private static int readInt(Scanner sc) {
        while (true) {
            String s = sc.nextLine().trim();
            try { return Integer.parseInt(s); } catch (Exception e) { System.out.print("Enter a valid integer: "); }
        }
    }

    private static String readNonEmpty(Scanner sc, String def) {
        String s = sc.nextLine().trim();
        return s.isEmpty() ? def : s;
    }

    private static boolean isValidEmail(String e) { return e != null && e.contains("@") && e.indexOf('@')>0 && e.indexOf('@')<e.length()-1; }
}