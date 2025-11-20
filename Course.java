package ID_27409.Q5;

class Course extends Department {
    private String courseName;
    private String courseCode;
    private int credits;

    public Course(int id, String cd, String ud, String institutionName, String code, String address, String deptName, String deptCode, String courseName, String courseCode, int credits) {
        super(id, cd, ud, institutionName, code, address, deptName, deptCode);
        this.courseName = (courseName == null || courseName.isBlank()) ? "Course" : courseName;
        this.courseCode = (courseCode == null || courseCode.isBlank()) ? "C01" : courseCode;
        this.credits = credits > 0 ? credits : 1;
    }

    public void display() { System.out.println("Course: " + courseName + " code=" + courseCode + " credits=" + credits); }
}