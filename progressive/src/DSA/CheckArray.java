package DSA;

public class CheckArray {
	boolean status;
	public boolean unlucky1(int[] nums) {
		  int i=nums.length-1;
		  int j=nums.length-2;
		  if(nums.length<2){
		    return false;
		  }
		  
		  if(nums[0] ==1 && nums[1]==3||nums[1]==1 && nums[2]==3){
		   
		      return true;
		                              
		                           }
		  if(nums[j]==1 && nums[i]==3){
		    return true;
		    
		  }
		            
		              return false;
		            
		}
	public static void main(String args[]) {
		CheckArray ca= new CheckArray();
		int []arr= {1,3,5,6};
		ca.status=ca.unlucky1(arr);
		System.err.println(ca.status);
		
		
	}

}
