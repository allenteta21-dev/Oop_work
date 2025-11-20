package ID_27409.Q5;

class AttendanceRecord extends ClassSession {
    private String studentIDRef;
    private String sessionID;
    private String status; // Present/Absent

    public AttendanceRecord(int id, String cd, String ud, String institutionName, String code, String address, String deptName, String deptCode, String courseName, String courseCode, int credits, String instructorName, String email, String phone, String studentName, String studentID, int age, String sessionDate, String topic, String studentIDRef, String sessionID, String status) {
        super(id, cd, ud, institutionName, code, address, deptName, deptCode, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age, sessionDate, topic);
        this.studentIDRef = (studentIDRef == null) ? "" : studentIDRef;
        this.sessionID = (sessionID == null) ? "" : sessionID;
        this.status = ("Present".equalsIgnoreCase(status) || "Absent".equalsIgnoreCase(status)) ? status : "Absent";
    }

    public String getStatus() { return status; }
    public void display() { System.out.println("AttendanceRecord: studentRef=" + studentIDRef + " session=" + sessionID + " status=" + status); }
}