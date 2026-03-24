class Student {
    int rollNo;
    String name;
    double marks;

    // Parameterized Constructor
    Student(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    // Member function to display details
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("-----------------------");
    }
}

public class Exp5 {
    public static void main(String[] args) {

        // Creating objects using parameterized constructor
        Student s1 = new Student(101, "Govind", 85.5);
        Student s2 = new Student(102, "Rahul", 90.0);

        // Calling member function
        s1.display();
        s2.display();
    }
}