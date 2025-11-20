package ID_27409.Q5;

class ClassSession extends Student {
    private String sessionDate;
    private String topic;

    public ClassSession(int id, String cd, String ud, String institutionName, String code, String address, String deptName, String deptCode, String courseName, String courseCode, int credits, String instructorName, String email, String phone, String studentName, String studentID, int age, String sessionDate, String topic) {
        super(id, cd, ud, institutionName, code, address, deptName, deptCode, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age);
        this.sessionDate = (sessionDate == null || sessionDate.isBlank()) ? "1970-01-01" : sessionDate;
        this.topic = (topic == null) ? "" : topic;
    }

    public void display() { System.out.println("ClassSession: date=" + sessionDate + " topic=" + topic); }
}
