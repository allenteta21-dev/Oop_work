package ID_27409.Q5;

class Student extends Instructor {
    private String studentName;
    private String studentID;
    private int age;

    public Student(int id, String cd, String ud, String institutionName, String code, String address, String deptName, String deptCode, String courseName, String courseCode, int credits, String instructorName, String email, String phone, String studentName, String studentID, int age) {
        super(id, cd, ud, institutionName, code, address, deptName, deptCode, courseName, courseCode, credits, instructorName, email, phone);
        this.studentName = (studentName == null || studentName.isBlank()) ? "Student" : studentName;
        this.studentID = (studentID == null || studentID.isBlank()) ? "S000" : studentID;
        this.age = age > 0 ? age : 18;
    }

    public void display() { System.out.println("Student: " + studentName + " ID=" + studentID + " age=" + age); }
}