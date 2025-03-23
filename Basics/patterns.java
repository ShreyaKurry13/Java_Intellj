package Basics;

import java.util.Scanner;


public class patterns {

    static  void patterns(int r,int c){
        for (int i = 1; i < r; i++) {  // 1
            for (int j = 0; j < c; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and cols: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        patterns(rows, cols);
    }
}
