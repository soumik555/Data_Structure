package Test2;

public class Array1 {
	
	static int sum2(int nums[])
	{
		int sum=0;
		
		sum=nums[0]+nums[1];
		
		return sum;
		
	}
	
public static void main(String[] args) 
{
	int nums[]= {1,1,1};
	
	
	System.out.println(sum2(nums));
	
}
}
