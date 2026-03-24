
class Person {
    String name;
    int age;

    void getPersonDetails(String n, int a) {
        name = n;
        age = a;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNo;
    String course;

    void getStudentDetails(int r, String c) {
        rollNo = r;
        course = c;
    }


    void displayStudentDetails() {
     
        displayPersonDetails();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

public class EXP8 {
    public static void main(String[] args) {
        Student s = new Student();

        s.getPersonDetails("Govind", 21);
        s.getStudentDetails(101, "Computer Science");

        System.out.println("Student Details:");
        s.displayStudentDetails();
    }
}