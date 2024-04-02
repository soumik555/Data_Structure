package Test2;

class Array2
{
	@SuppressWarnings("unlikely-arg-type")
	public static boolean hello(int[] nums)
	{
		int a[]=new int[nums.length];
		if(nums.equals(a))
		{
			return true;
			
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		
		int nums[]= {2,1};
		System.out.println(hello(nums));
		
	}
	
	
	
}

