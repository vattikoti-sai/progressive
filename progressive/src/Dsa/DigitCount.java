package Dsa;

public class DigitCount {
	public int count(int n) {
		int count=0;
		while(n>0){
			 n=n/10;
			 count+=1;
	}
		
		
		
		return count;
	}

	public static void main(String[] args) {
		
		DigitCount d= new DigitCount();
		int digi_count=d.count(1244);
		if(digi_count==3) {
			System.out.println("your  value is 3 digits");
		}
		else {
			System.out.println(" your value is not 3 digits");
		}
		
	}

}
