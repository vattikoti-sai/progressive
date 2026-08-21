package DSA;

public class MaxOfFirst3Elements {
	int number;
	int max;
	public int max (int[]arr) {
		max=arr[0];
		if(arr[0]>arr[1]&&arr[0]>arr[2]) {
			return arr[0];
		}
		else if(arr[1]>arr[0]&&arr[1]>arr[2]) {
			return arr[1];
		}
		else {
			return arr[2];
		}
		
		
	}
	public static void main(String args[]) {
		MaxOfFirst3Elements m= new MaxOfFirst3Elements();
		int[]arr= {1,2,3,4,5};
		m.number=m.max(arr);
		System.out.println(m.number);
	}
}
