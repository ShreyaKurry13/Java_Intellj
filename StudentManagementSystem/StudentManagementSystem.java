package StudentManagementSystem;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentLinkedList studentList = new StudentLinkedList();

        int choice;
        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Print All Students");
            System.out.println("5. Update Student Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine();  // Consume newline left-over
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Grade: ");
                    String grade = scanner.nextLine();
                    studentList.addStudent(rollNumber, name, grade);
                    break;
                case 2:
                    System.out.print("Enter Roll Number to search: ");
                    rollNumber = scanner.nextInt();
                    studentList.searchStudent(rollNumber);
                    break;
                case 3:
                    System.out.print("Enter Roll Number to delete: ");
                    rollNumber = scanner.nextInt();
                    studentList.deleteStudent(rollNumber);
                    break;
                case 4:
                    studentList.printAllStudents();
                    break;
                case 5:
                    System.out.print("Enter Roll Number to update: ");
                    rollNumber = scanner.nextInt();
                    scanner.nextLine();  // Consume newline left-over
                    System.out.print("Enter new Name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new Grade: ");
                    grade = scanner.nextLine();
                    studentList.updateStudentDetails(rollNumber, name, grade);
                    break;
                case 6:
                    System.out.println("Exiting Student Management System...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
        } while (choice != 6);

        scanner.close();
    }
}

