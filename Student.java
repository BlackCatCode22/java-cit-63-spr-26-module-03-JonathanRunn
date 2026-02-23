package mystudent;

public class Student {
    public String firstName;
    public String lastName;
    public double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public void printInfo() {
        System.out.println(firstName + " " + lastName + " has a GPA of " + gpa);
    }
}