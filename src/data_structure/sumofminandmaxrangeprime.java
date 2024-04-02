package data_structure;

public class sumofminandmaxrangeprime {
	
	
	static int maxprime(int sr,int er)
	{
		for(int i=sr;i<=er;i++)
		{
			if(isPrime(i))
			{
				return i;
				
				
				
			}
			
		}
		return 0;
		
	}
	
	static int minprime(int sr,int er)
	{
		for(int i=er-1;i>=sr;i--)
		{
			if(isPrime(i))
			{
				return i;
				
				
				
			}
			
		}
		return 0;
		
		
	}
	
	static boolean isPrime(int no)
	{
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				return false;
				
			}
			
		}
		return true;
		
		
	}
	public static void main(String[] args)
	{
		int max=maxprime(6, 30);
		int min=minprime(6, 30);
		int result=max+min;
		System.out.println(result + " is the sum of minimum and maximum prime number:");
		
	}

}
