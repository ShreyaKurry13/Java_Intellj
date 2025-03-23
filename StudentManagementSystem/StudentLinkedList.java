package StudentManagementSystem;

public class StudentLinkedList {
    Student root;

    public StudentLinkedList() {
        this.root = null;
    }


     void addStudent(int rollNumber, String name, String grade) {
        Student newStudent = new Student(rollNumber, name, grade);
        if (root == null) {
            root = newStudent;
        } else {
            Student current = root;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newStudent;
        }
        System.out.println("Student added successfully.");
    }


     void printAllStudents() {
        if (root == null) {
            System.out.println("Student list is empty.");
            return;
        }
        System.out.println("Student List:");
        Student current = root;
        while (current != null) {
            System.out.println("Roll Number: " + current.rollNumber + "| Name: " + current.name + "| Grade: " + current.grade);
            current = current.next;
        }
    }

     void searchStudent(int rollNumber) {
        Student current = root;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                System.out.println("Student found:");
                System.out.println("Roll Number: " + current.rollNumber);
                System.out.println("Name: " + current.name);
                System.out.println("Grade: " + current.grade);
                return;
            }
            current = current.next;
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

     void deleteStudent(int rollNumber) {
        if (root == null) {
            System.out.println("Student list is empty.");
            return;
        }
        if (root.rollNumber == rollNumber) {
            root = root.next;
            System.out.println("Student with Roll Number " + rollNumber + " deleted successfully.");
            return;
        }
        Student current = root;
        Student prev = null;
        while (current != null && current.rollNumber != rollNumber) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Student with Roll Number " + rollNumber + " not found.");
        } else {
            prev.next = current.next;
            System.out.println("Student with Roll Number " + rollNumber + " deleted successfully.");
        }
    }


     void updateStudentDetails(int rollNumber, String newName, String newGrade) {
        Student current = root;
         if (root == null) {
             System.out.println("Student list is empty.");
             return;
         }
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                current.name = newName;
                current.grade = newGrade;
                System.out.println("Student details updated successfully.");
                return;
            }
            current = current.next;
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }



}
