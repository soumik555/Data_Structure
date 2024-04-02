package practicemam;

public class Strong {
	
	
	static int fact(int n)
	{
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
			
		}
		return fact;
		
	}

	
	public static void main(String[] args) {
		
		int sum=0;
		int no=145;
		int copy=no;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+fact(rem);
			no=no/10;
			
			
		}
		if(copy==sum)
		{
			System.out.println("Strong number verified:");
		}
		else
		{
			System.out.println("Not a Strong number:");
		}
	}

}