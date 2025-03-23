package StudentManagementSystem;

public class Student  {

    int rollNumber;
    String name;
    String grade;
    Student next;

    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        this.next = null;
    }
}




