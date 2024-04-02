package data_structure;
//7 is the answer
public class nthprime {
	public static void main(String[] args) {
		int count=1;
		int n=3;
		for(int i=2;i<=20;i++)
		{
			boolean flag=true;
			int no=i;
			for(int j=2;j<no;j++)
			{
				if(no%j==0)
				{
					flag=false;
					break;
				}
				
			}
			
			if(flag)
			{
				if(n==count)
				{
					System.out.println(no + " is the nth prime number:");
					break;
				}
			}
			else 
			{
				count++;
			}
			
			
		}
		
	}

}
