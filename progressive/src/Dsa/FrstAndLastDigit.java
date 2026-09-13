package Dsa;
import java.util.Scanner;
public class FrstAndLastDigit {
	static void lastAndFrst(int n) {
		int last=n%10;
        int frst=n;
	for(;frst>=10 ;) {
		frst=frst/10;
		}
		
	System.out.println("the last digit is : "+last);
	System.out.println("the frst digit is :"+frst);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc= new Scanner(System.in);
         System.out.println("enter your number : ");
         int n = sc.nextInt();
         lastAndFrst(n);
	
	}

}
