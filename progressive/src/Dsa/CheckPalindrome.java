package Dsa;
import java.util.Scanner;
public class CheckPalindrome {
	
	static boolean checkpalindrome(int n) {
		int sum=0;
		boolean palindrome=false;
		int original=n;
		for(; n>0;) {
			int rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
			
		}
		if(original == sum) {
			palindrome=true;
		}
		return palindrome;
	}

	public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("enter a number :  ");
       int n = sc.nextInt();
       if(checkpalindrome( n)) {
    	   System.out.println("the number is palindrome ");
    	   
       }
       else {
    	   System.out.println("not palindrome ");
       }
		
	}

}
