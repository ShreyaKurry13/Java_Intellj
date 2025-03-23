package Basics;

import java.util.Scanner;

public class strings_practice {


    //Q1
    static void checkString(String[] a, String s) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(s)) {
                count++;
            }
        }

        System.out.println("The count of the target word " + s + " is: " + count);
    }

    static void print_array(String s[]) {
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }

    //Q2
    static void checkStringLength(String[] a) {

        String max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > max.length()) {
               max= a[i];
            }
        }
        System.out.println("The longest word of the array is:"+max);
    }

    //Q3
    static void palindrome(String []a) {
        for (int i = 0; i < a.length; i++) {
        }
        System.out.println("The longest word of the array is:");
    }

    public static void main(String[] args) {

//        String[] arr = {"apple", "banana", "apple", "orange", "apple"};
//        String[] arr = {"short", "longer", "verylongstring", "mid"};

        String[] arr = {"abc", "def", "ghi"};
        Scanner sc = new Scanner(System.in);
        print_array(arr);
//        System.out.println("\nEnter a target string: ");
//        String s = sc.next();

//        checkString(arr, s);
//        checkStringLength(arr);

        palindrome(arr);
    }
}