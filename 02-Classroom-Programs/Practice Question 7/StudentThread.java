class StudentThread extends Thread {
    public void run() {
        String[] students = {
            "Rahul",
            "Priya",
            "Arjun",
            "Sneha",
            "Kiran"
        };

        System.out.println("Names of 5 Students:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}

class CourseThread extends Thread {
    public void run() {
        String[] courses = {
            "Java",
            "Python",
            "Database",
            "Web Development",
            "Computer Networks"
        };

        System.out.println("Names of 5 Courses:");
        for (String course : courses) {
            System.out.println(course);
        }
    }
}

public class StudentCourseManagement {
    public static void main(String[] args) {

        StudentThread thread1 = new StudentThread();
        CourseThread thread2 = new CourseThread();

        // Start both threads concurrently
        thread1.start();
        thread2.start();
    }
}
