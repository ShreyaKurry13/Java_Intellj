package Basics;

import java.util.Scanner;

public class Hello {

    private static void createA2DArray() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter element at ["+i+"] and ["+j+"] :");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        /*
        for (int i = rows-1; i >=0; i--) {
            for (int j = cols-1; j >= 0; j--) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }*/

    }
    
    
    public static void main(String[] args) {
        /*String s = "Shreya ";

        for (int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
        */

        /*
        int [] arr = {10,20,30,40,50};

        for(int i= arr.length-1;i>= 0;i--){
            System.out.println(arr[i]);
        }
*/

        
        createA2DArray();
        
    }

    
}
