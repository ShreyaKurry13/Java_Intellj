package Basics;

import java.util.Scanner;


public class patterns {

<<<<<<< HEAD
//    static  void patterns(int r,int c){
//        for (int i = 1; i < r; i++) {  // 1
//            for (int j = 0; j < c; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }

    public static void rectangle(int a,int b){
        for (int i = 1; i <=a ; i++) {
            for (int j = 1; j <= b; j++) {
=======
    static  void patterns(int r,int c){
        for (int i = 1; i < r; i++) {  // 1
            for (int j = 0; j < c; j++) {
>>>>>>> a4ff999877026c4b34456378bc86d9b726661a75
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
<<<<<<< HEAD
//     *  *  *  *  *
//     *  *  *  *  *
//     *  *  *  *  *
//     *  *  *  *  *

    public static void rightAngledTriangle(int a){
        for (int i = 1; i <=a ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
//     *
//     *  *
//     *  *  *
//     *  *  *  *

    public static void hollowRectangle(int a,int b){
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <=b; j++) {
                if (i==1 || j==1 || i==a || j==b){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

// *  *  *  *  *
// *           *
// *           *
// *  *  *  *  *

    public static void invertedTriangle(int a){
        for (int i = a; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

=======
>>>>>>> a4ff999877026c4b34456378bc86d9b726661a75

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and cols: ");
        int rows = sc.nextInt();
<<<<<<< HEAD
//        int cols = sc.nextInt();
//        patterns(rows, cols);
//        rectangle(rows,cols);
//        rightAngledTriangle(rows);
//        hollowRectangle(4,5);
        invertedTriangle(rows);
=======
        int cols = sc.nextInt();
        patterns(rows, cols);
>>>>>>> a4ff999877026c4b34456378bc86d9b726661a75
    }
}
