package Basics;
import java.util.Scanner;



public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathOperations m = new MathOperations();
		Scanner sc = new Scanner(System.in);
		int ch;


		do {
			System.out.println("Welcome to MathOperations !!!");
			System.out.println("------------------------------");
			System.out.printf(" 1.Even or Odd \n 2.Prime number Or Not \n 3.Number Of Digits in the number \n 4.Reverse the Number \n 0.Exit \n");
			System.out.println("\n Enter your choice: ");
		    ch = sc.nextInt();
		    
		    System.out.println("Enter a number: ");
			int num = sc.nextInt();
			
		    switch(ch) {
		   
		    case 1:
		    	m.EvenOdd(num);
		    	break;
		    	
		    case 2:
		    	m.PrimeOrNot(num);
		    	break;
		    	
		    case 3:
		    	m.noOfDigits(num);
		    	break;
		    	
		    case 4:
		    	m.reverseNumber(num);
		    	break;
		    	
		    case 0:
		    	System.out.println("Exiting the code....Bye");
		    	break;	
		    	
		    default:
		    	System.out.println("Wrong Input...");
		    }
		}while(ch!=0);
	}

}
