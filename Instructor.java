package ID_27409.Q5;

class Instructor extends Course {
    private String instructorName;
    private String email;
    private String phone;

    public Instructor(int id, String cd, String ud, String institutionName, String code, String address, String deptName, String deptCode, String courseName, String courseCode, int credits, String instructorName, String email, String phone) {
        super(id, cd, ud, institutionName, code, address, deptName, deptCode, courseName, courseCode, credits);
        this.instructorName = (instructorName == null || instructorName.isBlank()) ? "Instructor" : instructorName;
        this.email = (email != null && email.contains("@")) ? email : "instructor@inst.edu";
        this.phone = (phone != null && phone.matches("\\d{10}")) ? phone : "0000000000";
    }

    public void display() { System.out.println("Instructor: " + instructorName + " email=" + email + " phone=" + phone); }
}