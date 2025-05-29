package Basics;

import java.util.Scanner;

public class Basics1 {

<<<<<<< HEAD
    static void isArmstrong(int n){
        int length=0;
        int arm = 0;
        int temp = n;

        while (n!=0){
            n=n/10;
            length++;
        }
        System.out.println("Length: " +length);

        temp =n;

        while (temp>0){
            int mul=1;
            int rem = temp%10;
            for (int i = 1; i <= length; i++) {
                mul = mul *rem;
            }
            arm = arm +mul;
            n= n/10;
        }

        if (temp == arm){
            System.out.println(n+ " is Armstrong");
        }else {
            System.out.println(n+" not Armstrong");
        }

=======
    static void triangle(int s1,int s2,int s3){
        
>>>>>>> a4ff999877026c4b34456378bc86d9b726661a75
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
        System.out.println("Enter a number: ");
        int n = sc.nextInt();


        isArmstrong(n);

=======
>>>>>>> a4ff999877026c4b34456378bc86d9b726661a75
    }
}
