package Q_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter Lecturer's Name: ");
        String lecturerName = scanner.nextLine();
        System.out.print("Enter Course Taught by Lecturer: ");
        String lecturerCourse = scanner.nextLine();


        Lecturer lecturer = new Lecturer(lecturerName, lecturerCourse);

        // Get Course details
        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();
        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();


        Course course = new Course(courseName, courseCode, lecturer);


        System.out.print("Enter Student's Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter Student's Degree Name: ");
        String degreeName = scanner.nextLine();

        // Create Student object
        Student student = new Student(studentName, degreeName, courseName);

        // Display Information
        System.out.println("\n ``` Course Information ```");
        course.displayCourseInfo();

        System.out.println("\n ``` Student Information ```");
        student.displayStudentInfo();

        scanner.close();

    }
}
