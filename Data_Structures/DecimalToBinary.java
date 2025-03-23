package Data_Structures;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackClass s = new StackClass();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		s.create_stack(20);
		
		while(num >0) { // 10 5
			s.push(num%2); // 0 1
			num = num /2; // 5 
		}
		
		System.out.println("Binary representation: ");
		while(s.isEmpty()!=true) {
			System.out.print(s.pop());
		}
	}

}