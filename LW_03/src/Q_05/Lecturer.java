package Q_05;

class Lecturer {
    private String lecturerName;
    private String courseTeaching;

    // Constructor
    public Lecturer() {
        this.lecturerName = "Unknown";
        this.courseTeaching = "None";
    }

    // Parameterized Constructor
    public Lecturer(String lecturerName, String courseTeaching) {
        this.lecturerName = lecturerName;
        this.courseTeaching = courseTeaching;
    }

    // Getter and Setter for Lecturer Name
    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    // Getter and Setter for Course Teaching
    public String getCourseTeaching() {
        return courseTeaching;
    }

    public void setCourseTeaching(String courseTeaching) {
        this.courseTeaching = courseTeaching;
    }


    public void displayLecturerInfo() {
        System.out.println("Lecturer Name: " + lecturerName);
        System.out.println("Course Teaching: " + courseTeaching);
    }
}
