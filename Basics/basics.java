package Basics;

import java.util.Scanner;

public class basics {

    //1-->Q7
    static void average(int n1,int n2,int n3){
        int sum = n1+n2+n3 ;
        float avg = sum/3;
        System.out.println("The average is: "+avg);
    }

    //1--> 9
    static void factorial(int n1){
        int fact=1;
        for (int i = 1; i <=n1 ; i++) {
              fact*=i;
        }
        System.out.println("The factorial of "+n1+" is: "+fact);
    }

    //1--> 10
    static void reverseNumber(int n1){
        int rev=0;
      while (n1!=0){            // 123       12     1
          int rem = n1%10;      //  3      2    1
          rev = rev*10 + rem;    //3     2    1
          n1/=10;                 // 123/10 ---> 12    12--->1   1/10--->0
      }
        System.out.println("The reverse is: "+rev);
    }

    //2-->3
    static void isLeapyear(int n){
        if (n%4==0 && n%100!=0){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not leap year");
        }
    }

    //2-->5
    static char grade(int n){
       if (n>=90 && n<=100) {
           return 'A';
       }
       else if (n>=80 && n<=89) {
           return 'B';
       }
       else if (n>=70 && n<=79) {
           return 'C';
       }
       else if (n>=60 && n<=69) {
           return 'D';
       }else {
           return 'F';
       }
    }

    //2-->6
    static void vowelChecker(char n){
        if (n=='a' || n=='e' || n=='i' || n=='o' || n=='u' || n=='A' || n=='E' || n=='I' || n=='O' || n=='U') {
            System.out.println("Vowel");
        }
        else {
            System.out.println("Not vowel");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a year: ");
//        System.out.println("Enter the student's score");
        System.out.println("Enter a letter: ");
//        int n = sc.nextInt();
          char n = sc.next().toLowerCase().charAt(0);
//        int n2 = sc.nextInt();
//        int n3 = sc.nextInt();

//        factorial(n1);
//        average(n1,n2,n3);
//        reverseNumber(n1);

//        isLeapyear(n);

//        char g = grade(n);
//        System.out.println("Grade: "+g);

        vowelChecker(n);
    }
}
