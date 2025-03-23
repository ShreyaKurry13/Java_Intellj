package LinkedList;

import java.util.Scanner;

public class Linked_list_Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linear_Linked_List_class list = new Linear_Linked_List_class();
        list.create_list();
        int choice, value;

        do {
            System.out.println("\n--- Linked List Menu ---");
            System.out.println("1. Insert Left");
            System.out.println("2. Insert Right");
            System.out.println("3. Delete Left");
            System.out.println("4. Delete Right");
            System.out.println("5. Print List");
            System.out.println("6. Search Element");
            System.out.println("7. Delete Element");
            System.out.println("8. Insert After An Element");
            System.out.println("9. Length Of List");
            System.out.println("10. Sort List");
            System.out.println("11. Reversing List");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at left: ");
                    value = sc.nextInt();
                    list.insert_left(value);
                    break;
                case 2:
                    System.out.print("Enter value to insert at right: ");
                    value = sc.nextInt();
                    list.insert_right(value);
                    break;
                case 3:
                    list.delete_left();
                    break;
                case 4:
                    list.delete_right();
                    break;
                case 5:
                    list.print_list();
                    break;
                case 6:
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();
                    list.search_list(value);
                    break;
                case 7:
                    System.out.print("Enter element to delete: ");
                    value = sc.nextInt();
                    list.delete_element(value);
                    break;
                case 8:
                    System.out.print("Enter ref and new data ");
                    int ref = sc.nextInt();
                    int element=sc.nextInt();
                    list.insert_after(ref,element);
                    break;
                case 9:
                    System.out.println("\nLenght is:"+list.length());
                    break;
                case 10:
                    list.print_list();
                    list.sort_list();
                    list.print_list();
                    break;
                case 11:
                    list.print_list();
                    list.revers_list();
                    list.print_list();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);

    }
}