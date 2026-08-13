package DSA;

public class Zerocheck {
	void CheckZero(int [] arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==0) {
				System.out.println(i+"have zero ");
			}
		}
	}

	public static void main(String[] args) {
          
	int[]arr= {0,5,0,4,2,1};
	Zerocheck z= new Zerocheck();
	z.CheckZero(arr);
	
	}
}
