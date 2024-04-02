package data_structure;

public class Factorialfetch {
	public static void main(String[] args) {
		int no=897;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			no=no/10;
			
			int fact=1;
			for(int i=rem;i>=1;i-- )
			{
				fact=fact*i;
			  
				
			}
			System.out.println("factorial of " + rem + "=" + fact );
				
			
			
		}
		
		
		
	}

}
