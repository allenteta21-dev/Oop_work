package ID_27409.Q5;

class LeaveRequest extends AttendanceRecord {
    private String requestDate;
    private String reason;
    private boolean approved;

    public LeaveRequest(int id, String cd, String ud, String institutionName, String code, String address, String deptName, String deptCode, String courseName, String courseCode, int credits, String instructorName, String email, String phone, String studentName, String studentID, int age, String sessionDate, String topic, String studentIDRef, String sessionID, String status, String requestDate, String reason, boolean approved) {
        super(id, cd, ud, institutionName, code, address, deptName, deptCode, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age, sessionDate, topic, studentIDRef, sessionID, status);
        this.requestDate = (requestDate == null || requestDate.isBlank()) ? "1970-01-01" : requestDate;
        this.reason = (reason == null) ? "" : reason;
        this.approved = approved;
    }

    public void display() { System.out.println("LeaveRequest: date=" + requestDate + " reason=" + reason + " approved=" + approved); }
}