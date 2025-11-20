package ID_27409.Q5;

class AttendanceSummary extends LeaveRequest {
    private String reportDate;
    private int totalPresent;
    private int totalAbsent;

    public AttendanceSummary(int id, String cd, String ud, String institutionName, String code, String address, String deptName, String deptCode, String courseName, String courseCode, int credits, String instructorName, String email, String phone, String studentName, String studentID, int age, String sessionDate, String topic, String studentIDRef, String sessionID, String status, String requestDate, String reason, boolean approved, String reportDate, int totalPresent, int totalAbsent) {
        super(id, cd, ud, institutionName, code, address, deptName, deptCode, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age, sessionDate, topic, studentIDRef, sessionID, status, requestDate, reason, approved);
        this.reportDate = (reportDate == null || reportDate.isBlank()) ? "1970-01-01" : reportDate;
        this.totalPresent = totalPresent >= 0 ? totalPresent : 0;
        this.totalAbsent = totalAbsent >= 0 ? totalAbsent : 0;
    }

    // returns attendance rate as percentage
    public double generateSummary() {
        int totalSessions = totalPresent + totalAbsent;
        if (totalSessions == 0) return 0.0;
        return (totalPresent * 100.0) / totalSessions;
    }

    public void display() { System.out.println("AttendanceSummary: reportDate=" + reportDate + " present=" + totalPresent + " absent=" + totalAbsent); }
}