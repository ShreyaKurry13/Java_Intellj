package Basics;

public class MathOperations {

	int count=0;
	int reverse;
	
	public void EvenOdd(int n) {
		if(n%2==0) {
			System.out.println(n+ " is even number");
		}
		else {
			System.out.println(n+ " is odd number");
		}
	}
	
	public void PrimeOrNot(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(n+ " is a prime number");
		}
		else
			System.out.println(n+ " is not a prime number");
	}
	
	public void noOfDigits(int n) {
		int temp=n;
		while(n>0) {
			n= n/10;
			count++;
		}
		System.out.println(temp+ " is a " + count+" digit number ");
	}
	
	public void reverseNumber(int n) {
		int temp = n;
        while(n!=0) {
        	int rem = n%10;
        	reverse = reverse *10 + rem;
        	n=n/10;
        }
        System.out.println(reverse+ " is the reversed number of "+temp);
	}
}
