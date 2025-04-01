package Q_05;

class Student {
    private String studentName;
    private String degreeName;
    private String courseFollowing;

    // Default Constructor
    public Student() {
        this.studentName = "Unknown";
        this.degreeName = "Unknown";
        this.courseFollowing = "None";
    }

    // Parameterized Constructor
    public Student(String studentName, String degreeName, String courseFollowing) {
        this.studentName = studentName;
        this.degreeName = degreeName;
        this.courseFollowing = courseFollowing;
    }

    // Getter and Setter for Student Name
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Getter and Setter for Degree Name
    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    // Getter and Setter for Course Following
    public String getCourseFollowing() {
        return courseFollowing;
    }

    public void setCourseFollowing(String courseFollowing) {
        this.courseFollowing = courseFollowing;
    }

    // Display Student Info
    public void displayStudentInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Degree Program: " + degreeName);
        System.out.println("Enrolled Course: " + courseFollowing);
    }
}
