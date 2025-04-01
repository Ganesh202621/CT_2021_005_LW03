package Q_05;


class Course {
    private String courseName;
    private String courseCode;
    private Lecturer lecturer;  // Has-a relationship with Lecturer

    // Default Constructor
    public Course() {
        this.courseName = "Unknown";
        this.courseCode = "None";
        this.lecturer = new Lecturer();
    }

    // Parameterized Constructor
    public Course(String courseName, String courseCode, Lecturer lecturer) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.lecturer = lecturer;
    }

    // Getter and Setter for Course Name
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // Getter and Setter for Course Code
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    // Getter and Setter for Lecturer
    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }


    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        lecturer.displayLecturerInfo();
    }
}


