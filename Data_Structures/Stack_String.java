package Data_Structures;

import java.util.Scanner;

public class Stack_String {
	public static void main(String[] args) {
	  
	  StackClass_Char s = new StackClass_Char();
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a string: ");
	  String str = sc.nextLine();
	  
	  s.create_stack(str.length());
	  
	  for(int i=0;i<str.length();i++) {
		  s.push(str.charAt(i));
	  }
	  
	  System.out.println("The reversed string is: ");
	  
	  while(s.isEmpty()!=true) {
		  System.out.print(s.pop());
	  }
		
	}
}